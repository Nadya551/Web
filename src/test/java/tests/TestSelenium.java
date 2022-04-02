package tests;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class TestSelenium {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void test() {
    driver.get("https://it.easyum.ru/");
    driver.manage().window().setSize(new Dimension(880, 775));
    driver.findElement(By.id(".top_order")).click();
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 .uname > .wpcf7-form-control")).click();
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 .uname > .wpcf7-form-control")).sendKeys("тест");
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 .utel > .wpcf7-form-control")).click();
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 .utel > .wpcf7-form-control")).sendKeys("6789876556789");
    driver.findElement(By.cssSelector("select")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("select"));
      dropdown.findElement(By.xpath("//option[. = 'IT Продакт менеджер']")).click();
    }
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 .uemail > .wpcf7-form-control")).click();
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 .uemail > .wpcf7-form-control")).sendKeys("test@mail.ru");
    driver.findElement(By.cssSelector("#wpcf7-f496-o2 p > .wpcf7-form-control")).click();
  }

}
