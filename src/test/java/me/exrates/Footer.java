package me.exrates;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer {
    private static WebDriver driver;

    public Footer (WebDriver driver){
        this.driver = driver;
    }

    public static void  footerStart(){
        driver.manage().window().maximize();
        driver.get("https://exrates.me/");

       //<-----------------------Home page footer ------------------------------------------------------>
       driver.get("https://exrates.me/");
       System.out.println("Stast test footer !");
       //elementFooter.findElement(By.cssSelector("[href='https://t.me/exratesme']")).click();
       //дописать по телеграмм
       //-----Twitter------
        String winHandleBeforeT = driver.getWindowHandle();
        WebElement elementWindowFooter = driver.findElement(By.className("social-wr"));
        elementWindowFooter.findElement(By.cssSelector("[href=\"https://twitter.com/Exrates_Me_\"]")).click();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.id("session")).click();
        WebElement dynamicHandleFooter = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By. id("page-container")));
        String titleFooterTwitter = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleFooterTwitter);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Assert.assertTrue(titleFooterTwitter.equals("Exrates.me (@Exrates_Me_) | Твиттер"));
        driver.close();
        driver.switchTo().window(winHandleBeforeT);
        //-----Facebook------
        String winHandleBeforeFacebook = driver.getWindowHandle();
        WebElement elementWindowFooterFacebook = driver.findElement(By.className("social-wr"));
        elementWindowFooterFacebook.findElement(By.cssSelector("[href=\"https://www.facebook.com/exrates/\"]")).click();
        for(String winHandleFacebook : driver.getWindowHandles()){
            driver.switchTo().window(winHandleFacebook);
        }
        WebElement dynamicHandleFooterFacebook = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_6")));
        String titleFooterFacebook = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleFooterFacebook);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Assert.assertTrue(titleFooterFacebook.equals("Exrates Exchange - Главная | Facebook"));
        driver.close();
        driver.switchTo().window(winHandleBeforeFacebook);
        //-----Terms & conditions------
        String winHandleBeforeTearms = driver.getWindowHandle();
        WebElement elementWindowFooterTearms = driver.findElement(By.className("servise-page-wr"));
        elementWindowFooterTearms.findElement(By.xpath("./div[1]/a")).click();
        for(String winHandleTearms : driver.getWindowHandles()){
            driver.switchTo().window(winHandleTearms);
        }
        WebElement dynamicHandleFooterTearms = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("static-pages")));
        String titleFooterTearms = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleFooterTearms);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Assert.assertTrue(titleFooterTearms.equals("Terms & Conditions"));
        String  parentWindowSwich = driver.getWindowHandle();
        //        System.out.println(parentWindow);
        WebElement elementTermsFirstSwich = driver.findElement(By.xpath("//*[contains(text(), ' DexTechnologies OÜ reserves the right at any time to verify your identity for the purposes of complying with the ')]"));
        elementTermsFirstSwich.findElement(By.tagName("a")).click();
        driver.navigate().back();
        WebElement elementTermsSecondSwich = driver.findElement(By.xpath("//*[contains(text(), '1.5: DexTechnologies OÜ reserves the right at any time to verify your identity for the purposes of complying with the ')]"));
        elementTermsSecondSwich.findElement(By.tagName("a")).click();
        //      System.out.println(elementTermsFirst);
        driver.navigate().back();
        driver.switchTo().window(parentWindowSwich);
        String  parentWindowNewT = driver.getWindowHandle();
