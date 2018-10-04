package com.epam.lab.steps;

import com.epam.lab.business_objects.MailBusinessObject;
import com.epam.lab.parser.XML_models.User;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.epam.lab.constants.Constants.START_URL;

public class StepDefinitions {

    private User user;
    private MailBusinessObject mailBusinessObject;

    @Given("^I have my data\\(\"([^\"]*)\",\"([^\"]*)\"\\)$")
    public void i_have_my_data(String email, String password) throws Throwable {
        User.UserBuilder userBuilder = new User.UserBuilder();
        userBuilder.setEmail(email).setPassword(password);
        user = userBuilder.build();
    }

    @When("^I open gmail authorization form$")
    public void i_open_gmail_authorization_form() throws Throwable {
        mailBusinessObject = new MailBusinessObject();
        mailBusinessObject.goTo(START_URL);
    }

    @When("^I type my email and password$")
    public void i_type_my_email_and_password() throws Throwable {
        mailBusinessObject.logIn(user);
    }

    @Then("^I will see my email in account window$")
    public void i_will_see_my_email_in_account_window() throws Throwable {
        Assert.assertTrue(mailBusinessObject.isUserLoggedIn(user.getEmail()));
    }
}
