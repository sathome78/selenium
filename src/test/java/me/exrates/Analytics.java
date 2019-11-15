package me.exrates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Analytics {
    private static WebDriver driver;

    public Analytics(WebDriver driver){
        this.driver = driver;
    }
    public static void analyticsStart(){
        driver.manage().window().maximize();
        driver.get("https://exrates.me/");

        driver.findElement(By.cssSelector("[href=\"https://about.exrates.me/en/analytics/\"]")).click();
        WebElement dynamicAnalitic = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("analitics-item-wr")));
        WebElement elementNavName = driver.findElement(By.cssSelector("[href=\"/en/analytics/\"]"));
        String nameTab = elementNavName.getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + nameTab);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        driver.navigate().back();
    }
}
