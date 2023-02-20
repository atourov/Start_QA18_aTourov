import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumStart {
    WebDriver wd;
    String str;
    int i;

    public void nonStatic(){
        System.out.println(this.i);
    }
    @BeforeMethod
    public void preCondition(){
        System.out.println("Open website");
        wd = new ChromeDriver();

    }
    @Test
    public void testLogin(){

    }
    @AfterMethod
    public void postCondition(){

    }
}
