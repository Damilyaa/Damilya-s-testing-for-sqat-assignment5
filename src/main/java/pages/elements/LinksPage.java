package pages.elements;

import org.openqa.selenium.By;

import static utility.JavaScriptUtils.scrollToElementJS;

public class LinksPage extends ElementsPage{
    private By notFoundLink = By.id("invalid-url");
    private By linkResponse = By.id("linkResponse");

    public void clickNotFoundLink() {
        scrollToElementJS(notFoundLink);
        click(notFoundLink);
    }

    public String getResponse() {
        delay(3000);
        return find(linkResponse).getText();
    }
}
