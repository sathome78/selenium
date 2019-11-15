package me.exrates;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Scanner;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class ApplyMain extends WebDriverSettings{



    @Test
    public void firstTest() throws InterruptedException {

    ApplyToList applyToList = PageFactory.initElements(driver, ApplyToList.class);
    ApplyToList.applyStart();

    TokenSale tokenSale = PageFactory.initElements(driver, TokenSale.class);
    TokenSale.tokenSaleStart();
    //     дописать

    Analytics analytics = PageFactory.initElements(driver, Analytics.class);
    Analytics.analyticsStart();

    Prediction prediction = PageFactory.initElements(driver, Prediction.class);
    Prediction.PredictionStart();
    // дописать есть еще ссылки для переходов

    Victory victory = PageFactory.initElements(driver, Victory.class);
    Victory.victoryStart();

    Footer footer = PageFactory.initElements(driver, Footer.class);
    Footer.footerStart();

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    HomePage.homePageStart();
























//      // <----------------------------- ниже старое пересмотреть и стереть --------------------------------->

//    driver.manage().window().maximize();
//    driver.get("https://exrates.me/");


/* ********************************Home page*********************************************** */
//        driver.manage().window().maximize();
//        driver.get("https://exrates.me/");



//    //<------Home page  top menu ------>
//

//
//
//      driver.manage().window().maximize();
//      driver.get("https://exrates.me/");
//      // <----------------------------- Header Menu--------------------------------->
//      System.out.println("Start testing Menu");
//      // дописать пин повторящийся
////    Thread.sleep(150000);
////    WebElement dynamicMenu = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("content")));
////    WebElement elementMenu = driver.findElement(By.className("header__inner"));
////    //trade
////    elementMenu.findElement(By.xpath("./ul/li[1]/a")).click();
////    WebElement dynamicMenuTrade = (new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.className("gridster-item-inner")));
////    //balanse
////        Thread.sleep(5000);
////        WebDriverWait wait = new WebDriverWait(driver, 30);
////        wait.until(visibilityOfElementLocated(By.className("header")));
////        WebElement elementMenubalanse = driver.findElement(By.className("submenu"));
////
////        elementMenubalanse.findElement(By.xpath("./ul/li[1]/a")).click();
//////        elementMenubalanse.findElement(By.cssSelector("[routerlink=\"/funds/balances\"]")).click();
////    WebElement dynamicMenuBalanse = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("table__body")));
////    //Transaction history
////    elementMenu.findElement(By.xpath("./ul/li[2]/div/ul/li[2]/a")).click();
////    WebElement dynamicMenuTransaction = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.className("table")));
////
////
////    elementMenu.findElement(By.xpath("./ul/li[3]/a")).click();
////--------------
////----выше подумать как сделать
////--------------
        //  перенес в файл
//    WebElement dynamicMenu = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("content")));
//    WebElement elementMenu = driver.findElement(By.className("header__inner"));
//    elementMenu.findElement(By.cssSelector("[href=\"https://about.exrates.me/form-listing\"]")).click();
//    WebDriverWait waitApply = new WebDriverWait(driver, 10 );
//    waitApply.until(visibilityOfElementLocated(By.cssSelector("form")));
//    String titleMenuApply = driver.getTitle();
//    System.out.println(titleMenuApply);
//    Assert.assertTrue(titleMenuApply.equals("Apply for listing | Exrates"));
//    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
//    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
//    driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
//    Random random = new Random();
//    int n = random.nextInt(100)+1;
//    String email = "olex-nick" + n + "@gmail.com";
//    driver.findElement(By.id("id_email")).sendKeys(email);
//    driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
//    driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
//    WebElement recaptcha = driver.findElement(By.className("capcha-container"));
//    System.out.println(recaptcha);
//    //решить вопрос с капчей и всплывающим окном//
//    //recaptcha.click();
//    //    driver.findElement(By.className("standart-btn")).click();
//    System.out.println("Apply for Listing is OK");
//    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
//    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
//    driver.findElement(By.id("id_name")).clear();
//    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
//    driver.findElement(By.id("id_telegram")).clear();
//    driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
//    Random randomListing = new Random();
//    int q = randomListing.nextInt(100)+1;
//    String emailListing = "olex-nick" + q + "@gmail.com";
//    driver.findElement(By.id("id_email")).clear();
//    driver.findElement(By.id("id_email")).sendKeys(emailListing);
//    driver.findElement(By.id("id_company_name")).clear();
//    driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
//    driver.findElement(By.id("id_link_to_project")).clear();
//    driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
//    //    решить вопрос с капчей и всплывающим окном//
//    //    WebElement recaptchaListing = driver.findElement(By.className("capcha-container"));
//    //    System.out.println(recaptcha);
//    //    recaptchaListing.click();
//    //    driver.findElement(By.className("standart-btn")).click();
//    System.out.println("I need to list a coin is OK");
//    WebElement dynamicBackBtn = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("back-btn")));
//    driver.findElement(By.className("back-btn")).click();
//    // ----- menu ieo
        //перенес в фаил ++++++++++++++++++++
//
























//
//    JavascriptExecutor jsx10 = (JavascriptExecutor)driver;
//    jsx10.executeScript("window.scrollBy(0,450)", "");
//    WebElement lineWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("slick-track")));
//

//        int linkCount= driver.findElement(By.className("slick-track")).findElements(By.tagName("a")).contains();
//        List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='slick-track']/a"));
//        int s = allElements.size();
//        List<WebElement> linksToClick = driver.findElement(By.className("lick-track")).findElements(By.tagName("a"));
//
//        for (int i = 0; i <= s; i++ )
//        {
//            linksToClick.get(i).click();
////            waitPage(10);
//            driver.navigate().back();
//
//        }
//


/*
    List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='slick-track']/a"));
    int s = allElements.size();
    System.out.println("s " + s);
    System.out.println("allElements " + allElements);
//        allElements
    for(int i=1; i<=s; i++){

//       System.out.println( allElements[i]);
//        List<WebElement> allElements2 = driver.findElements(By.xpath("//div["+i+"][@class='slick-track']/a"));
//        allElements = driver.findElements(By.xpath("//div["+i+"]/a"));
//        allElements = driver.findElements(By.xpath("//div["+i+"]/a"));

//         allElements.
//        allElements.getText();
//        System.out.println(allElements2);
//        System.out.println(allElements);
//        allElements.get(i).click();
    }


//        WebElement elementLine = driver.findElement(By.className("slick-track"));
//
//        List<WebElement> parentElements = driver.findElements(By.className("run-line"));
//        System.out.println(parentElements);
//        List<WebElement> childElements = parentElements.get(0).findElements(By.xpath("(.//*[@class='slide'])"));
//        System.out.println(childElements);
//
//        WebElement  elementTest = driver.findElement(By.className("slick-list.draggable"));
//        System.out.println(elementTest);


//        List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='...']/ul/li"));
//
//        for (WebElement element: allElements) {
//            System.out.println(element.getText());
//        }



*/




/*  Разделы тестирования
1 - Home page
2 - Trade
3 - Funds
4 - Order
5 - Free coins
6 - Apply to list
7 - Token sale
8 - Analytics
9 - Prediction
10 - Community
11 - News
12 - Login
 */


//        Scanner in = new Scanner(System.in);
//        System.out.println(in);
//        int testNamber = in.nextInt();



//switch (testNamber) {
//    case 0:
//        /*
//        HomePageHeader();
//        HomePageBaner();
//        HomePageLine();
//        HomePageIcons();
//        HomePageMarkets();
//        HomePageBanerFooter();
//        HomePageFooter();
//        HomePageFooterSocial();*/
//        System.out.println("testNamber " +testNamber);
//        break;
//    case 1:
//        System.out.println("testNamber "  + testNamber);
//        break;
//}
//









































































///--------------------------

//        String  parentWindowFooter = driver.getWindowHandle();
//    WebElement elementWindowFooter = driver.findElement(By.className("social-wr"));
//    elementWindowFooter.findElement(By.cssSelector("[href=\"https://twitter.com/Exrates_Me_\"]")).click();
//    //      System.out.println(elementTermsFirst);
//    driver.navigate().back();
//    driver.switchTo().window(parentWindowFooter);
//    String  parentWindowNew = driver.getWindowHandle();
//    System.out.println(parentWindowNew);
//    driver.navigate().back();
//        elementFooter.findElement(By.cssSelector("[href=\"https://twitter.com/Exrates_Me_\"]")).click();





//    String  parentWindowSupport = driver.getWindowHandle();
//    System.out.println(parentWindowSupport);
//    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/how-to-register\"]")).click();
//    String  childWindowSupport = driver.getWindowHandle();
//    System.out.println(childWindowSupport);
//    driver.switchTo().window(childWindowSupport);
//        WebElement dynamicSupportPage = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
//        String titleSupportPage = driver.getTitle();
//        Assert.assertTrue(titleSupportPage.equals("How to register on Exrates?"));
//        driver.close();
//
//    driver.switchTo().window(parentWindowSupport);


///--------------------------
        //        System.out.println("Start testing Viktori");
//        driver.manage().window().maximize();
//        driver.get("https://exrates.me/dashboard");
//        WebDriverWait wait = new WebDriverWait(driver, 100);
//        WebElement dynamicTerms1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("top-part")));
//        driver.findElement(By.cssSelector("[href=\"https://about.exrates.me/about-us\"]")).click();



//-----------------
//    WebElement dynamicContact2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("sc-bxivhb.sc-ifAKCX.kPfswV")));
//    WebElement elementChart = driver.findElement(By.className("sc-bxivhb.sc-ifAKCX.kPfswV"));
//    elementChart.findElement(By.tagName("button")).click();


//        WebElement element = driver.findElement(By.xpath("//div[@class='main']"));
//        element.findElement(By.Xpath("./tr/td[1]")).getText();


//        elementContact.findElement(By.xpath("//a[@href='/en/client-center/']")).click();
//    elementContact.findElement(By.linkText("Support")).click();
//    elementContact.findElement(By.cssSelector("[href=\"/en/client-center/\"]")).click();




//        driver.get("https://exrates.me/dashboard");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Exrates | Dashboard"));
//        WebElement header = driver.findElement(By.className("header"));
//        header.findElement(By.cssSelector("[href=\"https://about.exrates.me/form-listing\"]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10 );
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
//        driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
//        driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
//        driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
//        Random random = new Random();
//        int n = random.nextInt(100)+1;
//        String email = "olex-nick" + n + "@gmail.com";
//        driver.findElement(By.id("id_email")).sendKeys(email);
//        driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
//        driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
//        driver.findElement(By.className("standart-btn")).click();

//  driver.navigate().refresh();
//  WebDriverWait wait = new WebDriverWait(driver, 1000 );

// старое
        //    WebElement dynamicContactStartIeo = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("form-part")));
//    String titleContactStartIeo = driver.getTitle();
//    Assert.assertTrue(titleContactStartIeo.equals("Apply for listing | Exrates"));
//    WebElement elementContactH2 = driver.findElement(By.className("description"));
//    String elementContactInsideH0 = elementContactH2.findElement(By.tagName("p")).getText();
//    System.out.println("Apply for listing | Exrates || " + elementContactInsideH0);
//    WebDriverWait waitContactListCoin = new WebDriverWait(driver, 10 );
//    waitContactListCoin.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
//    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
//    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
//    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
//    Random randomContactListCoin = new Random();
//    int nContactListCoin = randomContactListCoin.nextInt(100)+1;
//    String emailContactListCoin = "AleksandrHorovykh" + nContactListCoin + "@gmail.com";
//    driver.findElement(By.id("id_email")).sendKeys(emailContactListCoin);
//    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
//    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
//    // прохождение капчи
//    //    driver.findElement(By.className("standart-btn")).click();
//    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
//    //    System.out.println(recaptchaAnbout);
//    //    recaptchaAnbout.click();
//    //    driver.findElement(By.className("standart-btn")).click();
//    WebDriverWait waitContactIeo = new WebDriverWait(driver, 10 );
//    waitContactIeo.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
//    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
//    driver.findElement(By.id("id_name")).clear();
//    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
//    driver.findElement(By.id("id_telegram")).clear();
//    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
//    Random randomContactIeo = new Random();
//    int nContactStartIeo = randomContactIeo.nextInt(100)+1;
//    String emailContactStartIeo = "AleksandrHorovykh" + nContactStartIeo + "@gmail.com";
//    driver.findElement(By.id("id_email")).clear();
//    driver.findElement(By.id("id_email")).sendKeys(emailContactStartIeo);
//    driver.findElement(By.id("id_company_name")).clear();
//    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
//    driver.findElement(By.id("id_link_to_project")).clear();
//    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
//    // прохождение капчи
//    //    driver.findElement(By.className("standart-btn")).click();
//    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
//    //    System.out.println(recaptchaAnbout);
//    //    recaptchaAnbout.click();
//    //    driver.findElement(By.className("standart-btn")).click();
//    driver.findElement(By.className("back-btn")).click();

    }


}



