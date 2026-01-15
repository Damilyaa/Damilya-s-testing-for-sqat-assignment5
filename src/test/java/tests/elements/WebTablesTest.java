package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test
    public void testEditWebTable() {
        var webTablesPage = homePage.goToElements().clickWebTables();
        String email = "cierra@example.com";
        webTablesPage.clickEditButton(email);
        webTablesPage.setFirstName("Damilya");
        webTablesPage.setLastName("Amangeldykyzy");
        webTablesPage.setAge("20");
        webTablesPage.clickSubmitButton();

        String actualName = webTablesPage.getTableFirstName(email);
        String expectedName = "Damilya";

        Assert.assertEquals(actualName, expectedName, "actual and expected names do not match");


    }
}
