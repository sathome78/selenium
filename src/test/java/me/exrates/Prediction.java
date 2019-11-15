package me.exrates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prediction {
    private static WebDriver driver;
    public Prediction(WebDriver driver){
        this.driver = driver;
    }
    public static void PredictionStart(){
        driver.manage().window().maximize();
        driver.get("https://exrates.me/");

        String menuPred = driver.getWindowHandle();
        driver.findElement(By.cssSelector("[href=\"https://predictionlab.exrates.me\"]")).click();

        for(String winPred : driver.getWindowHandles()){
            driver.switchTo().window(winPred);
        }
        WebElement dynamicPrediction1 = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.className("top__hello")));
        String titleNommo = driver.findElement(By.tagName("h6")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleNommo);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        WebElement dynamicPrediction2 = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("main__tabs")));
        String menuPrediction = driver.getWindowHandle();
        driver.findElement(By.cssSelector("[href=\"https://twitter.com/Exrates_Labs/status/1154791242489708545\"]")).click();
        for(String winPrediction : driver.getWindowHandles()){
            driver.switchTo().window(winPrediction);
        }
        WebElement dynamicTwwit = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("permalink-footer")));
        WebElement titleTwitter = driver.findElement(By.className("FullNameGroup"));
        String titleTwittertext =  titleTwitter.findElement(By.tagName("strong")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page  Twitter is opened title is - " + titleTwittertext);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        driver.close();
        driver.switchTo().window(menuPrediction);
        WebElement dynamicPrediction = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("main__tabs")));
        WebElement elementHistori = driver.findElement(By.className("main__tabs"));
        elementHistori.findElement(By.xpath("./div[1]")).click();
        elementHistori.findElement(By.xpath("./div[2]")).click();
        //    Thread.sleep(100);
        elementHistori.findElement(By.xpath("./div[3]")).click();
        driver.close();
        driver.switchTo().window(menuPred);
        driver.findElement(By.className("logo__link")).click();
    }
}
