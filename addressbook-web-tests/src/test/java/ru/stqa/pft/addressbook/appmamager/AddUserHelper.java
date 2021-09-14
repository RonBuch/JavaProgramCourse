package ru.stqa.pft.addressbook.appmamager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

    public void fillUserForm(AddUserData addUserData, boolean creation) {
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
        type(By.name("email2"), addUserData.getEmailAddress2());
        type(By.name("email3"), addUserData.getEmailAddress3());
        type(By.name("homepage"), addUserData.getHomepage());
//        click(By.name("bday"));
//        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(addUserData.getBirthDay());
//        click(By.name("bmonth"));
//        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(addUserData.getBirthMonth());
//        type(By.name("byear"), addUserData.getBirthYear());
//        click(By.name("aday"));
//        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(addUserData.getAnniversaryDay());
//        click(By.name("amonth"));
//        click(By.name("amonth"));
//        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(addUserData.getAnniversaryMonth());
//        type(By.name("ayear"), addUserData.getAnniversaryYear());
        type(By.name("address2"), addUserData.getSecondAddress());
        type(By.name("phone2"), addUserData.getSecondPhoneNumber());
        type(By.name("notes"), addUserData.getNotes());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(addUserData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

      }


    public void initAddUser() {
        click(By.linkText("add new"));

    }

    public void initContactModidfication() {
        click(By.xpath("//img[@alt='Edit']"));

    }


    public void clickOnDeleteButton() {
        click(By.xpath("//input[@value='Delete']"));

    }

    public void selectAllUsers() {
        click(By.id("MassCB"));

    }

    public void goToHomePageInAddUserPage() {
        click(By.linkText("home page"));

    }

    public void selectFirstUserInList() {
        click(By.xpath("//input[@id][1]"));
    }

    public void submitContactCreation () {
        click(By.xpath("//input[@value = 'Update'][2]"));
    }
}
