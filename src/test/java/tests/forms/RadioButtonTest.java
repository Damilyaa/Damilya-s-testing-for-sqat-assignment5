package tests.forms;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioSelected = formsPage.isFemaleRadioButtonSelected();
        assertTrue(isFemaleRadioSelected, "\n Female Radio button is not selected \n");
    }
}
