package tests;

import app.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;

public class BookPage extends BaseTest {
    @Test
    public void test(){
        app.main.open();
        app.main.firstField.click();
        app.main.dropDown.getWrappedElement().findElement(byText("Москва"));
        app.main.dates.click();
       // app.main.calendar.getWrappedElement().findElement(byAttribute("data-date","2022-01-21")).click();
        app.main.calendar.getWrappedElement().findElement(byXpath("(//span[@role = 'checkbox'])[21]"));
       // app.main.calendar.getWrappedElement().findElement(byText("21")).click();
        //app.main.calendar.getWrappedElement().findElement(byText("21 Январь 2022"));
        app.main.puple.click();
       // app.main.puple.getWrappedElement().findElement(byAttribute("bui-button__text","+")).click();



    }




}
