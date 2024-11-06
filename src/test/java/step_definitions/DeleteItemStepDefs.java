package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteItemPage;
import pages.LoginPage;

public class DeleteItemStepDefs {

    private LoginPage loginPage = new LoginPage();
    private DeleteItemPage deleteItemPage = new DeleteItemPage();

    @Given("User is logged in on the DemoBlaze homepage")
    public void user_is_logged_in_on_the_DemoBlaze_page() {
    loginPage.clickLoginButton();
    loginPage.enterCredentials("agonmus", "123456789");
    loginPage.clickLoginButton();

    }

    @And("User adds a phone to the cart")
    public void UserAddsPhoneToTheCart() {
        deleteItemPage.selectPhoneCategory();
        deleteItemPage.addPhoneToCart();
    }

    @And("User views the cart")
    public void UserViewsTheCart() {
        deleteItemPage.navigateToCart();
    }

    @When("User deletes the phone from the cart")
    public void UserDeletesPhoneFromCart() {
        deleteItemPage.deleteItemFromCart();
    }

    @Then("the cart should be empty")
    public void cartShouldBeEmpty() {
        Assert.assertTrue(deleteItemPage.isCartEmpty());
    }

}
