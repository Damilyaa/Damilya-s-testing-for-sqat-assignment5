package pages.forms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pages.HomePage;

import static utility.JavaScriptUtils.*;

public class PracticeFormPage extends FormsPage{
    private static final Logger logger =
            LogManager.getLogger(PracticeFormPage.class);

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckBox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckBox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckBox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        logger.info("Clicking female radio button");
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckbox() {
        logger.info("Clicking 'Sports' checkbox");
        if (!find(sportsHobbyCheckBox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckBox);
            clickJS(sportsHobbyCheckBox);
        }
    }

    public void clickReadingHobbyCheckbox() {
        logger.info("Clicking 'Reading' checkbox");
        if (!find(readingHobbyCheckBox).isSelected()) {
            scrollToElementJS(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public void unclickReadingHobbyCheckbox() {
        logger.info("Unclicking 'Reading' checkbox");
        if (find(readingHobbyCheckBox).isSelected()) {
            scrollToElementJS(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public void clickMusicHobbyCheckbox() {
        logger.info("Clicking 'Music' checkbox");
        if (!find(musicHobbyCheckBox).isSelected()) {
            scrollToElementJS(musicHobbyCheckBox);
            clickJS(musicHobbyCheckBox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckBox).isSelected();
    }
}
