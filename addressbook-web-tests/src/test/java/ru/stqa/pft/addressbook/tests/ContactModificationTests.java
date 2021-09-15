package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModidfication (){
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactModidfication();
        app.getContactHelper().fillUserForm(new ContactData("Ike", "Ben","Tri", "New Adderess",null, null, null), false);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().goToHomePageInAddUserPage();
    }
}
