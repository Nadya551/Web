package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.*;
import static helpers.Driver.open;

public class TestWithoutPO {

    @BeforeClass
    public static void setup() {
        Configuration.browser = "chrome";
        // WebDriverManager.chromedriver().browserVersion("94.0.4147.30").setup();
        Configuration.browserSize = "1000x1000";
        Configuration.baseUrl = "https://it.easyum.ru/";
        Configuration.timeout = 10000;
    }

    @AfterClass
    public static void close() {
        closeWebDriver();
    }


    @Test
    public void first() {
        open(Configuration.baseUrl);
        SelenideElement buttonOrder = $(By.xpath("//button[@class='red_btn top_order open_order_modal']"));
        buttonOrder.click();
        SelenideElement nameField = $(By.xpath("(//input[@name='uname'])[2]"));
        nameField.sendKeys("test");
        SelenideElement telField = $(By.xpath("(//input[@name='utel'])[2]"));
        telField.setValue("45678909876545");
        SelenideElement emailField = $(By.xpath("(//input[@name='uemail'])[2]"));
        emailField.setValue("test@mail.ru");
        SelenideElement submitButton = $(By.xpath("(//input[@type='submit'])[2]"));
        submitButton.click();

    }
    @Test
    public void registration(){
        open("http://users.bugred.ru/user/login/index.html");
        SelenideElement nameFieledId = $(By.name("name"));
        nameFieledId.setValue("name777");
        SelenideElement emailFiled = $(By.name("email"));
        emailFiled.setValue("name777@mail.ru");
        SelenideElement passwordlFiled = $(By.xpath("//input[@name='password'])[2]"));
        emailFiled.setValue("name123");
        SelenideElement buttonRegistret = $(By.name("act_register_now"));
        buttonRegistret.click();
    }

    @Test
    public void vernut(){
        open("http://users.bugred.ru/user/login/index.html");
        SelenideElement emailFiled = $(By.name("email"));
        emailFiled.getValue();
        SelenideElement passwordlFiled = $(By.xpath("//input[@name='password'])[2]"));
        emailFiled.getValue();

    }

    }




