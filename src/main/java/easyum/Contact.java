package easyum;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Contact extends BasePage {
    public Contact(String pageUrl) {
        super(pageUrl);
    }
    public SelenideElement nameC = $(By.name("uname"));
    public SelenideElement telC = $(By.name("utel"));
    public SelenideElement emailC = $(By.name("uemail"));
    public SelenideElement message = $(By.name("umessage"));
    public SelenideElement buttonRed = $(By.xpath("(//input[@type='submit'])[1]"));

}
