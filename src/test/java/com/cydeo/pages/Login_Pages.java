package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pages {
    public Login_Pages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user")
    public WebElement userInputBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(css = "input[id='submit-form']")
    public WebElement loginButton;

}
