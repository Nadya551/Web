package tests;

import org.testng.annotations.Test;
import utils.NewUser;

import static helpers.Driver.open;

public class UserTest extends BaseTest{

    @Test
    public void registration(){
      //  open("http://users.bugred.ru/user/login/index.html");

        app.registrationUsersPage.open();
      //  user = NewUser.createUsers();
        app.registrationUsersPage.fieldName.setValue("Nadya");
        app.registrationUsersPage.fieldEmail.setValue("nadya@123.ru");
        app.registrationUsersPage.fieldPassword.setValue("12345");
        app.registrationUsersPage.buttonReg.click();


    }
    @Test(dependsOnMethods = "registration")
    public void autorization(){
        app.avtorizationPage.open();
        app.avtorizationPage.email.setValue("nadya@123.ru");
        app.avtorizationPage.password.setValue("12345");
        app.avtorizationPage.autorization.click();
        app.avtorizationPage.addUser.click();



    }
    @Test
    public void addUser(){
        app.userPage.open();
        app.userPage.addUser.click();
        app.userPage.nameField.setValue("Nadya");
        app.userPage.emailField.setValue("nadya@123.ru");
        app.userPage.passwordField.setValue("12345");
        app.userPage.birthdayField.setValue("12.12.1988");
        app.userPage.genderField.setValue("Женский");
        app.userPage.createField.click();
    }


}
