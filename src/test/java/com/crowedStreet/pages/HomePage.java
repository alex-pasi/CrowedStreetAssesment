package com.crowedStreet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='css-108j06w']/a[.='Create An Account']")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//div[@class='user-button css-ebtv95']/abbr")
    public WebElement userButton;

}
