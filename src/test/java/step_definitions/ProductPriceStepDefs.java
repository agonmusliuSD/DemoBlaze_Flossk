package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.ProductPricePage;

public class ProductPriceStepDefs {

    ProductPricePage productPricePage = new ProductPricePage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("User is already on the DemoBlaze homepage")
    public void userIsAlreadyOnTheDemoBlazeHomepage() {
        System.out.println("User is already on the DemoBlaze homepage");
    }

    @When("User selects a product")
    public void userSelectsAProduct() {
        productPricePage.selectProduct("Sony xperia z5");
    }

    @Then("the price displayed on the product page should match the price on the Dashboard")
    public void thePriceDisplayedOnTheProductPageShouldMatchThePriceOnTheDashboard() {
        String productPrice = productPricePage.getProductPrice();
        String dashboardPrice = dashboardPage.getProductPrice();

        Assert.assertEquals(productPrice, dashboardPrice, "The product price does not match the dashboard price");
    }
}
