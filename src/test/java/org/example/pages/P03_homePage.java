package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
    public P03_homePage() {
        PageFactory.initElements(Hooks.driver, this);

    }


    @FindBy(id = "customerCurrency")
    public WebElement currencyDDL;

    @FindBy(className = "actual-price")
    public List<WebElement> price;

    @FindBy(id = "small-searchterms")
    public WebElement SearchField;

    @FindBy(className = "search-box-button")
    public WebElement SearchBTN;

    @FindBy(css = "h2[class=\"product-title\"] a")
    public List<WebElement> ItemName;

    @FindBy(className = "picture")
    public WebElement ItemPic;

    @FindBy(className = "additional-details")
    public WebElement Label;

    @FindBy(css = "div[class=\"header-menu\"] a")
    public WebElement Category1;
    //------------------
    @FindBy(css = "ul[class=\"sublist first-level\"] a")
    public WebElement SubCategory1;

    @FindBy(css = "li[class=\"active last\"] a")
    public WebElement Subcategory1;

    @FindBy(css = "div[class=\"page-title\"] h1")
    public WebElement pageTiTle;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement sliderNokia;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    public WebElement sliderIPhone;

    @FindBy(css = "li[class=\"facebook\"] a")
    public WebElement FackBookLink;

    @FindBy(css = "li[class=\"twitter\"] a")
    public WebElement TwitterLink;

    @FindBy(css = "li[class=\"rss\"] a")
    public WebElement RssLink;

    @FindBy(css = "li[class=\"youtube\"] a")
    public WebElement YoutubeLink;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement WishListBTN;

    @FindBy(xpath ="//*[@id=\"bar-notification\"]/div")
    public WebElement SuccessMsg;

    @FindBy(className = "wishlist-label")
    public WebElement WishlistTab;

    @FindBy(className = "close")
    public WebElement closeBTN;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input")
    public WebElement itemQuantity;









}
