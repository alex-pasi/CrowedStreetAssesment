package com.crowedStreet.pages;

import com.crowedStreet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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
