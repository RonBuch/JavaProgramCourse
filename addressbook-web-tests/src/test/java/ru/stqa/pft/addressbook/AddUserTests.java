package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddUserTests {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login();
  }

  private void login() {
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.id("LoginForm")).submit();
  }

  @Test
  public void testAddUser() {

    goToAddNewUserPage();
    inputFirstName();
    inputMiddleName();
    inputLastName();
    inputNickName();
    inputTitle();
    inputCompanyName();
    inputAddress();
    inputHome();
    inputMobilePhoneNumber();
    inputWorkPhoneNumber();
    inputFaxNumber();
    inputEmail1();
    inputEmail2();
    inputEmail3();
    inputUserHomepage();
    inputBirthDate();
    inputAnniverseryDate();
    inputSecondAddress();
    inputSecondHomePhoneNumber();
    inputSecondNotes();
    clicOnEnterButton();
    goToHomePage();
    clickSelectAllCheckBox();
    clickDeleteButton();
    acceptAllertWindow();
    logOut();
  }

  private void logOut() {
    wd.findElement(By.linkText("Logout")).click();
  }

  private void acceptAllertWindow() {
    wd.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    wd.switchTo().alert().accept();
  }

  private void clickDeleteButton() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }

  private void clickSelectAllCheckBox() {
    wd.findElement(By.id("MassCB")).click();
  }

  private void goToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  private void clicOnEnterButton() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void inputSecondNotes() {
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys("Some notes here");
  }

  private void inputSecondHomePhoneNumber() {
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys("Home2");
  }

  private void inputSecondAddress() {
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys("Address 2");
  }

  private void inputAnniverseryDate() {
    wd.findElement(By.name("aday")).click();
    new Select(wd.findElement(By.name("aday"))).selectByVisibleText("17");
    wd.findElement(By.name("amonth")).click();
    new Select(wd.findElement(By.name("amonth"))).selectByVisibleText("October");
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).clear();
    wd.findElement(By.name("ayear")).sendKeys("2020");
  }

  private void inputBirthDate() {
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText("9");
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText("January");
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys("1990");
  }

  private void inputUserHomepage() {
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys("www.leningradspb.ru");
  }

  private void inputEmail3() {
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys("Hotmail@hotmail.com");
  }

  private void inputEmail2() {
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys("mail@mail.ty");
  }

  private void inputEmail1() {
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("Email@mail.com");
  }

  private void inputFaxNumber() {
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys("+1705674673");
  }

  private void inputWorkPhoneNumber() {
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys("Yes");
  }

  private void inputMobilePhoneNumber() {
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("Yes");
  }

  private void inputHome() {
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("Sweet");
  }

  private void inputAddress() {
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("Address 1");
  }

  private void inputCompanyName() {
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys("Cjvpany");
  }

  private void inputTitle() {
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys("Title");
  }

  private void inputNickName() {
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("1tonn");
  }

  private void inputLastName() {
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("Mini");
  }

  private void inputMiddleName() {
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys("Gramm");
  }

  private void inputFirstName() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Kilo");
  }

  private void goToAddNewUserPage() {
    wd.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}
