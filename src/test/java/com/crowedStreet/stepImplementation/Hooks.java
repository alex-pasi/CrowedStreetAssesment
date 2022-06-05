package com.crowedStreet.stepImplementation;


import com.crowedStreet.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void closeBrowser(){
        Driver.closeBrowser();
    }

}
