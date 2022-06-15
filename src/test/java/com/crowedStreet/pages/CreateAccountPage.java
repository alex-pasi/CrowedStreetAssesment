package com.crowedStreet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordInput;

    @FindBy(id = "accreditedYes")
    public WebElement accreditedYes;

    @FindBy(id = "accreditedNo")
    public WebElement accreditedNo;

    @FindBy(id = "hasAgreedTos")
    public WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    public WebElement reCAPTCHAIframe;

    @FindBy(xpath = "//span[@id='recaptcha-anchor']")
    public WebElement reCAPTCHA;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    public WebElement submitButton;

}
