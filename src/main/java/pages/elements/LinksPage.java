package pages.elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static utility.JavaScriptUtils.scrollToElementJS;

public class LinksPage extends ElementsPage{
    private static final Logger logger =
            LogManager.getLogger(LinksPage.class);

    private By notFoundLink = By.id("invalid-url");
    private By linkResponse = By.id("linkResponse");

    public void clickNotFoundLink() {
        logger.info("Clicking 'Not Found' link");
        scrollToElementJS(notFoundLink);
        click(notFoundLink);
    }

    public String getResponse() {
        logger.info("Retrieving link response text");
        delay(3000);
        return find(linkResponse).getText();
    }
}
