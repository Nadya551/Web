package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AvtorizationPage extends BasePage{
    public AvtorizationPage(String pageUrl) {
        super(pageUrl);

    }
    //авторизация
    public SelenideElement email = $(By.name("login"));
    public SelenideElement password = $(By.name("password"));
    public SelenideElement autorization = $(By.xpath("//input[@class = 'btn btn-danger'])[1]"));
    public SelenideElement addUser = $(By.className("btn btn-danger"));

}
