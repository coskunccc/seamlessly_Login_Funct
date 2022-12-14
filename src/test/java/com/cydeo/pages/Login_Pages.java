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

    @FindBy(css = "a[class$='toggle-password']")
    public WebElement passwordBoxEye;


    @FindBy(css = "input[id='submit-form']")
    public WebElement loginButton;

    @FindBy(css = "p[class$='warning wrongPasswordMsg']")
    public WebElement wrongUsernameMessage;

    @FindBy(id="expand")
    public WebElement idButton;

    @FindBy(linkText = "Log out")
    public WebElement logoutButton;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordButton;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPassword;

}
