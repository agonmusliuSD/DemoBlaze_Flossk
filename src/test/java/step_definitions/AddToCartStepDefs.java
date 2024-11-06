package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.DashboardPage;
import pages.OrderPage;
import utilities.Driver;

public class AddToCartStepDefs {

    private WebDriver driver = Driver.getDriver();
    private DashboardPage dashboardPage = new DashboardPage();
    private CartPage cartPage = new CartPage(driver);
    private OrderPage orderPage = new OrderPage(driver);

    @Given("User is logged in on the DemoBlaze page")
    public void user_is_logged_in_on_the_demo_blaze_page() {
        driver.get("https://demoblaze.com");
        // Add login logic here
    }

    @When("User adds one phone to the cart")
    public void userAddsPhoneToCart() {
        dashboardPage.selectCategory("Phones");
        dashboardPage.addPhoneToCart("Nokia lumia 1520");
    }

    @When("User adds a laptop to the cart")
    public void userAddsLaptopToCart() {
        dashboardPage.goToHomePage();
        dashboardPage.selectCategory("Laptops");
        dashboardPage.addLaptopToCart("MacBook Pro");
    }

    @When("User proceeds to place the order")
    public void userProceedsToPlaceTheOrder() {
        dashboardPage.goToCart();
        orderPage.clickPurchaseButton();
    }

    @When("User fills in the order details")
    public void userFillsInTheOrderDetails(io.cucumber.datatable.DataTable dataTable) {
        var data = dataTable.asMaps(String.class, String.class).get(0);
        orderPage.fillOrderDetails(data.get("name"), data.get("country"), data.get("city"),
                data.get("creditCard"), data.get("month"), data.get("year"));
    }

    @When("User confirms the order")
    public void userConfirmsTheOrder() {
        orderPage.confirmOrder();
    }

    @Then("a confirmation message should appear with the order ID")
    public void confirmationMessageShouldAppearWithOrderID() {
        orderPage.verifyConfirmationMessage();
    }


    }
