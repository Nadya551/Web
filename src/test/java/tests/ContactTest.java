package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest{
    @Test
    public void contactUs(){
        app.contact.open();
        app.contact.nameC.setValue("Nadya");
        app.contact.nameC.shouldHave(Condition.exactValue("Nadya"));
        app.contact.telC.setValue("1111111111");
        app.contact.telC.shouldHave(Condition.exactValue("1111111111"));
        app.contact.emailC.setValue("nadya555");
        app.contact.emailC.shouldHave(Condition.exactValue("nadya555"));
        app.contact.message.setValue("Hello");
        app.contact.message.shouldHave(Condition.exactValue("Hello"));
        app.contact.buttonRed.click();



    }
}
