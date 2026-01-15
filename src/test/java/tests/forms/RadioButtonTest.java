package tests.forms;

import base.BaseTest;
import static org.testng.Assert.*;

import listeners.TestListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class RadioButtonTest extends BaseTest {
    private static final Logger logger =
            LogManager.getLogger(RadioButtonTest.class);

    @Test
    public void testRadioButton() {
        logger.info("Test starting: testRadioButton");
        var formsPage = homePage.goToForms().clickPracticeForm();
        logger.info("Navigating to Web Tables page");
        formsPage.clickFemaleRadioButton();
        logger.info("Clicking Female radio button");
        boolean isFemaleRadioSelected = formsPage.isFemaleRadioButtonSelected();
        assertTrue(isFemaleRadioSelected, "\n Female Radio button is not selected \n");
        logger.info("Assertion passed");
    }
}
