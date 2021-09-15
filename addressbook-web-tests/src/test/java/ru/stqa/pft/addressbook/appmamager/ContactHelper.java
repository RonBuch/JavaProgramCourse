package ru.stqa.pft.addressbook.appmamager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void acceptAlert() {
        wd.switchTo().alert().accept();
    }

    public void clickEnter() {
        click(By.id("content"));
        click(By.name("submit"));
    }

    public void fillUserForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getFirstAddress());
        type(By.name("mobile"), contactData.getMobilePhoneNumber());
        type(By.name("email"), contactData.getEmailAddress1());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
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

    public void createContact(ContactData contact, boolean creation) {
        initAddUser();
        fillUserForm(contact, creation);
        clickEnter();
        goToHomePageInAddUserPage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}


