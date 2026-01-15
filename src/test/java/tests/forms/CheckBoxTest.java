package tests.forms;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();
        formsPage.unclickReadingHobbyCheckbox();

        boolean isReadingCheckBoxSelected = formsPage.isReadingSelected();
        assertFalse(isReadingCheckBoxSelected, "\n 'Reading' Check Box is selected \n");

    }
}
