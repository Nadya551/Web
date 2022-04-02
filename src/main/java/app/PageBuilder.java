package app;

import app.Booking.Main;
import app.pages.*;
import easyum.Contact;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");

    }

    public static UserPage buildUserPage() {
        return new UserPage("");

    }

    public static TaskPage buildTaskPage() {
        return new TaskPage("/task/index.html");

    }

    public static RegistrationUsersPage buildRegistrationUserPage() {
        return new RegistrationUsersPage("/user/login/index.html");
    }

    public static Main buildMain(){
        return new Main("");
    }

    public static AvtorizationPage buildAvtorizationPage() {
        return new AvtorizationPage("/user/login/index.html");

    }
    public static Contact buildContact(){
        return new Contact("/contact/");
    }


}
