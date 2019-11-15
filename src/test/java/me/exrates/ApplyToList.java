package me.exrates;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import java.util.Random;

public class ApplyToList {
    private static WebDriver driver;
    public ApplyToList(WebDriver driver){
        this.driver = driver;
    }
    public static void applyStart(){
    driver.manage().window().maximize();
    driver.get("https://exrates.me/");

    WebElement dynamicMenu = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("content")));
    WebElement elementMenu = driver.findElement(By.className("header__inner"));
    elementMenu.findElement(By.cssSelector("[href=\"https://about.exrates.me/form-listing\"]")).click();
    WebDriverWait waitApply = new WebDriverWait(driver, 10 );
    waitApply.until(visibilityOfElementLocated(By.cssSelector("form")));
    String titleMenuApply = driver.getTitle();
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Page is opened title is - " + titleMenuApply);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    Assert.assertTrue(titleMenuApply.equals("Apply for listing | Exrates"));
    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
    Random random = new Random();
    int n = random.nextInt(100)+1;
    String email = "olex-nick" + n + "@gmail.com";
    driver.findElement(By.id("id_email")).sendKeys(email);
    driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
    //  решить вопрос с капчей и всплывающим окном//
    //  WebElement recaptcha = driver.findElement(By.className("capcha-container"));
    //  recaptcha.click();
    //  driver.findElement(By.className("standart-btn")).click();
    System.out.println("********************************************************");
    System.out.println("I need to list a coin form is OK");
    System.out.println("********************************************************");
    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
    Random randomListing = new Random();
    int q = randomListing.nextInt(100)+1;
    String emailListing = "olex-nick" + q + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailListing);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
    //  решить вопрос с капчей и всплывающим окном//
    //  WebElement recaptchaListing = driver.findElement(By.className("capcha-container"));
    //  System.out.println(recaptcha);
    //  recaptchaListing.click();
    //    driver.findElement(By.className("standart-btn")).click();
    System.out.println("********************************************************");
    System.out.println("I need to conduct an IEO form is OK");
    System.out.println("********************************************************");
    WebElement dynamicBackBtn = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("back-btn")));
    driver.findElement(By.className("back-btn")).click();

    }
}
