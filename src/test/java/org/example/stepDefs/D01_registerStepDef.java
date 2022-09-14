package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {
    //create object from register page
    P01_register register=new P01_register();
    SoftAssert soft=new SoftAssert();

    @Given("user go to register page")
    public void registerPage()
    {
       register.registerBtn.click();
    }

    @When("user select Gender type")
    public void selectGender()
    {
        register.selectGenderM.click();

    }

    @And("User Enter First name")
    public void enterFirstName()
    {
        register.firstName.sendKeys("automation");

    }

    @And("user enter last name")
    public void enterLastName()
    {
        register.lastName.sendKeys("tester");

    }

    @And("user enter date of birth")
    public void SelectBirthDate() {
        Select selectD = new Select(register.selectDay);
        selectD.selectByVisibleText("22");

        Select selectM = new Select(register.selectMonth);
        selectM.selectByVisibleText("June");

        Select selectY = new Select(register.selectYear);
        selectY.selectByVisibleText("1994");

    }


    @And("user enter Email")
    public void enterEmail()
    {
        register.email.sendKeys("test@gmail.com");

    }

    @And("User fill password fields")
    public void fillPasswordFields()
    {
        register.password.sendKeys("P@ssw0rd");
        register.confirmPassword.sendKeys("P@ssw0rd");

    }

    @And("user click on Register Button")
    public void clickRegisterBTN()
    {
        register.registerBTN.click();

    }

    @Then("register success message displayed")
    public void registerResultMsg()
    {
        String expectedResult="Your registration completed";
        String actualResult= register.result.getText();
        String colorExpectedResult = "rgba(76, 177, 124, 1)";
        String colorActualResult =register.textColor.getCssValue("color");


        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertEquals(colorActualResult,colorExpectedResult);
        soft.assertAll();

    }




}