//        System.out.println(parentWindowNewT);
        driver.navigate().back();
        //    driver.close();
        driver.switchTo().window(winHandleBeforeTearms);
        //-----Privacy policy------
        String winHandleBeforePrivacy = driver.getWindowHandle();
        WebElement elementWindowFooterPrivacy = driver.findElement(By.className("servise-page-wr"));
        elementWindowFooterPrivacy.findElement(By.xpath("./div[2]/a")).click();
        WebElement dynamicFooterPolicy = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
        String titleFooterPolicy = driver.getTitle();
        Assert.assertTrue(titleFooterPolicy.equals("Contact us | Exrates"));
        String PolicyFooterH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + PolicyFooterH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        driver.navigate().back();
        //-----Fees------
        String winHandleFees = driver.getWindowHandle();
        WebElement elementWindowFooterFees = driver.findElement(By.className("info-page-wr"));
        elementWindowFooterFees.findElement(By.xpath("./div[1]/a")).click();
        for(String winHandleFees1 : driver.getWindowHandles()){
            driver.switchTo().window(winHandleFees1);
        }
        WebElement dynamicHandleFooterFees = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("article__main")));
        String titleFooterFees = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleFooterFees);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Assert.assertTrue(titleFooterFees.equals("Fees & Pairs"));
        driver.close();
        driver.switchTo().window(winHandleFees);
        //-----Api------
        String winHandleBeforeApi = driver.getWindowHandle();
        WebElement elementWindowFooterApi = driver.findElement(By.className("info-page-wr"));
        elementWindowFooterApi.findElement(By.xpath("./div[2]/a")).click();
        for(String winHandleApi1 : driver.getWindowHandles()){
            driver.switchTo().window(winHandleApi1);
        }
        WebElement dynamicHandleFooterApi = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
        String titleFooterApi = driver.getTitle();
        System.out.println("Exrates REST API " +  titleFooterApi);
        //        Assert.assertTrue(titleFooterApi.equals("Loading..."));
        driver.close();
        driver.switchTo().window(winHandleBeforeApi);
        //-----Support------
        WebElement elementWindowFooterSupport = driver.findElement(By.className("inside-page-wr"));
        elementWindowFooterSupport.findElement(By.xpath("./div[2]/a")).click();
        WebElement dynamicFooterSupport = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("cont-wr")));
        String titleFooterSupport = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleFooterSupport);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Assert.assertTrue(titleFooterSupport.equals("Support | Exrates"));
        String SupportFooterH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + SupportFooterH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        driver.navigate().back();
        //-----Contacts------
        WebElement elementWindowFooterContacts = driver.findElement(By.className("inside-page-wr"));
        elementWindowFooterContacts.findElement(By.xpath("./div[3]/a")).click();
        WebElement dynamicFooterContacts = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
        String titleFooterContacts = driver.getTitle();
        System.out.println(titleFooterContacts);
        Assert.assertTrue(titleFooterContacts.equals("Contact us | Exrates"));
        String ContactsFooterH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + ContactsFooterH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        driver.navigate().back();
        //-----Apply for listing | Exrates------
        WebElement elementWindowFooterApply = driver.findElement(By.className("inside-page-wr"));
        elementWindowFooterApply.findElement(By.xpath("./div[4]/a")).click();
        WebElement dynamicFooterApply = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("form-part")));
        String titleFooterApply = driver.getTitle();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + titleFooterApply);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Assert.assertTrue(titleFooterApply.equals("Apply for listing | Exrates"));
        driver.navigate().back();





        /* ********************************Home page footer bottom Link********************************************** */
