package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * Класс для работы с .properties файлами
 */
public class UtilsMethod {

    /**
     * Возвращает значение поля из файла userData.properties
     *
     * @param value название поля в .properties файле
     * @return возвращает String значение поля
     */
    public static String getValue(String value) {
        Properties properties = new Properties();
        try {
            properties.load(UtilsMethod.class.getClassLoader().getResourceAsStream("testUrl.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data = properties.getProperty(value);
        try {
            data = new String(data.getBytes(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
