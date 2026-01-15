package pages.elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static utility.JavaScriptUtils.scrollToElementJS;

public class ElementsPage extends HomePage {
    private static final Logger logger =
            LogManager.getLogger(ElementsPage.class);

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablesPage clickWebTables() {
        logger.info("Clicking Web Tables menu item");
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        logger.info("Clicking Links menu item");
        scrollToElementJS(linksMenuItem);
        click(linksMenuItem);
        return new LinksPage();
    }
}
