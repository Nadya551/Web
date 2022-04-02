package tests;

import org.testng.annotations.Test;


public class  ExampleTest extends BaseTest
{
    @Test
    public void loginViaEmail() {
        app.loginPage.open();
        app.loginPage.login("mail", "test123");

    }
}
