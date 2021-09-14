package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddUserData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModidfication (){
        app.getNavigationHelper().goToHomePage();
        app.getAddUserHelper().initContactModidfication();
        app.getAddUserHelper().fillUserForm(new AddUserData("Ike", "Ben","Tri", "New Adderess","89003004545", "newmail@mail.ru", null), false);
        app.getAddUserHelper().submitContactCreation();
        app.getAddUserHelper().goToHomePageInAddUserPage();
    }
}
