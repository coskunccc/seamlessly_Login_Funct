package com.cydeo.steps;

import com.cydeo.pages.Login_Pages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

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
        pageDriver.passwordBox.sendKeys(string + Keys.ENTER);
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

    @When("user enters invalid {string} or {string}")
    public void user_enters_invalid_or(String string, String string2) {
        pageDriver.userInputBox.sendKeys(string);
        pageDriver.passwordBox.sendKeys(string2);
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String string) {

        String actualMessage = pageDriver.wrongUsernameMessage.getText();
        Assert.assertEquals(string, actualMessage);

        // If login happens:
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard - Seamlessly";
        if (actualTitle.equals(expectedTitle)) {
            pageDriver.idButton.click();
            pageDriver.logoutButton.click();
        }
        //Driver.closeDriver();
    }

    @When("user leaves {string} or {string} empty")
    public void user_leaves_or_empty(String string, String string2) {
        pageDriver.userInputBox.sendKeys(string);
        pageDriver.passwordBox.sendKeys(string2);
    }

    @Then("user should see pop-up message {string}")
    public void userShouldSeePopUpMessage(String arg0) {
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        String actualMessage= (String) js.executeScript("return arguments[0]" +
                ".validationMessage",pageDriver.userInputBox);
        String actualMessage2= (String) js.executeScript("return arguments[0]" +
                ".validationMessage",pageDriver.passwordBox);

        Assert.assertTrue(arg0.equals(actualMessage)|| arg0.equals(actualMessage2));


        // If login happens:
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard - Seamlessly";
        if (actualTitle.equals(expectedTitle)) {
            pageDriver.idButton.click();
            pageDriver.logoutButton.click();
        }

    }
}
