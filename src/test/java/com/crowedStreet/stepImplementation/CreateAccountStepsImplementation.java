package com.crowedStreet.stepImplementation;

import com.crowedStreet.pages.CreateAccountPage;
import com.crowedStreet.pages.HomePage;
import com.crowedStreet.utilities.Utils;
import com.crowedStreet.utilities.ConfigReader;
import com.crowedStreet.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountStepsImplementation {

    HomePage homePage = new HomePage();
    CreateAccountPage createAccountPage = new CreateAccountPage();

    String firstName;

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.read("url"));
    }

    @When("user clicks on Create An Account button")
    public void user_clicks_on_create_an_account_button() {
        Utils.clickElement(homePage.createAnAccountButton);
    }

    @When("user provides all data into required fields")
    public void user_provides_all_data_into_required_fields() {
        Faker faker = new Faker();

        firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = firstName+"."+lastName+"@gmail.com";
        String password = faker.regexify("[a-z]{5}[A-Z]{1}\\d[!#@$%^&*]{1}");

        createAccountPage.firstNameInput.sendKeys(firstName);
        createAccountPage.lastNameInput.sendKeys(lastName);
        createAccountPage.emailInput.sendKeys(email);
        createAccountPage.passwordInput.sendKeys(password);
        createAccountPage.confirmPasswordInput.sendKeys(password);

    }

    @When("user answers accredited investor question")
    public void user_answers_accredited_investor_question() {
        Utils.clickElement(createAccountPage.accreditedYes);
    }

    @When("user agrees terms and conditions")
    public void user_agrees_terms_and_conditions() {
        Utils.clickElement(createAccountPage.termsAndConditionsCheckbox);
    }

    @When("user clicks on reCAPTCHA")
    public void user_clicks_on_re_captcha() {
        Driver.getDriver().switchTo().frame(createAccountPage.reCAPTCHAIframe);
        Utils.clickElement(createAccountPage.reCAPTCHA);
        Driver.getDriver().switchTo().defaultContent();
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        Utils.clickElement(createAccountPage.submitButton);
    }

    @Then("account is successfully created and logged in user is on the marketplace page")
    public void accountIsSuccessfullyCreatedAndLoggedInUserIsOnTheMarketplacePage() {
        String expectedTitle = "Marketplace | CrowdStreet";
        Utils.verifyTitle(expectedTitle);
        Assert.assertEquals(firstName.toUpperCase(), homePage.userButton.getAttribute("innerText").substring(3));
    }
}
