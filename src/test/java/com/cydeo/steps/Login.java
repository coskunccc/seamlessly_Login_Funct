package com.cydeo.steps;

import com.cydeo.pages.Login_Pages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login {

    Login_Pages pageDriver = new Login_Pages();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        pageDriver.userInputBox.sendKeys(string);
    }
    @When("user enters password {string} and hits Enter key")
    public void user_enters_password_and_hits_enter_key(String string) {
        pageDriver.passwordBox.sendKeys(string+Keys.ENTER);
    }
    @Then("user should be on the homepage")
    public void user_should_be_on_the_homepage() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard - Seamlessly";
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.closeDriver();
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        pageDriver.passwordBox.sendKeys(string);
    }
    @When("user clicks Login button")
    public void user_clicks_login_button() {
        pageDriver.loginButton.click();
    }

}
