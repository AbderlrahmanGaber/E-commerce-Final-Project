package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login=new P02_login();
    SoftAssert soft=new SoftAssert();

    @Given("user go to login page")
    public void loginPage()
    {
        login.loginBtn.click();

    }

    @When("user login with Valid userName and Password")
    public void enterEmailAndPassword()
    {
        login.email.sendKeys("test@gmail.com");
        login.password.sendKeys("P@ssw0rd");
    }

    @When("user login with InValid userName and Password")
    public void enterInvalidEmailAndPassword()
    {
        login.email.sendKeys("test@gmail.com");
        login.password.sendKeys("Passw0rd");
    }

    @And("user click on login button")
    public void clickLoginBTN()
    {
        login.loginBTN.click();
    }

    @Then("user login to the system successfully")
    public void BtnDisplayed()
    {
        soft.assertTrue(login.MyAccount.isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"//demo.nopcommerce.com/");
    }

    @Then("user could not login to the system")
    public void loginUnSuccessFullMsg()
    {
        String expectedResult="Login was unsuccessful. Please correct the errors and try again.";
        String actualResult= login.errorMsg.getText();

        soft.assertEquals(actualResult.contains(expectedResult),true);

        String colorExpectedResult ="rgba(228, 67, 75, 1)";
        String colorActualResult =login.errorMsg.getCssValue("color");

        soft.assertEquals(colorActualResult,colorExpectedResult);
        soft.assertAll();

    }






}
