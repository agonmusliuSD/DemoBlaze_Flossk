package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignUpPage;
import utilities.Driver;

public class SignUpStepDefs {


    private WebDriver driver = Driver.getDriver();
    private SignUpPage signUpPage = new SignUpPage();


    @Given("User signs up on the DemoBlaze page")
    public void user_signs_up_on_the_DemoBlaze_page() {
        driver.get("https://www.demoblaze.com/");
    }

    @And("User clicks on Sign Up button")
    public void userClicksOnSignUpButton() {
        SignUpPage.clickSignUpButton();
    }

    @When("the user enters valid details and submits the form")
    public void theUserEntersValidDetailsAndSubmitsTheForm(String username, String password) {
        SignUpPage.fillOutData(username, password);
    }


    @Then("the user should be registered and see a confirmation message")
    public void theUserShouldBeRegisteredAndSeeAConfirmationMessage() {
        String message = signUpPage.getConfirmationAlertMessage();
        Assert.assertEquals("Sign up successful.", message);


    }
}
