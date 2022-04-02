package utils;
import java.sql.*;

public class DBtest {
    static String sqlSelect = "SELECT* FROM users";
    static String connectionUrl = "jdbs:mysql://94.73.150.229/db_ann_test?serverTimeZone=UTS";

    public static String getBD(){
        try {
            Connection conn = DriverManager.getConnection(connectionUrl,"db_ann_test", "NIod27D6SYlc29O");
            PreparedStatement ps = conn.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String name = rs.getString("name");
                String lastName = rs.getString("surname");

                return name+lastName;
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
            return "error" + throwables.getMessage();
        }
        return "null";
    }

}
