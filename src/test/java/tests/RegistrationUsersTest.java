package tests;

import app.App;
import org.testng.annotations.Test;
import utils.NewUser;

public class RegistrationUsersTest extends BaseTest{
    private NewUser.User user = NewUser.createUsers();

    @Test
    public void registration(){

        app.registrationUsersPage.open();
        user = NewUser.createUsers();
        app.registrationUsersPage.fieldName.setValue("Nadya");
        app.registrationUsersPage.fieldEmail.setValue("nadya@123.ru");
        app.registrationUsersPage.fieldPassword.setValue("12345");
        app.registrationUsersPage.buttonReg.click();

    }
}
