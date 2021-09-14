package ru.stqa.pft.addressbook.appmamager;

import org.openqa.selenium.By;
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
        click(By.name("submit"));
    }

    public void fillUserForm(AddUserData addUserData, boolean creation) {
        type(By.name("firstname"), addUserData.getFirstName());
        type(By.name("middlename"), addUserData.getMiddleName());
        type(By.name("lastname"), addUserData.getLastName());
        type(By.name("address"), addUserData.getFirstAddress());
        type(By.name("mobile"), addUserData.getMobilePhoneNumber());
        type(By.name("email"), addUserData.getEmailAddress1());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(addUserData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }




        public void initAddUser () {
            click(By.linkText("add new"));

        }

        public void initContactModidfication () {
            click(By.xpath("//img[@alt='Edit']"));

        }


        public void clickOnDeleteButton () {
            click(By.xpath("//input[@value='Delete']"));

        }

        public void selectAllUsers () {
            click(By.id("MassCB"));

        }

        public void goToHomePageInAddUserPage () {
            click(By.linkText("home page"));

        }

        public void selectFirstUserInList () {
            click(By.xpath("//input[@id][1]"));
        }

        public void submitContactCreation () {
            click(By.xpath("//input[@value = 'Update'][2]"));
        }
    }


