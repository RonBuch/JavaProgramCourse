package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDelitionTests extends TestBase {

    @Test
    public void delitionFirstOneUser() {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData(
                    "Mike", "Vlad", "Kryz",
                    "My Address", "8800755000",
                    "mail@mail.mail", "test1"), true);

        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().clickOnDeleteButton();
        app.getContactHelper().acceptAlert();
        app.getNavigationHelper().goToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }


//    @Test()
//    public void delitionAllUsers() {
//        app.getNavigationHelper().goToHomePage();
//        app.getAddUserHelper().selectAllUsers();
//        app.getAddUserHelper().clickOnDeleteButton();
//        app.getAddUserHelper().acceptAlert();
//        app.logout();
//    }
}
