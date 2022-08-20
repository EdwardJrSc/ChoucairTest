package co.com.utest.choucairtest.stepdefinitions;

import co.com.utest.choucairtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Edward wants to sing up at the UTest website$")
    public void edwardWantsToSingUpAtTheUTestWebsite() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Edward").wasAbleTo(OpenUp.thePage(),(Join.onThePage()));
    }

    @When("^i search the join today button on the UTets website and open the form$")
    public void iSearchTheJoinTodayButtonOnTheUTetsWebsiteAndOpenTheForm() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Edward").attemptsTo(CompleteForm.onThePage(),
                CompleteFormLocation.onThePage(),
                CompleteFormDevices.onThePage(),
                CompleteFormLastStep.onThePage());
    }

    @Then("^I type the required information to complete the register form$")
    public void iTypeTheRequiredInformationToCompleteTheRegisterForm() {
        // Write code here that turns the phrase above into concrete actions
    }
}
