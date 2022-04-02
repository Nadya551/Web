package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationUsersPage extends BasePage {
    public RegistrationUsersPage(String pageUrl) {
        super(pageUrl);
    }
    // регистрация нового пользователя
    public SelenideElement fieldName = $(By.name("name"));
    public SelenideElement fieldEmail = $(By.name("email"));
    public SelenideElement fieldPassword = $(By.name("password"));
           // $(By.xpath(("//input[@name='password'][2]"));
            //$(By.name("password"));
            //(By.xpath("([@name='password'])[2]"));
    public SelenideElement buttonReg = $(By.name("act_register_now"));
}
