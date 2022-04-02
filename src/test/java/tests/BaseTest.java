package tests;

import app.App;
import com.codeborne.selenide.testng.TextReport;
import helpers.Driver;
import listeners.Interceptor;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners({TextReport.class, Interceptor.class})
public class BaseTest {

    protected App app;
    protected SoftAssert softAssert;

    @BeforeTest
    public void setUp() {

        Driver.initDriver();

        app = new App();
        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void clear() {
        Driver.clearCookies();
    }

    @AfterClass
    public void tearDown() {
        Driver.close();
    }
}