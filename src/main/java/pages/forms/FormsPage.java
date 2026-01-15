package pages.forms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pages.HomePage;

import static utility.JavaScriptUtils.scrollToElementJS;

public class FormsPage extends HomePage {
    private static final Logger logger =
            LogManager.getLogger(FormsPage.class);

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        logger.info("Clicking Practice Form menu item");
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
