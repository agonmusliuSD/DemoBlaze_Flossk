package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SendMessagePage;

public class SendMessageStepDefs {

    SendMessagePage sendMessagePage = new SendMessagePage();

    @Given("User opens the Contact form on the DemoBlaze page")
    public void userOpensContactForm(){
        sendMessagePage.openContactPage();
    }

    @When("User enters their email, name, and message")
    public void userEntersContactDetails(){
        sendMessagePage.enterEmail("agonmus@outlook.com");
        sendMessagePage.enterName("Agon Musliu");
        sendMessagePage.enterMessage("I have a question about one of your products.");
    }

    @When("User sends the message")
    public void userSendsTheMessage(){
        sendMessagePage.clickSendMessage();
    }

    @Then("A confirmation alert should appear")
    public void confirmationAlertShouldAppear(){
        String alertText = sendMessagePage.getAlertText();
        Assert.assertTrue(alertText.contains("Thanks for the message!!"));
        sendMessagePage.acceptAlert();
    }
}
