package me.exrates;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {


    public ChromeDriver driver;

    @Before
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver","/Users/exrates/Documents/exrates/dependency/chromedriver");
//        System.setProperty("webdriver.chrome.driver","/Users/exrates/Documents/exrates/dependency/chromedriver78-0-3904-11");
        System.setProperty("webdriver.chrome.driver","/Users/exrates/Documents/exrates/Components/Applytolist/src/chromedriver/chromedriver78-0-3904-11");
        driver = new ChromeDriver();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Start testing");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
    @After
    public void clouse() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("End testing");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                driver.quit();
    }
}
