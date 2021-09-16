package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTests extends TestBase {


    @Test
    public void testAddUserTests() throws Exception {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initAddUser();
        app.getContactHelper().createContact(new ContactData(
                "Mike", "Vlad", "Kryz",
                "My Address", "8800755000",
                "mail@mail.mail", "test1"), true);
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}