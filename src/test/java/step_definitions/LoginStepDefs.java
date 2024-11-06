package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginStepDefs {


    private WebDriver driver = Driver.getDriver();


//    @Given("User is on the DemoBlaze page")
//    public void user_is_on_the_DemoBlaze_page() {
//        driver.get("https://www.demoblaze.com/");
//    }

    @When("User clicks on Login button")
    public void userClicksOnLoginButton() {
        LoginPage.clickLoginButton();
    }

    @And("the user enters valid {string} and {string} and submits the form")
    public void theUserEntersValidAndAndSubmitsTheForm(String username, String password) {
        LoginPage.enterCredentials("agonmus","123456789");
    }
}
