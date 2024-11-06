package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class SignUpPage extends BasePage {

    private WebDriver driver;

    public SignUpPage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='signin2']")
    private static WebElement signUpButton;

    @FindBy(id = "sign-username")
    private static WebElement usernameField;

    @FindBy(id = "sign-password")
    private static WebElement passwordField;

    @FindBy(xpath = "//button[normalize-space()='Sign up']")
    private static WebElement submitButton;

    public static void clickSignUpButton() {
        signUpButton.click();
    }


    public static void fillOutData(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }


    public String getConfirmationAlertMessage() {
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.accept();
        return message;
    }


}