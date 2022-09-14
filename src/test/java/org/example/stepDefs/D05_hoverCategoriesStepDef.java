package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
public class D05_hoverCategoriesStepDef {
    P03_homePage home=new P03_homePage();




    @And("Hover on a Category")
    public void Hovering()
    {
        Actions action = new Actions(Hooks.driver);
        WebElement element=home.Category1;
        action.moveToElement(element).build().perform();

    }

    @Then("Select a Sub-Category")
    public void selectSubCategory()
    {
        home.SubCategory1.click();
        String actualResult = home.Subcategory1.getText().toLowerCase().trim();
        String expectedResult = home.pageTiTle.getText().toLowerCase().trim();

        System.out.println("1-"+ actualResult);
        System.out.println("2-"+ expectedResult);

        Assert.assertEquals(actualResult,expectedResult);

    }

}