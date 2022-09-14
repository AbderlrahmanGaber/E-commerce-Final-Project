package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @Before
    public static void openBrowser()
    {
        //set system property
        System.setProperty("webdriver.chrome.driver","G:\\Gaber\\E-comerce projects\\E-commerceFinalProject1\\Drivers\\chromedriver.exe");


        //create new object from webDriver
        driver = new ChromeDriver();

        //configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Navigate to Url
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public  static  void quiteDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

}
