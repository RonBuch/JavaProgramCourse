package ru.stqa.pft.addressbook.appmamager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.AddUserData;

public class AddUserHelper extends HelperBase {


    public AddUserHelper(WebDriver wd) {
    super(wd);
    }

    public void acceptAlert() {
        wd.switchTo().alert().accept();
    }

    public void clickEnter() {
        click(By.id("content"));
        click(By.xpath("//div[@id='content']/form/input[21]"));


    }

    public void fillUserForm(AddUserData addUserData) {
        type(By.name("firstname"), addUserData.getFirstName());
        type(By.name("middlename"), addUserData.getMiddleName());
        type(By.name("lastname"), addUserData.getLastName());
        type(By.name("nickname"), addUserData.getNickName());
        type(By.name("title"), addUserData.getTitle());
        type(By.name("company"), addUserData.getCompanyName());
        type(By.name("address"), addUserData.getFirstAddress());
        type(By.name("home"), addUserData.getHomePhoneNumber());
        type(By.name("mobile"), addUserData.getMobilePhoneNumber());
        type(By.name("work"), addUserData.getWorkPhoneNumber());
        type(By.name("fax"), addUserData.getFaxPhoneNumber());
        type(By.name("email"), addUserData.getEmailAddress1());
        type(By.name("email2"),addUserData.getEmailAddress2());
        type(By.name("email3"),addUserData.getEmailAddress3());
        type(By.name("homepage"), addUserData.getHomepage());

        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("bday")).click();
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(addUserData.getBirthDay());
        wd.findElement(By.name("bmonth")).click();
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(addUserData.getBirthMonth());
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(addUserData.getBirthYear());
        wd.findElement(By.name("aday")).click();
        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(addUserData.getAnniversaryDay());
        wd.findElement(By.name("amonth")).click();
        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(addUserData.getAnniversaryMonth());
        wd.findElement(By.name("ayear")).click();
        wd.findElement(By.name("ayear")).clear();
        wd.findElement(By.name("ayear")).sendKeys(addUserData.getAnniversaryYear());
        wd.findElement(By.name("theform")).click();

        type(By.name("address2"), addUserData.getSecondAddress());
        type(By.name("phone2"), addUserData.getSecondPhoneNumber());
        type(By.name("notes"), addUserData.getNotes());

    }

    public void initAddUser() {
        click(By.linkText("add new"));

    }

    public void deleteAllUsers() {
        click(By.xpath("//input[@value='Delete']"));

    }

    public void selectAllUsers() {
     click(By.id("MassCB"));

    }

    public void goToHomePageInAddUserPage() {
        click(By.linkText("home page"));
        
    }
}
