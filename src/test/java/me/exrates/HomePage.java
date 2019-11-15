package me.exrates;

import com.google.gson.internal.$Gson$Preconditions;
import com.sun.jdi.Value;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage {
    private static WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public static void homePageStart() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://exrates.me/");







//        WebElement elementHomeBaner = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.className("register-form")));
//        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//        String subWindowHandler = null;
//        elementHomeBaner.findElement(By.name("email")).sendKeys("aleksandr.horovykh+888@upholding.biz");
//        elementHomeBaner.findElement(By.tagName("button")).click();
//        Set<String> handles = driver.getWindowHandles(); // get all window handles
//        Iterator<String> iterator = handles.iterator();
//        while (iterator.hasNext()){
//            subWindowHandler = iterator.next();
//        }
//        driver.switchTo().window(subWindowHandler); // switch to popup window
//        WebElement elementChekUSA = driver.findElement(By.className("radio-buttons-wr"));
//        elementChekUSA.findElement(By.xpath("./div[2]/label")).click();
//        WebElement elementChekUSAYes = driver.findElement(By.className("checkbox-wr"));
//        elementChekUSAYes.findElement(By.xpath("./label")).click();
//        WebElement elementChekUSANo = driver.findElement(By.className("radio-buttons-wr"));
//        elementChekUSANo.findElement(By.xpath("./div[1]/label")).click();
//        driver.findElement(By.className("popup__close")).click();
//
//        driver.switchTo().window(parentWindowHandler);
//        //  прохождение без капичи









//        WebElement testet  = driver.findElement(By.xpath("//div[contains(@class, 'btn-block') and contains(@class, 'no-auth')]"));
//        System.out.println(testet);





















//        for (int i=1; i<linkElements.size();i++){
//            WebElement color = linkElements.get(i);
//            System.out.println(i);
////            color.findElement(By.tagName("span"));
//           System.out.println(color);
//            String winBefor = driver.getWindowHandle();
//            System.out.println("winBefor " +winBefor);
//           color.click();
//
////            WebElement elementWaitElement = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.className("gridster-container")));
//            String title;
//            title = driver.getTitle();
//
//            System.out.println("title is: "+title);
//          break;
////            driver.navigate().back();
////            String winAfter = driver.getWindowHandle();
////            System.out.println("winAfter " +winAfter);
//
////
////            WebElement elementWaitElementR = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.className("markets-container")));
//
//
//
//        }




//        String[] linkhrefs = new String[linkElements.size()];
//        int k=0;
//        for (String t : linkhrefs) {
//            try{
//                if (t != null ) {
//                    System.out.println("Navigating to link number "+(++k)+": '"+t+"'");
//                    driver.navigate().to(t);
//                    String title;
//                    title = driver.getTitle();
//                    System.out.println("title is: "+title);
//                    //Some known errors, if and when, found in the navigated to page.
//                    if((title.contains("You are not authorized to view this page"))||(title.contains("Page not found"))
//                            ||(title.contains("503 Service Unavailable"))
//                            ||(title.contains("Problem loading page")))
//                    {
//                        System.err.println(t + " the link is not working because title is: "+title);
//                    } else {
//                        System.out.println("\"" + t + "\"" + " is working.");
//                    }
//                }else{
//                    System.err.println("Link's href is null.");
//                }
//            }catch(Throwable e){
//                System.err.println("Error came while navigating to link: "+t+". Error message: "+e.getMessage());
//            }
//            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        }
























        /* ********************************Baner first********************************************** */
        WebElement elementHomeBaner = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.className("register-form")));
        List<WebElement> banerListEmail = driver.findElements(By.xpath("//div[contains(@class, 'slick-list') and contains(@class, 'draggable')]/div/div"));

        for (int b=0; b<banerListEmail.size();b++){
            WebElement elementBaner = banerListEmail.get(b);
            String  idexbol = elementBaner.getAttribute("aria-hidden");
            boolean b2= Boolean.parseBoolean(idexbol);
            if(b2  != true ){
                String parentWindowHandler = driver.getWindowHandle();
                String subWindowHandler = null;
                elementBaner.findElement(By.name("email")).sendKeys("aleksandr.horovykh+888@upholding.biz");

                elementBaner.findElement(By.tagName("button")).click();
                Set<String> handles = driver.getWindowHandles();
                Iterator<String> iterator = handles.iterator();
                while (iterator.hasNext()){
                    subWindowHandler = iterator.next();
                }
                driver.switchTo().window(subWindowHandler);
                WebElement elementChekUSA = driver.findElement(By.className("radio-buttons-wr"));
                elementChekUSA.findElement(By.xpath("./div[2]/label")).click();
                WebElement elementChekUSAYes = driver.findElement(By.className("checkbox-wr"));
                elementChekUSAYes.findElement(By.xpath("./label")).click();
                WebElement elementChekUSANo = driver.findElement(By.className("radio-buttons-wr"));
                elementChekUSANo.findElement(By.xpath("./div[1]/label")).click();
                driver.findElement(By.className("popup__close")).click();
                driver.switchTo().window(parentWindowHandler);
                System.out.println("baner Ok");
                break;
            }

        }
        /* ********************************End first baner********************************************** */
      /* OK-OK ********************************Black Line********************************************** */
    //Тест Home page  Черной линии  на линки (508 линка по времени не быстро)
    List<WebElement> linkElements = driver.findElements(By.xpath("//div[@class='run-line']/div/ngx-slick-carousel/div/div/div/a"));
    System.out.println("The number of links under URL is: "+linkElements.size());

    //Getting all the 'href' attributes from the 'a' tag and putting into the String array linkhrefs
    String[] linkhrefs = new String[linkElements.size()];
    int z = 0;
    for (WebElement e : linkElements) {
        linkhrefs[z] = e.getAttribute("href");
        z++;
    }
    // test each link
    int k=0;
    for (String t : linkhrefs) {
        try{
            if (t != null && !t.isEmpty()) {
                System.out.println("Navigating to link number "+(++k)+": '"+t+"'");
                driver.navigate().to(t);
                String title;
                title = driver.getTitle();
                System.out.println("title is: "+title);
                //Some known errors, if and when, found in the navigated to page.
                if((title.contains("You are not authorized to view this page"))||(title.contains("Page not found"))
                        ||(title.contains("503 Service Unavailable"))
                        ||(title.contains("Problem loading page")))
                {
                    System.err.println(t + " the link is not working because title is: "+title);
                } else {
                    System.out.println("\"" + t + "\"" + " is working.");
                }
            }else{
                System.err.println("Link's href is null.");
            }
        }catch(Throwable e){
            System.err.println("Error came while navigating to link: "+t+". Error message: "+e.getMessage());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    driver.get("https://exrates.me/");
        /* ********************************End Black Line перебор валютных пар********************************************** */
        /* ********************************Icon Home page ********************************************** */
        String titleHome = driver.getTitle();
        Assert.assertTrue(titleHome.equals("Exrates"));
        System.out.println("open home page");
        WebDriverWait waitTT = new WebDriverWait(driver, 1000);
        JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
        jsx2.executeScript("window.scrollBy(0,450)", "");
        WebElement elemenHomeIcon = driver.findElement(By.className("markets-block-link"));
        //   elemenHomeIcon.findElement(By.xpath("./div[1]/a")).click();
        elemenHomeIcon.findElement(By.cssSelector("[href=\"https://about.exrates.me/en/analytics\"]")).click();
        WebElement element1 = driver.findElement(By.className("analitics-page"));
        System.out.println("Professional market analytics is loading");
        WebElement elementHome = driver.findElement(By.className("logo-wr"));
        elementHome.click();
        JavascriptExecutor jsx3 = (JavascriptExecutor)driver;
        jsx3.executeScript("window.scrollBy(0,450)", "");
        WebElement dynamicElementHome = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("markets-block-link")));
        WebElement elementIEO = driver.findElement(By.className("markets-block-link"));
        elementIEO.findElement(By.xpath("//a[@href='/ieo']")).click();
        WebElement dynamicElementIeo = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("common-ieo-container")));
        String elementPageIeo = driver.findElement(By.tagName("h2")).getText();
        System.out.println("Ieo is loading  h2 title " + elementPageIeo);
        String titleIeo = driver.getTitle();
        Assert.assertTrue(titleIeo.equals("IEO"));
        WebElement elementGohome = driver.findElement(By.className("logo__link"));
        elementGohome.click();
        jsx3.executeScript("window.scrollBy(0,450)", "");
        WebElement dynamicElementHome2 = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.className("markets-block-link")));
        WebElement elementSupport1 = driver.findElement(By.className("markets-block-link"));
        elementSupport1.findElement(By.cssSelector("[href=\"https://about.exrates.me/en/support-center\"]")).click();
        WebElement dynamicElementSuport = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("support-center-wr")));
        String titleSupport1 = driver.getTitle();
        Assert.assertTrue(titleSupport1.equals("Support | Exrates"));
        String elementSuport  = driver.findElement(By.tagName("h2")).getText();
        System.out.println("Syport is loading. H2 text is" + elementSuport);
        WebElement elementHomeSuport = driver.findElement(By.className("logo-wr"));
        elementHomeSuport.click();
        jsx3.executeScript("window.scrollBy(0,450)", "");
        String winHandleApiHomeDoc = driver.getWindowHandle();
        WebElement dynamicElementHome4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("markets-block-link")));
        WebElement elementApi = driver.findElement(By.className("markets-block-link"));
        elementApi.findElement(By.cssSelector("[href=\"https://developer.exrates.me/\"]")).click();
        for(String winHandlApiHomeDoc : driver.getWindowHandles()){
            driver.switchTo().window(winHandlApiHomeDoc);
        }

        WebElement dynamicElementAio = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id("api-Authentication-Algorithm")));
        String titleAio = driver.getTitle();
        Assert.assertTrue(titleAio.equals("Exrates REST API"));
        String elementApiH1  = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Api is started. h1 is  " + elementApiH1);
        driver.close();
        driver.switchTo().window(winHandleApiHomeDoc);
      /* ********************************End Icon Home page**************************************************************** */
      /* ********************************Search markets Home page**************************************************************** */
        WebElement marketsTableContainer = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("markets-table-container")));
        WebElement elementSupport = driver.findElement(By.className("markets-home"));
        driver.findElement(By.id("search")).sendKeys("BTC");
        driver.findElement(By.id("search")).clear(); // можно дописать поски с проверкой выбрана ли пара
      /* ******************************End search********************************************** */
      /* OK-OK******************************Markets-Home перебор валютных пар********************************************** */
        WebElement elementHomeTable22 = (new WebDriverWait(driver, 70)).until(ExpectedConditions.presenceOfElementLocated(By.id("markets-container")));
        JavascriptExecutor jsx18 = (JavascriptExecutor) driver;
        jsx18.executeScript("window.scrollBy(0,950)", "");

        WebElement elementsRootAll = driver.findElement(By.className("btn-block"));
        List<WebElement> elementsRoot = elementsRootAll.findElements(By.tagName("button"));
        System.out.println(elementsRoot.size());

        for (int q=0; q<elementsRoot.size();q++){
            WebElement elementsRootAll27 = driver.findElement(By.className("btn-block"));
            List<WebElement> elementsRoot27 = elementsRootAll27.findElements(By.tagName("button"));

            WebElement rut = elementsRoot27.get(q);
            WebElement rut2 = elementsRoot.get(q);
            System.out.println(rut);
            System.out.println(rut2);
            System.out.println("на какой колонке мы находимся " + q);
            String textColum = elementsRoot27.get(q).getText();
            WebElement elementWaitElement = (new WebDriverWait(driver, 70)).until(ExpectedConditions.presenceOfElementLocated(By.className("search-block")));

            Actions actions2 = new Actions(driver);
            actions2.moveToElement(rut).click().perform();


            List<WebElement> linkElements1 = driver.findElements(By.xpath("//table[@id='markets-container']/tbody/tr"));
            int j = 1;
            int sizetest = linkElements1.size();
            while (j < sizetest) {
                List<WebElement> linkElementsButtom = driver.findElements(By.xpath("//table[@id='markets-container']/tbody/tr"));
                System.out.println("*********************************************************");
                System.out.println("высота колонки  " + sizetest);
                System.out.println("название колонки  " + textColum);
                System.out.println("норер колонки  " + q);
                System.out.println("норер строки  " + j);

                WebElement terte;
                terte = linkElementsButtom.get(j);
                String textColumMarket  = terte.getText();
                System.out.println("span по которой надо кликнуть " + textColumMarket);

                WebElement tesr = linkElementsButtom.get(j);
                Actions actions = new Actions(driver);
                actions.moveToElement(linkElementsButtom.get(j)).click().perform();
                String title;
                title = driver.getTitle();

                WebElement elementHomeTable2 = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.className("gridster-item-inner")));
                System.out.println("title is: " + title);
                WebElement namePair = driver.findElement(By.name("item"));
                String namePairText = namePair.getAttribute("value");
                System.out.println("Currency pair is " + namePairText);
                j++;
                if (q == 0 ){
                    driver.navigate().back();
                    JavascriptExecutor jsx5 = (JavascriptExecutor) driver;
                    jsx5.executeScript("window.scrollBy(0,-1050)", "");
                } else if( q > 0){

                    driver.navigate().back();
                    JavascriptExecutor jsx15 = (JavascriptExecutor) driver;
                    jsx15.executeScript("window.scrollBy(0,-1500)", "");
                    Thread.sleep(1000);

                    WebElement elementHomeTable21 = (new WebDriverWait(driver, 70)).until(ExpectedConditions.presenceOfElementLocated(By.className("markets-block-link")));
                    JavascriptExecutor jse2 = (JavascriptExecutor) driver;
                    jse2.executeScript("arguments[0].scrollIntoView()", elementHomeTable21);
                    WebElement elementsRootAll4 = driver.findElement(By.className("btn-block"));
                    List<WebElement> elementsRoot4 = elementsRootAll4.findElements(By.tagName("button"));
                    Thread.sleep(2000);
                    WebElement rut77 = elementsRoot4.get(q);
                    System.out.println("во вотором цикле наша q = " + q );
                    Actions actions21 = new Actions(driver);
                    actions21.moveToElement(rut77).click().perform();

                    WebElement elementHomeTable = (new WebDriverWait(driver, 70)).until(ExpectedConditions.presenceOfElementLocated(By. className("search-block")));
                }
            }
        }
        /* ********************************End Markets-Home перебор валютных пар********************************************** */
    }
}
