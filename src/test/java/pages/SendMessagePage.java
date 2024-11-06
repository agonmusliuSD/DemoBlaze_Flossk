package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class SendMessagePage extends BasePage {

    @FindBy(id = "\"recipient-email\"")
    private WebElement contactEmailField;

    @FindBy(xpath = "//input[@id='recipient-name']")
    private WebElement contactNameField;

    @FindBy(xpath = "//textarea[@id='message-text']")
    private WebElement messageField;

    @FindBy(xpath = "//button[text()='Send message' and @onclick='send()']")
    private WebElement sendMessageButton;

    @FindBy(xpath = "//a[@class='nav-link' and @data-target='#exampleModal' and text()='Contact']")
    private WebElement contactButton;

    public void openContactPage() {
        contactButton.click();
    }

    public void enterEmail(String email) {
        contactEmailField.clear();
        contactEmailField.sendKeys(email);
    }

    public void enterName(String name) {
        contactNameField.clear();
        contactNameField.sendKeys(name);
    }

    public void enterMessage(String message) {
        messageField.clear();
        messageField.sendKeys(message);
    }

    public void clickSendMessage() {
        sendMessageButton.click();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

}