//    //driver.get("https://exrates.me");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Stast test footer  bottom  link!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //-------Coinpricetoday------
    String winHandleCoinpricetoday = driver.getWindowHandle();
    WebElement elementCoinpricetoday = driver.findElement(By.className("bottom-social-wr"));
    elementCoinpricetoday.findElement(By.cssSelector("[href=\"http://coinpricetoday.com\"]")).click();
    for(String winHandlCoinpricetoday : driver.getWindowHandles()){
        driver.switchTo().window(winHandlCoinpricetoday);
    }
    WebElement dynamicHandleFooterCoinpricetoday = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
    String titleFooterCoinpricetoday = driver.getTitle();
    System.out.println(titleFooterCoinpricetoday);
    Assert.assertTrue(titleFooterCoinpricetoday.equals("Latest Bitcoin Price Trade Volume Reviews | Coin Price Today -"));
    driver.close();
    driver.switchTo().window(winHandleCoinpricetoday);
        System.out.println("Coinpricetoday is working.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //-------TradingView------
    String winHandleTradingView = driver.getWindowHandle();
    WebElement elementTradingView = driver.findElement(By.className("bottom-social-wr"));
    elementTradingView.findElement(By.cssSelector("[href=\"https://www.tradingview.com/u/ExratesAnalytics/\"]")).click();
    for(String winHandlTradingView : driver.getWindowHandles()){
        driver.switchTo().window(winHandlTradingView);
    }
    WebElement dynamicHandleFooterTradingView = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("tv-content")));
    String titleFooterTradingView = driver.getTitle();
    System.out.println(titleFooterTradingView);
    Assert.assertTrue(titleFooterTradingView.equals("Trader ExratesAnalytics — Trading Ideas & Charts — TradingView"));
    driver.close();
    driver.switchTo().window(winHandleTradingView);
        System.out.println("TradingView is working.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //-------Youtube------
    String winHandleYoutube = driver.getWindowHandle();
    WebElement elementYoutube = driver.findElement(By.className("bottom-social-wr"));
    elementYoutube.findElement(By.cssSelector("[href=\"https://www.youtube.com/channel/UCgd0-iZjMBwtbM72M6ux6fw\"]")).click();
    for(String winHandlYoutube : driver.getWindowHandles()){
        driver.switchTo().window(winHandlYoutube);
    }
    WebElement dynamicHandleFooterYoutube = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("channel-header")));
    String titleFooterYoutube = driver.getTitle();
    System.out.println(titleFooterYoutube);
    Assert.assertTrue(titleFooterYoutube.equals("Cryptocurrency Exchange Exrates - YouTube"));
    driver.close();
    driver.switchTo().window(winHandleYoutube);
        System.out.println("TradingView is working.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //-------Medium------
    String winHandleMedium = driver.getWindowHandle();
    WebElement elementMedium = driver.findElement(By.className("bottom-social-wr"));
    elementMedium.findElement(By.cssSelector("[href=\"https://medium.com/@exrates.me\"]")).click();
    for(String winHandlMedium : driver.getWindowHandles()){
        driver.switchTo().window(winHandlMedium);
    }
    WebElement dynamicHandleFooterMedium = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("root")));
    String titleFooterMedium = driver.getTitle();
    System.out.println(titleFooterMedium);
    Assert.assertTrue(titleFooterMedium.equals("Exrates.me – Medium"));
    driver.close();
    driver.switchTo().window(winHandleMedium);
        System.out.println("Medium is working.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //-------Facebook------
    String winHandleFacebook = driver.getWindowHandle();
    WebElement elementFacebook = driver.findElement(By.className("bottom-social-wr"));
    elementFacebook.findElement(By.cssSelector("[href=\"https://www.facebook.com/exrates/\"]")).click();
    for(String winHandlFacebook : driver.getWindowHandles()){
        driver.switchTo().window(winHandlFacebook);
    }
    WebElement dynamicHandleFooterFacebook2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("globalContainer")));
    String titleFooterFacebook2 = driver.getTitle();
    System.out.println(titleFooterFacebook);
    Assert.assertTrue(titleFooterFacebook.equals("Exrates Exchange - Главная | Facebook"));
    driver.close();
    driver.switchTo().window(winHandleFacebook);
        System.out.println("Facebook is working.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //-------Instagram------
    String winHandleInstagram = driver.getWindowHandle();
    WebElement elementInstagram = driver.findElement(By.className("bottom-social-wr"));
    elementInstagram.findElement(By.cssSelector("[href=\"https://www.instagram.com/exrates.me/\"]")).click();
    for(String winHandlInstagram : driver.getWindowHandles()){
        driver.switchTo().window(winHandlInstagram);
    }
    WebElement dynamicHandleFooterInstagram = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("v9tJq ")));
    String titleFooterInstagram = driver.getTitle();
    System.out.println(titleFooterInstagram);
    Assert.assertTrue(titleFooterInstagram.equals("Exrates (@exrates.me) • Фото и видео в Instagram"));
    driver.close();
    driver.switchTo().window(winHandleInstagram);
        System.out.println("Instagram is working.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    // дописать переход на инстограмм
    //выше готово поправить только входные данные
        /* ********************************Home page footer bottom Link********************************************** */
    }

}
