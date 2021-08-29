
package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class GroupCreationTests {
    private WebDriver dw;


    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        dw = new ChromeDriver();
        dw.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testGroupCreation() throws Exception {
        dw.get("https://localhost/addressbook/group.php");
        dw.findElement(By.name("user")).click();
        dw.findElement(By.name("user")).clear();
        dw.findElement(By.name("user")).sendKeys("admin");
        dw.findElement(By.name("pass")).clear();
        dw.findElement(By.name("pass")).sendKeys("secret");
        dw.findElement(By.xpath("//input[@value='Login']")).click();
        dw.findElement(By.linkText("groups")).click();
        dw.findElement(By.name("new")).click();
        dw.findElement(By.name("group_name")).click();
        dw.findElement(By.name("group_name")).clear();
        dw.findElement(By.name("group_name")).sendKeys("test1");
        dw.findElement(By.name("group_header")).clear();
        dw.findElement(By.name("group_header")).sendKeys("test2");
        dw.findElement(By.name("group_footer")).clear();
        dw.findElement(By.name("group_footer")).sendKeys("test3");
        dw.findElement(By.name("submit")).click();
        dw.findElement(By.linkText("group page")).click();
        dw.findElement(By.linkText("Logout")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        dw.quit();
    }


    private boolean isElementPresent(By by) {
        try {
            dw.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            dw.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
