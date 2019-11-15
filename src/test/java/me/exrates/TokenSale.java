package me.exrates;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TokenSale {
    private static WebDriver driver;
    public TokenSale(WebDriver driver){
        this.driver = driver;
    }
    public static void tokenSaleStart(){
        driver.manage().window().maximize();
        driver.get("https://exrates.me/");

        WebElement elementMenuIeo = driver.findElement(By.className("header__inner"));
        elementMenuIeo.findElement(By.cssSelector("[href=\"/ieo\"]")).click();
        WebElement dynamicMenuIeo = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.className("how-work-wr")));
        String titleMenuIeo = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleMenuIeo);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Assert.assertTrue(titleMenuIeo.equals("IEO"));
        // Submit ieo
        String menuIeo = driver.getWindowHandle();
        WebElement elementWaitT = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("common-ieo-container")));
        WebElement elementButton = driver.findElement(By.className("fs-wr"));
            elementButton.findElement(By.tagName("a")).click();
            JavascriptExecutor jsx = (JavascriptExecutor)driver;
            jsx.executeScript("window.scrollBy(0,-450)", "");
        //    driver.findElement(By.cssSelector("[href=\"https://forms.gle/Y18qX3Na3WmWiRnw9\"]")).click();
        for(String winHandlIeo : driver.getWindowHandles()){
            driver.switchTo().window(winHandlIeo);
        }
        WebElement dynamicMenuSubmitIeo = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("freebirdFormviewerViewNavigationNavControls")));
        String titleMenuSubmitIeo = driver.getTitle();
        System.out.println(titleMenuSubmitIeo);
        Assert.assertTrue(titleMenuSubmitIeo.equals("Submit Project to IEO"));
        driver.findElement(By.name("entry.577431204")).sendKeys("Alex");
        driver.findElement(By.name("entry.323859505")).sendKeys("https://test.com");
        driver.findElement(By.name("entry.1680748827")).sendKeys("Alex test test ");
        driver.findElement(By.name("entry.18760188")).sendKeys("alex@test.com");
        driver.findElement(By.name("entry.58350542")).sendKeys("@AlexTestTest ");
        System.out.println("********************************************************");
        System.out.println("Submit Project to IEO form is OK");
        System.out.println("********************************************************");
        WebElement elementSubmit = driver.findElement(By.className("freebirdFormviewerViewNavigationButtons"));
        System.out.println(elementSubmit);
        //    elementSubmit.findElement(By.cssSelector("[role=\"button\"]")).click(); работает не отпровляю просто письма
        // отловить окно о завершеии отправки вопроса
        //    WebElement dynamicMenuSucsessIeo = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("freebirdFormviewerViewResponseConfirmContentContainer")));
        //    WebElement elementIoeSucsess = driver.findElement(By.className("freebirdFormviewerViewResponseConfirmationMessage"));
        //    elementIoeSucsess.getText();
        //    System.out.println(elementIoeSucsess);
        //    Assert.assertTrue(elementIoeSucsess.equals("Ответ записан."));
        driver.close();
        driver.switchTo().window(menuIeo);
        driver.findElement(By.cssSelector("[formcontrolname=\"email\"]")).sendKeys("aleksandr.horovykh@upholding.biz");
        WebElement elementSend = driver.findElement(By.className("form-wr"));
        elementSend.findElement(By.tagName("button")).click();
        WebElement elementSendPopap = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("popup__close")));
        driver.findElement(By.className("popup__close")).click();
    }
}
