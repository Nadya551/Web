package app.Booking;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Main extends BasePage {
    public Main(String pageUrl) {
        super(pageUrl);
    }

    public SelenideElement firstField = $(By.xpath("//input[@id = 'ss']"));
    public SelenideElement dates = $(By.xpath("//span[@class = 'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']"));
    public SelenideElement dropDown = $(By.xpath("//ul[@role = 'listbox']"));
    public SelenideElement calendar = $(By.xpath("(//div[@class = 'bui-calendar__wrapper'])[1]"));
    public SelenideElement puple = $(By.xpath("//span[@class = 'xp__guests__count']"));


    {

    }
}

