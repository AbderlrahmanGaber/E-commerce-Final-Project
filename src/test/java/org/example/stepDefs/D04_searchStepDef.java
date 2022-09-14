package org.example.stepDefs;


import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage home=new P03_homePage();
    String itemNames;



    @Then("user could search using product name \"<ProductName>\"")
    public void search(){

    }


    @Then("user could search using product name {string}")
    public void search(String ProductName) {

        home.SearchField.sendKeys(ProductName);
        home.SearchBTN.click();
        home.ItemName.size();
        System.out.println(home.ItemName.size());

        List<WebElement> items = home.ItemName;
        for (WebElement element : items)
        {
            itemNames= element.getText().toLowerCase();
            System.out.println(itemNames);
        }

        Assert.assertEquals(itemNames.contains(ProductName),true);
        System.out.println("ok");




    }

    @Then("user could search for product using sku {string}")
        public void search2(String sku) {

            home.SearchField.sendKeys(sku);
            home.SearchBTN.click();
            home.ItemPic.click();
            home.Label.isDisplayed();

            String label = home.Label.getText();
            System.out.println(home.Label.getText());

            Assert.assertEquals(label.contains(sku),true);
            System.out.println("ok");

        }
    }



