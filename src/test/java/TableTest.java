import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

    WebDriver tbl;
    @BeforeMethod
    public void preCondition(){
        tbl = new ChromeDriver();
        tbl.get("https://www.w3schools.com/css/css_table.asp");
        System.out.println("table test is ready so start");
    }
@Test
    public void HW2(){
    List<WebElement> rows = tbl.findElements(By.cssSelector("#customers tr"));
    System.out.println(rows.size());
    List<WebElement> columns = tbl.findElements(By.cssSelector("#customers tr:nth-child(2) td"));
    System.out.println(columns.size());

    WebElement row3 = tbl.findElement(By.cssSelector("#customers tr:nth-child(4)"));

    WebElement lastColumn = tbl.findElement(By.cssSelector("#customers tr td:last-child"));

}
}

