package com.crowedStreet.pages;

import com.crowedStreet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='css-108j06w']/a[.='Create An Account']")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//div[@class='user-button css-ebtv95']/abbr")
    public WebElement userButton;

}
