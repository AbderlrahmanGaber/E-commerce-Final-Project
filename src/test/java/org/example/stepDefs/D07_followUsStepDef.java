package org.example.stepDefs;

import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import java.util.ArrayList;


public class D07_followUsStepDef {
    P03_homePage home=new P03_homePage();

    @Then("click on FacebookLink")
    public void clickFacebookLink() throws InterruptedException {
        home.FackBookLink.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult ="https://web.facebook.com/nopCommerce";

        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("ok");

    }

    @Then("click on TwitterLink")
    public void clickOnTwitterLink() throws InterruptedException {
        home.TwitterLink.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult ="https://twitter.com/nopCommerce";

        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("ok");

    }

    @Then("click on RssLink")
    public void  clickOnRssLink() throws InterruptedException {
        home.RssLink.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult ="https://demo.nopcommerce.com/new-online-store-is-open";

        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("ok");

    }

    @Then("click on YoutubeLink")
    public void clickOnYoutubrLink() throws InterruptedException {
        home.YoutubeLink.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult ="https://www.youtube.com/user/nopCommerce";

        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("ok");

    }

}
