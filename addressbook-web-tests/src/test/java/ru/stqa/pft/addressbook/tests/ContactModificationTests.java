package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModidfication (){
        app.getNavigationHelper().goToHomePage();
        app.getAddUserHelper().initContactModidfication();
        app.getAddUserHelper().fillUserForm(new ContactData("Ike", "Ben","Tri", "New Adderess",null, null, null), false);
        app.getAddUserHelper().submitContactCreation();
        app.getAddUserHelper().goToHomePageInAddUserPage();
    }
}
