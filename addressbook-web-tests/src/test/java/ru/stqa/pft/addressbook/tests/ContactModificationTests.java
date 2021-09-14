package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddUserData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModidfication (){
        app.getNavigationHelper().goToHomePage();
        app.getAddUserHelper().initContactModidfication();
        app.getAddUserHelper().fillUserForm(new AddUserData("Mike",
 "Vlad",
 null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null,
null), false);
        app.getAddUserHelper().submitContactCreation();
        app.getAddUserHelper().goToHomePageInAddUserPage();
    }
}
