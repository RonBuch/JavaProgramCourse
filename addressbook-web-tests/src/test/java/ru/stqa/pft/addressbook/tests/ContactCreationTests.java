package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testAddUserTests() throws Exception {

        app.getContactHelper().initAddUser();
        app.getContactHelper().createContact(new ContactData(
                "Mike", "Vlad", "Kryz",
                "My Address", "8800755000",
                "mail@mail.mail", "test1"), true);
    }

}