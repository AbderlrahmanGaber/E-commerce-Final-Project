package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {
    P03_homePage home=new P03_homePage();

    @Then("user click on Wishlist button on this product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void clickOnWishlistBTN()
    {
        home.WishListBTN.click();

        String actualResult = home.SuccessMsg.getCssValue("color");
        String expectedResult = "rgba(255, 255, 255, 1)";

        Assert.assertTrue(home.SuccessMsg.isDisplayed());
        Assert.assertEquals(actualResult,expectedResult);


    }

    @Then("click on Wishlist Tab")
    public void clickOnWishlistTab() throws InterruptedException {
// -----> the explicit wait is working But it takes to mush time
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.invisibilityOf(home.SuccessMsg));
        home.closeBTN.click();
        Thread.sleep(2000);
        home.WishlistTab.click();

    }

    @And("Get The Quantity Value od The selected Item")
    public void getQuantity()
    {
        int x = Integer.parseInt(home.itemQuantity.getAttribute("value"));

        if(x>0){
            System.out.println("Qty: " + x);

        }
    }
}
