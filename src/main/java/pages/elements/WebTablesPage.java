package pages.elements;

import org.openqa.selenium.By;

import static utility.JavaScriptUtils.clickJS;
import static utility.JavaScriptUtils.scrollToElementJS;

public class WebTablesPage extends ElementsPage{

    private By registrationFirstNameField = By.id("firstName");
    private By registrationLastNameField = By.id("lastName");
    private By registrationEmailField = By.id("userEmail");
    private By registrationAgeField = By.id("age");
    private By registrationSubmitButton = By.id("submit");

    public void clickEditButton(String email) {
        By editButton = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
        scrollToElementJS(editButton);
        click(editButton);
    }

    public void setFirstName(String firstName) {
        set(registrationFirstNameField, firstName);
    }

    public void setLastName(String lastName) {
        set(registrationLastNameField, lastName);
    }

    public void setAge(String age) {
        set(registrationAgeField, age);
    }

    public void clickSubmitButton() {
        click(registrationSubmitButton);
    }

    public String getTableFirstName(String email) {
        By tableFirstName = By.xpath("//div[text()='"+ email +"']//preceding::div[3]");
        return find(tableFirstName).getText();
    }




}
