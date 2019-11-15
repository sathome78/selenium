package me.exrates;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Victory {
    private static WebDriver driver;

    public Victory(WebDriver driver){
        this.driver = driver;
    }

    public static void victoryStart(){
        driver.manage().window().maximize();
        driver.get("https://exrates.me/");
        //    //<---------------------------------------------------------------------------------->
//    //<------About us ------>
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Start testing Viktory");
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    WebDriverWait wait = new WebDriverWait(driver, 300);
    WebElement dynamicTerms1 = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("top-part")));
    WebDriverWait wait2 = new WebDriverWait(driver, 1000);
    driver.findElement(By.cssSelector("[href=\"https://about.exrates.me/about-us\"]")).click();
//        WebElement  elementlinkNavigatAbout =  driver.findElement(By.cssSelector("[href=\"https://about.exrates.me/about-us\"]"));
//      System.out.println("Navigating to link" + elementlinkNavigatAbout);
    String titleAboutUs = driver.getTitle();
    WebElement dynamicElementAbout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("form-wp")));
    Assert.assertTrue(titleAboutUs.equals("About us | Exrates"));
    String AboutUsH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + AboutUsH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


//        System.out.println(elementlinkNavigatAbout + " is working");
    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
    Random randomAboutIeo = new Random();
    int nAboutIeo = randomAboutIeo.nextInt(100)+1;
    String emailAboutIeo = "olex-nick" + nAboutIeo + "@upholding.biz";
    driver.findElement(By.id("id_email")).sendKeys(emailAboutIeo);
    driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
    //    прохождение капчи
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("empty-btn")).click();
    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@olexnick"));
    Random randomAboutListing = new Random();
    int nAboutListing = randomAboutListing.nextInt(100)+1;
    String emailAboutListing = "olex-nick" + nAboutListing + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailAboutListing);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("OlexNick");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://olexnick.com");
    //    прохождение капчи
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("empty-btn")).click();

    ////<------Contacts  ------>
    WebElement elementContact = driver.findElement(By.className("sidebar-list"));
    elementContact.findElement(By.xpath("./li[2]/a")).click(); //  работает но вариант спорный
    WebElement dynamicContact = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    String titleContact = driver.getTitle();
    Assert.assertTrue(titleContact.equals("Contact us | Exrates"));
    String ContactH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + ContactH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    WebElement dynamicContact1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    WebElement elementVip = driver.findElement(By.cssSelector("a.standart-btn.reverse.vip"));
    elementVip.click();
    //    прохождение чарт сервиса
    //    driver.switchTo().defaultContent();
    //    driver.switchTo().frame("webWidget");
    //    driver.findElement(By.id("garden-field-container-720--input")).click(); дописать закрытие окна
    // переход  по банерам
    WebElement elementBaner = driver.findElement(By.className("banners-part"));
    elementBaner.findElement(By.xpath("./a[1]")).click();
    //List coint
    WebElement dynamicContactStartIeo = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("form-part")));
    String titleContactStartIeo = driver.getTitle();
    Assert.assertTrue(titleContactStartIeo.equals("Apply for listing | Exrates"));
    WebElement elementContactH2 = driver.findElement(By.className("description"));
    String elementContactInsideH0 = elementContactH2.findElement(By.tagName("p")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + elementContactInsideH0);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    WebDriverWait waitContactListCoin = new WebDriverWait(driver, 10 );
    waitContactListCoin.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomContactListCoin = new Random();
    int nContactListCoin = randomContactListCoin.nextInt(100)+1;
    String emailContactListCoin = "AleksandrHorovykh" + nContactListCoin + "@gmail.com";
    driver.findElement(By.id("id_email")).sendKeys(emailContactListCoin);
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    WebDriverWait waitContactIeo = new WebDriverWait(driver, 10 );
    waitContactIeo.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomContactIeo = new Random();
    int nContactStartIeo = randomContactIeo.nextInt(100)+1;
    String emailContactStartIeo = "AleksandrHorovykh" + nContactStartIeo + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailContactStartIeo);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    driver.findElement(By.className("back-btn")).click();
    //Advisor team
    WebElement elementBanerNex = driver.findElement(By.className("banners-part"));
    elementBanerNex.findElement(By.xpath("./a[2]")).click();
    WebElement dynamicContactAmbassador = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("how-get")));
    String titleContactAmbassador = driver.getTitle();
    Assert.assertTrue(titleContactAmbassador.equals("Become an Ambassador | Exrates"));
    String AmbassadorContactH2 = driver.findElement(By.tagName("h2")).getText();
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Page is opened title is - " + AmbassadorContactH2);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    driver.findElement(By.className("standart-btn")).click();
    // <------подраздел Cryptocurrency Exchange  ------>
    WebDriverWait waitContactCryptocurrency = new WebDriverWait(driver, 10 );
    waitContactCryptocurrency.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomContactCryptocurrency = new Random();
    int nContactCryptocurrency = randomContactCryptocurrency.nextInt(100)+1;
    String emailContactStartCryptocurrency = "AleksandrHorovykh" + nContactCryptocurrency + "@gmail.com";
    driver.findElement(By.id("id_email")).sendKeys(emailContactStartCryptocurrency);
    driver.findElement(By.id("id_linkedin")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    driver.findElement(By.className("back-btn")).click();
    // <------подраздел Cryptocurrency Exchange  ------>
    WebElement dynamicContactAmbassador2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("how-get")));
    WebElement elementContactView = driver.findElement(By.className("button-part"));
    elementContactView.findElement(By.xpath(".//div[2]/a")).click();
    WebElement dynamicContactAdvisorExchange = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    String AdvisorContactExchangeH1 = driver.findElement(By.tagName("h1")).getText();
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Page is opened title is - " + AdvisorContactExchangeH1);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    driver.findElement(By.cssSelector("[href=\"#respons\"]")).click();
    //    WebElement elementServices = driver.findElement(By.className("advisor-navigation-wr"));
    //    elementServices.findElement(By.xpath("./li[2]/a")).click();
    //    WebElement elementServices3 = driver.findElement(By.className("advisor-navigation-wr")); ??????????
    //    elementServices3.findElement(By.xpath("./li[3]/a")).click(); ???????????????
    WebDriverWait waitContactAdvisor = new WebDriverWait(driver, 30 );
    waitContactAdvisor.until(ExpectedConditions.visibilityOfElementLocated(By.className("right-col")));
    WebElement elementSelectAdvisor = driver.findElement(By.className("checkbox-wr"));
    //    elementSelectAdvisor.findElement(By.xpath("./div[1]/label[1]")).click();
    //    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomContactAdvisorIeo = new Random();
    int nContactAdvisorIeo = randomContactAdvisorIeo.nextInt(100)+1;
    String emailContactAdvisorIeo = "AleksandrHorovykh" + nContactAdvisorIeo + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailContactAdvisorIeo);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    WebDriverWait waitContactAdvisorCoint = new WebDriverWait(driver, 10 );
    waitContactAdvisorCoint.until(ExpectedConditions.visibilityOfElementLocated(By.className("right-col")));
    WebElement elementSelectAdvisor2 = driver.findElement(By.className("checkbox-wr"));
    elementSelectAdvisor2.findElement(By.xpath("./div[2]/label[1]")).click();
    //    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomContactAdvisorCoint = new Random();
    int nContactAdvisorCoint = randomContactAdvisorCoint.nextInt(100)+1;
    String emailContactAdvisorCoint = "AleksandrHorovykh" + nContactAdvisorCoint + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailContactAdvisorCoint);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    driver.findElement(By.cssSelector("[href=\"https://exrates.me\"]")).click();
    // дописать прохождения телеграм и линьки динь
    // кнопка велком  Vip
    // <------Support  ------>
    WebDriverWait waitSupport = new WebDriverWait(driver, 300);
    WebElement dynamicSupportTerms1 = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.className("top-part")));
    WebDriverWait waitSupport2 = new WebDriverWait(driver, 1000);
    driver.findElement(By.cssSelector("[href=\"https://about.exrates.me/about-us\"]")).click();
    WebElement elementSupport = driver.findElement(By.className("sidebar-list"));
    elementSupport.findElement(By.xpath("./li[3]/a")).click(); //  работает но вариант спорный
    WebElement dynamicSupport = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    String titleSupport = driver.getTitle();
    Assert.assertTrue(titleSupport.equals("Support | Exrates"));
    String SupportH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + SupportH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    WebElement elementDropdown1 =driver.findElement(By.className("drop-wr"));
    elementDropdown1.click();
    WebElement elementDropdown = driver.findElement(By.className("dropdown"));
    elementDropdown.findElement(By.xpath("./div[1]")).click();
    elementDropdown1.click();
    WebElement elementDropdown2 = driver.findElement(By.className("dropdown"));
    elementDropdown2.findElement(By.xpath("./div[2]")).click();
    elementDropdown1.click();
    WebElement elementDropdown3 = driver.findElement(By.className("dropdown"));
    elementDropdown3.findElement(By.xpath("./div[3]")).click();
    elementDropdown1.click();
    WebElement elementDropdown4 = driver.findElement(By.className("dropdown"));
    elementDropdown4.findElement(By.xpath("./div[4]")).click();
    elementDropdown1.click();
    WebElement elementDropdown5 = driver.findElement(By.className("dropdown"));
    elementDropdown5.findElement(By.xpath("./div[5]")).click();
    elementDropdown1.click();
    WebElement elementDropdown6 = driver.findElement(By.className("dropdown"));
    elementDropdown6.findElement(By.xpath("./div[6]")).click();
    elementDropdown1.click();
    WebElement elementDropdown7 = driver.findElement(By.className("dropdown"));
    elementDropdown7.findElement(By.xpath("./div[7]")).click();
    //    elementDropdown1.click();
    //    WebElement elementDropdown8 = driver.findElement(By.className("dropdown"));
    //    elementDropdown8.findElement(By.xpath("./div[8]")).click();
    //    elementDropdown1.click();
    //    WebElement elementDropdown9 = driver.findElement(By.className("dropdown"));
    //    elementDropdown9.findElement(By.xpath("./div[9]")).click();
    //    elementDropdown1.click();
    //    WebElement elementDropdown10 = driver.findElement(By.className("dropdown"));
    //    elementDropdown10.findElement(By.xpath("./div[10]")).click();
    //    elementDropdown1.click();
    //    WebElement elementDropdown11 = driver.findElement(By.className("dropdown"));
    //    elementDropdown11.findElement(By.xpath("./div[11]")).click();
    //    elementDropdown1.click();
    //    WebElement elementDropdown12 = driver.findElement(By.className("dropdown"));
    //    elementDropdown12.findElement(By.xpath("./div[12]")).click();
    driver.findElement(By.id("id_email")).sendKeys("aleksandr.horovykh@upholding.biz");
    driver.findElement(By.id("id_message")).sendKeys("Test");
    //     driver.findElement(By.className("standart-btn.reverse")).click();
    String winHandleBefore = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/how-to-register\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage = driver.getTitle();
    Assert.assertTrue(titleSupportPage.equals("How to register on Exrates?"));
    driver.close();
    driver.switchTo().window(winHandleBefore);
    //падает так как сервер отдеет 502

    String winHandleBefore2 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/inputoutput\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage2 = driver.getTitle();
    Assert.assertTrue(titleSupportPage2.equals("Input/Output"));
    driver.close();
    driver.switchTo().window(winHandleBefore2);

    String winHandleBefore3 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/inputoutput\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage3 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage3 = driver.getTitle();
    Assert.assertTrue(titleSupportPage3.equals("Input/Output"));
    driver.close();
    driver.switchTo().window(winHandleBefore3);
    String winHandleBefore4 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/commissions\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage4 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage4 = driver.getTitle();
    Assert.assertTrue(titleSupportPage4.equals("Commissions"));
    driver.close();
    driver.switchTo().window(winHandleBefore4);
    String winHandleBefore5 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/i-havent-received-email\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage5 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage5 = driver.getTitle();
    Assert.assertTrue(titleSupportPage5.equals("I haven't received an Email"));
    driver.close();
    driver.switchTo().window(winHandleBefore5);
    String winHandleBefore6 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/how-create-my-first-order\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage6 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage6 = driver.getTitle();
    Assert.assertTrue(titleSupportPage6.equals("How to create my first order?"));
    driver.close();
    driver.switchTo().window(winHandleBefore6);
    String winHandleBefore7 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/verification\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage7 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage7 = driver.getTitle();
    Assert.assertTrue(titleSupportPage7.equals("Verification"));
    driver.close();
    driver.switchTo().window(winHandleBefore7);
    String winHandleBefore8 = driver.getWindowHandle();
    driver.findElement(By.cssSelector("[href=\"https://support.exrates.me/article/api\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage8 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("wrapper-inner")));
    String titleSupportPage8 = driver.getTitle();
    Assert.assertTrue(titleSupportPage8.equals("API"));
    driver.close();
    driver.switchTo().window(winHandleBefore8);
    String winHandleBefore9 = driver.getWindowHandle();
    WebElement element9 = driver.findElement(By.className("questions-list"));
        element9.findElement(By.xpath(("./li[9]/a"))).click();
    //    driver.findElement(By.cssSelector("[href=\"/en/form-listing/\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage9 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("form-listing-wr")));
    String titleSupportPage9 = driver.getTitle();
    Assert.assertTrue(titleSupportPage9.equals("Apply for listing | Exrates"));
    driver.close();
    driver.switchTo().window(winHandleBefore9);
    String winHandleBefore10 = driver.getWindowHandle();
        WebElement element10 = driver.findElement(By.className("questions-list"));
        element10.findElement(By.xpath(("./li[10]/a"))).click();
    //    driver.findElement(By.cssSelector("[href=\"/en/become-ambassador/\"]")).click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
    }
    WebElement dynamicSupportPage10 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("how-get")));
    String titleSupportPage10 = driver.getTitle();
    Assert.assertTrue(titleSupportPage10.equals("Become an Ambassador | Exrates"));
    driver.close();
    driver.switchTo().window(winHandleBefore10);
    // <------Privacy policy  ------>
    WebElement elementPolicy = driver.findElement(By.className("sidebar-list"));
    elementPolicy.findElement(By.xpath("./li[4]/a")).click(); //  работает но вариант спорный
    WebElement dynamicPolicy = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    String titlePolicy = driver.getTitle();
    Assert.assertTrue(titlePolicy.equals("Contact us | Exrates"));
    String PolicyH2 = driver.findElement(By.tagName("h2")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + PolicyH2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    // <------TermsOfUse  ------>
    driver.findElement(By.cssSelector("[href=\"https://exrates.me/static/terms-and-conditions\"]")).click();
    WebElement dynamicTerms = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    String titleTerms = driver.getTitle();
    Assert.assertTrue(titleTerms.equals("Terms & Conditions"));
    WebElement elementH1 = driver.findElement(By.tagName("h1"));
    String h1teg = elementH1.getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + h1teg);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    String  parentWindow = driver.getWindowHandle();
    //        System.out.println(parentWindow);
    WebElement elementTermsFirst = driver.findElement(By.xpath("//*[contains(text(), ' DexTechnologies OÜ reserves the right at any time to verify your identity for the purposes of complying with the ')]"));
    elementTermsFirst.findElement(By.tagName("a")).click();
    driver.navigate().back();
    WebElement elementTermsSecond = driver.findElement(By.xpath("//*[contains(text(), '1.5: DexTechnologies OÜ reserves the right at any time to verify your identity for the purposes of complying with the ')]"));
    elementTermsSecond.findElement(By.tagName("a")).click();
    //      System.out.println(elementTermsFirst);
    driver.navigate().back();
    driver.switchTo().window(parentWindow);
    String  parentWindowNew = driver.getWindowHandle();
    System.out.println(parentWindowNew);
    driver.navigate().back();
    // <------Start IEO  ------>
    WebElement elementStartIeo = driver.findElement(By.className("sidebar-list"));
    elementStartIeo.findElement(By.xpath("./li[6]/a")).click(); //  работает но вариант спорный
    WebElement dynamicStartIeo = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("form-part")));
    String titleStartIeo = driver.getTitle();
    Assert.assertTrue(titleStartIeo.equals("Apply for listing | Exrates"));
    WebElement elementH2 = driver.findElement(By.className("description"));
    String elementInsideH0 = elementH2.findElement(By.tagName("p")).getText();
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Page is opened title is - " + elementInsideH0);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    WebDriverWait waitListCoin = new WebDriverWait(driver, 10 );
    waitListCoin.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomListCoin = new Random();
    int nListCoin = randomListCoin.nextInt(100)+1;
    String emailListCoin = "AleksandrHorovykh" + nListCoin + "@gmail.com";
    driver.findElement(By.id("id_email")).sendKeys(emailListCoin);
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    WebDriverWait waitIeo = new WebDriverWait(driver, 10 );
    waitIeo.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomIeo = new Random();
    int nStartIeo = randomIeo.nextInt(100)+1;
    String emailtartIeo = "AleksandrHorovykh" + nStartIeo + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailtartIeo);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    driver.findElement(By.className("back-btn")).click();
    // <------Ambassador  ------>
    WebElement elementAmbassador = driver.findElement(By.className("sidebar-list"));
    elementAmbassador.findElement(By.xpath("./li[7]/a")).click(); //  работает но вариант спорный
    WebElement dynamicAmbassador = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("how-get")));
    String titleAmbassador = driver.getTitle();
    Assert.assertTrue(titleAmbassador.equals("Become an Ambassador | Exrates"));
    String AmbassadorH2 = driver.findElement(By.tagName("h2")).getText();
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Page is opened title is - " + AmbassadorH2);
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    driver.findElement(By.className("standart-btn")).click();
    // <------подраздел Cryptocurrency Exchange  ------>
    WebDriverWait waitCryptocurrency = new WebDriverWait(driver, 10 );
    waitCryptocurrency.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-part")));
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomCryptocurrency = new Random();
    int nCryptocurrency = randomCryptocurrency.nextInt(100)+1;
    String emailtartCryptocurrency = "AleksandrHorovykh" + nCryptocurrency + "@gmail.com";
    driver.findElement(By.id("id_email")).sendKeys(emailtartCryptocurrency);
    driver.findElement(By.id("id_linkedin")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    driver.findElement(By.className("back-btn")).click();
    // <------подраздел Cryptocurrency Exchange  ------>
    WebElement dynamicAmbassador2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("how-get")));
    WebElement elementView = driver.findElement(By.className("button-part"));
    elementView.findElement(By.xpath(".//div[2]/a")).click();
    WebElement dynamicAdvisorExchange = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("content-part")));
    //     String titleAdvisorExchange = driver.getTitle();
    //     Assert.assertTrue(titleAdvisorExchange.equals("Become an Ambassador | Exrates"));
    String AdvisorExchangeH1 = driver.findElement(By.tagName("h1")).getText();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Page is opened title is - " + AdvisorExchangeH1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    driver.findElement(By.cssSelector("[href=\"#respons\"]")).click();
    //    WebElement elementServices = driver.findElement(By.className("advisor-navigation-wr"));
    //    elementServices.findElement(By.xpath("./li[2]/a")).click();
    //    WebElement elementServices3 = driver.findElement(By.className("advisor-navigation-wr")); ??????????
    //    elementServices3.findElement(By.xpath("./li[3]/a")).click(); ???????????????
    WebDriverWait waitAdvisor = new WebDriverWait(driver, 30 );
    waitAdvisor.until(ExpectedConditions.visibilityOfElementLocated(By.className("right-col")));
    driver.findElement(By.xpath("//label[@for='id_request_type_1']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomAdvisorIeo = new Random();
    int nAdvisorIeo = randomAdvisorIeo.nextInt(100)+1;
    String emailAdvisorIeo = "AleksandrHorovykh" + nAdvisorIeo + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailAdvisorIeo);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    WebDriverWait waitAdvisorCoint = new WebDriverWait(driver, 10 );
    waitAdvisorCoint.until(ExpectedConditions.visibilityOfElementLocated(By.className("right-col")));
    driver.findElement(By.xpath("//label[@for='id_request_type_0']")).click();
    driver.findElement(By.id("id_name")).clear();
    driver.findElement(By.id("id_name")).sendKeys("Olex-nick");
    driver.findElement(By.id("id_telegram")).clear();
    driver.findElement(By.id("id_telegram")).sendKeys(("@AleksandrHorovykh"));
    Random randomAdvisorCoint = new Random();
    int nAdvisorCoint = randomAdvisorCoint.nextInt(100)+1;
    String emailAdvisorCoint = "AleksandrHorovykh" + nAdvisorCoint + "@gmail.com";
    driver.findElement(By.id("id_email")).clear();
    driver.findElement(By.id("id_email")).sendKeys(emailAdvisorCoint);
    driver.findElement(By.id("id_company_name")).clear();
    driver.findElement(By.id("id_company_name")).sendKeys("AleksandrHorovykh");
    driver.findElement(By.id("id_link_to_project")).clear();
    driver.findElement(By.id("id_link_to_project")).sendKeys("https://aleksandr.com");
    // прохождение капчи
    //    driver.findElement(By.className("standart-btn")).click();
    //    WebElement recaptchaAnbout = driver.findElement(By.className("capcha-container"));
    //    System.out.println(recaptchaAnbout);
    //    recaptchaAnbout.click();
    //    driver.findElement(By.className("standart-btn")).click();
    driver.findElement(By.cssSelector("[href=\"https://exrates.me\"]")).click();
    // дописать прохождения телеграм и линьки динь
    // кнопка велком  Vip
    //<-----------------------Готов выше ----------------------------------------------------------->

    }
}
