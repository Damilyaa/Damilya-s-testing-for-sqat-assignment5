package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test
    public void testEditWebTable() {
        var webTablesPage = homePage.goToElements().clickWebTables();
        webTablesPage.clickEditButton("cierra@example.com");
        webTablesPage.setFirstName("Damilya");
        webTablesPage.setLastName("Amangeldykyzy");
        webTablesPage.setAge("20");
        webTablesPage.clickSubmitButton();

        String actualName = webTablesPage.getTableFirstName("cierra@example.com");
        String expectedName = "Damilya";

        Assert.assertEquals(actualName, expectedName, "actual and expected names do not match");


    }
}
