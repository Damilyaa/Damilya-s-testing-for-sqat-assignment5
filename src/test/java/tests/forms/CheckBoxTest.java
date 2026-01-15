package tests.forms;

import base.BaseTest;
import static org.testng.Assert.*;

import listeners.TestListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.elements.WebTablesTest;

@Listeners(TestListener.class)
public class CheckBoxTest extends BaseTest {
    private static final Logger logger =
            LogManager.getLogger(CheckBoxTest.class);

    @Test
    public void testCheckBox() {
        logger.info("Test starting: testCheckBox");
        var formsPage = homePage.goToForms().clickPracticeForm();
        logger.info("Navigating to Web Tables page");
        logger.info("Selecting hobbies");
        formsPage.clickSportsHobbyCheckbox();
        logger.info("Clicking 'Sports checkbox'");
        formsPage.clickReadingHobbyCheckbox();
        logger.info("Clicking 'Reading checkbox'");
        formsPage.clickMusicHobbyCheckbox();
        logger.info("Clicking 'Music checkbox'");
        formsPage.unclickReadingHobbyCheckbox();
        logger.info("Unclicking 'Reading checkbox'");

        boolean isReadingCheckBoxSelected = formsPage.isReadingSelected();
        assertTrue(isReadingCheckBoxSelected, "\n 'Reading' Check Box is selected \n");
        logger.info("Assertion passed");
    }
}
