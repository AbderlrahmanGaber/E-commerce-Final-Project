package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P01_register {

    public P01_register()
    {
        PageFactory.initElements(Hooks.driver,this);

    }

    @FindBy(className = "ico-register")
    public WebElement registerBtn;

    @FindBy(id = "gender-male")
    public WebElement selectGenderM;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement selectDay;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement selectMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement selectYear;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;


    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerBTN;

    @FindBy(className = "result")
    public WebElement result;

    @FindBy(css = "div[class=\"result\"] ")
    public WebElement textColor;








}
