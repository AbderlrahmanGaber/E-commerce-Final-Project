package org.example.stepDefs;

import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;


public class D06_homeSlidersStepDef {
    P03_homePage home=new P03_homePage();



     @Then("click on the HomeSlider Nokia")
    public void clickONSliderN()
     {
         home.sliderNokia.click();
         Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
         System.out.println(Hooks.driver.getCurrentUrl());
     }

     @Then("click on the HomeSlider Iphone")
    public void clickOnSliderIPHone()
     {
         home.sliderIPhone.click();
         Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
         System.out.println(Hooks.driver.getCurrentUrl());


     }
}
