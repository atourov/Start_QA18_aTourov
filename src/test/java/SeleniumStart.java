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
//        wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://ilcarro.web.app/search");
//        wd.navigate().forward();
//        wd.navigate().back();
//        wd.findElement(By.className("container"));

    }

    @Test
    public void testLogin() {
//        System.out.println("Test is over");
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        List<WebElement> elCarroClass = wd.findElements(By.className("navigation-link"));
        System.out.println(elCarroClass.size());
//        List<WebElement> phoneBookClass = wd.findElements(By.className("active"));
//        System.out.println(phoneBookClass.size());
//
//        WebElement phoneBookClass1 = wd.findElement(By.className("container"));
//
//        List<WebElement> phoneBookLinkedText = wd.findElements(By.linkText("LOGIN"));
//        System.out.println(phoneBookLinkedText.size());
//
//        List<WebElement> phoneBookPartial = wd.findElements(By.partialLinkText("O"));
//        System.out.println(phoneBookPartial.size());
//
//        WebElement phoneBookID = wd.findElement(By.id("root"));
//        System.out.println(phoneBookID);

        List<WebElement> elCarroID = wd.findElements(By.id("1"));
        System.out.println(elCarroID.size());



    }

    @AfterMethod
    public void postCondition() {
//        wd.close();
//        wd.quit();
//        WebElement element = wd.findElement(By.tagName("a"));
//        List<WebElement> elements = (List<WebElement>) wd.findElement(By.tagName("a"));
//        System.out.println(elements.size());

    }
}
