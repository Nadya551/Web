package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserPage extends BasePage{

    //создание нового пользователя

    public UserPage(String pageUrl) {
        super(pageUrl);
    }
    public SelenideElement addUser = $(By.className("btn btn-danger"));
    public SelenideElement nameField = $(By.xpath("(//input[@name='noibiz_name'])"));
    public SelenideElement emailField = $(By.xpath("(//input[@name='noibiz_email'])"));
    public SelenideElement passwordField = $(By.name("noibiz_password"));
    public SelenideElement birthdayField = $(By.name("noibiz_birthday"));
    public SelenideElement genderField = $(By.name("noibiz_gender"));
    public SelenideElement createField = $(By.name("act_create"));
}
