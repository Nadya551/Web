package app;

import app.Booking.Main;
import app.pages.*;
import easyum.Contact;

public class App {

    public LoginPage loginPage;
    public UserPage userPage;
    public TaskPage taskPage;
    public RegistrationUsersPage registrationUsersPage;
    public Main main;
    public AvtorizationPage avtorizationPage;
    public Contact contact;

    public App(){
        loginPage = PageBuilder.buildLoginPage();
        userPage = PageBuilder.buildUserPage();
        taskPage = PageBuilder.buildTaskPage();
        registrationUsersPage = PageBuilder.buildRegistrationUserPage();
        main = PageBuilder.buildMain();
        avtorizationPage = PageBuilder.buildAvtorizationPage();
        contact = PageBuilder.buildContact();

    }


}
