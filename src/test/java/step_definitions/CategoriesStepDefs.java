package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CategoriesPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CategoriesStepDefs {

    private WebDriver driver;
    private CategoriesPage categoriesPage;

    @Given("User is on the DemoBlaze page")
    public void user_is_on_the_DemoBlaze_page() {
        driver.get(ConfigurationReader.getProperty("demoBlazeUrl"));

    }
    @When("User views the categories on the Dashboard")
    public void user_views_the_categories_on_the_dashboard() {

    }


    @Then("the categories {string}, {string}, and {string} should be present")
    public void theCategoriesAndShouldBePresent(String arg, String arg1, String arg2) {

    }
}



