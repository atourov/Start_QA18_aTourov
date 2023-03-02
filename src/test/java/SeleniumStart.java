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
        wd.findElement(By.tagName("script"));
        wd.findElement(By.xpath("//script"));
        wd.findElement(By.id("root"));
        wd.findElement(By.className("container"));


        List<WebElement> elements = wd.findElements(By.tagName("a"));
//        System.out.println(elements.size());
        wd.findElements(By.cssSelector("a"));
        wd.findElements(By.cssSelector("div>a"));
        List<WebElement> xPathTagName = wd.findElements(By.xpath("//a"));
            System.out.println(xPathTagName.size());


        List<WebElement> phoneBookClass = wd.findElements(By.className("navbar-component_nav__1X_4m"));
            System.out.println(phoneBookClass.size());
        wd.findElements(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
        wd.findElements(By.cssSelector(".navbar-component_nav__1X_4m"));
        wd.findElements(By.xpath("//navbar-component_nav__1X_4m"));


        List<WebElement> phoneBookLinkedText = wd.findElements(By.linkText("LOGIN"));
        System.out.println(phoneBookLinkedText.size());
        List<WebElement> cssLogin = wd.findElements(By.cssSelector("div>a:last-child"));
        System.out.println(cssLogin.size());

        List<WebElement> phoneBookPartial = wd.findElements(By.partialLinkText("OG"));
            System.out.println(phoneBookPartial.size());
        wd.findElements(By.cssSelector("OG"));
        List<WebElement> xPathText = wd.findElements(By.xpath("//*[text()='LOGIN']"));
            System.out.println(xPathText.size());
        //wd.findElements(By.cssSelector("[*=OG]"));




    }

    @AfterMethod
    public void postCondition() {

    }
}
