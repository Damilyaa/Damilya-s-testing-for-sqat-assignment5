package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static utility.JavaScriptUtils.scrollToElementJS;

public class ElementsPage extends HomePage {
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablesPage clickWebTables() {
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        scrollToElementJS(linksMenuItem);
        click(linksMenuItem);
        return new LinksPage();
    }
}
