package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CalculationPage;

public class CartCalculationStepDefs {

    CalculationPage calculationPage = new CalculationPage();

    @Given("User logs into the DemoBlaze page")
    public void userLogsIntoTheDemoBlazePage() {
        System.out.println("User is on the DemoBlaze homepage and logged in.");
    }

    @Given("User adds multiple products to the cart")
    public void userAddsMultipleProductsToCart() {
        calculationPage.addProductToCart("Iphone 6 32gb");
        calculationPage.addProductToCart("HTC One M9");
        calculationPage.addProductToCart("Nexus 6");
    }

    @When("User opens the cart")
    public void userOpensTheCart() {
        calculationPage.cartLink();
    }

    @Then("the cart total should match the sum of added products")
    public void theCartTotalShouldMatchTheSumOfAddedProducts() {
        calculationPage.validateCartTotal();
    }
}
