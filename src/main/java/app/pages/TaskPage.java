package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.NewUser;

import static com.codeborne.selenide.Selenide.$;

public class TaskPage extends BasePage{
//    private NewUser.User user = NewUser.createUsers();


    public TaskPage(String pageUrl) {
        super(pageUrl);
    }

    public SelenideElement submitButton = $(By.xpath("(//input[@type='submit'])[2]"));
}
