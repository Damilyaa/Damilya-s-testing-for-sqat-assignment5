package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.elements.ElementsPage;
import pages.forms.FormsPage;
import base.BasePage;
import org.openqa.selenium.By;

import static utility.JavaScriptUtils.scrollToElementJS;

public class HomePage extends BasePage {
    private static final Logger logger =
            LogManager.getLogger(HomePage.class);

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");

    public FormsPage goToForms() {
        logger.info("Navigating to Forms page");
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        logger.info("Navigating to Elements page");
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }
}
