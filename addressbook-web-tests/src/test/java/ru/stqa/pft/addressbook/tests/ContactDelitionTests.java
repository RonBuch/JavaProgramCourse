package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

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
        app.getContactHelper().selectFirstUserInList();
        app.getContactHelper().clickOnDeleteButton();
        app.getContactHelper().acceptAlert();
        app.logout();

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
