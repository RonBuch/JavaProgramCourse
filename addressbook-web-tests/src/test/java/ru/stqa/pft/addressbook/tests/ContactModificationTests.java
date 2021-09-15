package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModidfication (){
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData(
                    "Mike", "Vlad", "Kryz",
                    "My Address", "8800755000",
                    "mail@mail.mail", "test1"), true);

        }
        app.getContactHelper().initContactModidfication();
        app.getContactHelper().fillUserForm(new ContactData("Ike", "Ben","Tri", "New Adderess",null, null, null), false);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().goToHomePageInAddUserPage();
    }
}
