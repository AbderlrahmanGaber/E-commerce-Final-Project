package org.example.stepDefs;

import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home=new P03_homePage();
    String itemPrice;


    @Then("Select euro currency")
    public void selectEuro()
    {
        Select select = new Select(home.currencyDDL);
        select.selectByVisibleText("Euro");

        List<WebElement> items = home.price;
        for (WebElement element : items)
        {
         itemPrice= element.getText();
            System.out.println(itemPrice);
        }

        Assert.assertEquals(itemPrice.contains("€"),true);




}







    }


