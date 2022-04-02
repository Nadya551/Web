package app.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public SelenideElement loginField = $(byName("username"));
    public SelenideElement passwordField = $(byName("password"));
    public SelenideElement submitButton = $(byXpath("//button[@type='submit']"));


    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    @Step("Авторизоваться с помощью логин={email} и пароль={password}")
    public void login(String email, String password) {
        loginField.setValue(email);
        passwordField.setValue(password);
        submitButton.click();
    }

}
