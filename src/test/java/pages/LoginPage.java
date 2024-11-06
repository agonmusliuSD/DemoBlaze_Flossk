package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[@id='login2']")
    private static WebElement loginButton;

    @FindBy(id = "loginusername")
    private static WebElement usernameField;

    @FindBy(id = "loginpassword")
    private static WebElement passwordField;

    @FindBy(xpath = "//button[text()=\"Log in\"]")
    private static WebElement loginButton2;


    public static void clickLoginButton() {
        loginButton.click();
    }

    public static void enterCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);


    }

    public static void clickLoginButton2() {
        loginButton2.click();
    }
}