import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class SeleniumStart {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Open website");
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
//        wd.navigate().to("c");
//        wd.navigate().forward();
//        wd.navigate().back();

    }

    @Test
    public void testLogin() {
//        System.out.println("Test is over");
        WebElement element = wd.findElement(By.tagName("script"));
        WebElement phoneBookID = wd.findElement(By.id("root"));
        WebElement phoneBookClass1 = wd.findElement(By.className("container"));


        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        List<WebElement> phoneBookClass = wd.findElements(By.className("active"));
        System.out.println(phoneBookClass.size());

        List<WebElement> phoneBookLinkedText = wd.findElements(By.linkText("LOGIN"));
        System.out.println(phoneBookLinkedText.size());

        List<WebElement> phoneBookPartial = wd.findElements(By.partialLinkText("O"));
        System.out.println(phoneBookPartial.size());





    }

    @AfterMethod
    public void postCondition() {

    }
}
