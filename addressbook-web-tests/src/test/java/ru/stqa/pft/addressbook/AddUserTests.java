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
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.id("LoginForm")).submit();
  }

  @Test
  public void testAddUser() {

    goToAddNewUserPage();
    inputFirstName("Kilo");
    inputMiddleName("Gramm");
    inputLastName("Mini");
    inputNickName("1tonn");
    inputTitle("Title");
    inputCompanyName("Cjvpany");
    inputAddress("Address 1");
    inputHome("Sweet");
    inputMobilePhoneNumber("Yes");
    inputWorkPhoneNumber("Yes");
    inputFaxNumber("+1705674673");
    inputEmail1("Email@mail.com");
    inputEmail2("mail@mail.ty");
    inputEmail3("Hotmail@hotmail.com");
    inputUserHomepage("www.leningradspb.ru");
    inputBirthDate("9", "January", "1990");
    inputAnniverseryDate("17", "October", "2020");
    inputSecondAddress("Address 2");
    inputSecondHomePhoneNumber("Home2");
    inputSecondNotes("Some notes here");
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

  private void inputSecondNotes(String noteText) {
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys(noteText);
  }

  private void inputSecondHomePhoneNumber(String secondPhoneNumber) {
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys(secondPhoneNumber);
  }

  private void inputSecondAddress(String address2) {
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys(address2);
  }

  private void inputAnniverseryDate(String day, String month, String yaer) {
    wd.findElement(By.name("aday")).click();
    new Select(wd.findElement(By.name("aday"))).selectByVisibleText(day);
    wd.findElement(By.name("amonth")).click();
    new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(month);
    wd.findElement(By.name("ayear")).click();
    wd.findElement(By.name("ayear")).clear();
    wd.findElement(By.name("ayear")).sendKeys(yaer);
  }

  private void inputBirthDate(String day, String month, String yaer) {
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(day);
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(month);
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(yaer);
  }

  private void inputUserHomepage(String homePageAdress) {
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys(homePageAdress);
  }

  private void inputEmail3(String email3) {
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys(email3);
  }

  private void inputEmail2(String email2) {
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys(email2);
  }

  private void inputEmail1(String email1) {
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(email1);
  }

  private void inputFaxNumber(String faxNumber) {
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys(faxNumber);
  }

  private void inputWorkPhoneNumber(String workPhoneNumber) {
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(workPhoneNumber);
  }

  private void inputMobilePhoneNumber(String mobilePhoneNumber) {
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(mobilePhoneNumber);
  }

  private void inputHome(String homePhoneNumber) {
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(homePhoneNumber);
  }

  private void inputAddress(String address) {
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(address);
  }

  private void inputCompanyName(String companyName) {
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(companyName);
  }

  private void inputTitle(String titleText) {
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(titleText);
  }

  private void inputNickName(String NickName) {
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(NickName);
  }

  private void inputLastName(String lastname) {
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(lastname);
  }

  private void inputMiddleName(String middleName) {
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(middleName);
  }

  private void inputFirstName(String firstName) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(firstName);
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
