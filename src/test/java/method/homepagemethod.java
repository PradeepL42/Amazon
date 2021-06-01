package method;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import locat.homepage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class homepagemethod {

    AppiumDriver<MobileElement> driver;
    homepage home;

    WebDriverWait wait = new WebDriverWait(driver,5,100);

    public homepagemethod(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), homepage.class);
    }


    public void Humburger() {

        homepage home = new homepage(driver);
        home.humburger.click();


    }


//        Dimension dimensions = driver.manage().window().getSize();
//        //e.isSelected();
//        e.click();
//        List<MobileElement> ls= (List<MobileElement>) e.getSize();
//        System.out.println(ls);
//        TouchAction action = new TouchAction(driver);
//        action.press(PointOption.point(364,832)).moveTo(PointOption.point(348,495));
//        action.release().perform();


    public void settings() {
        homepage home = new homepage(driver);
        home.setting.click();
    }

    public void getlist()
    {
        homepage home = new homepage(driver);
        home.humburgerlist.click();
    }


    public void scrollscreen() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.40);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release();
        action.perform();

//        JavascriptExecutor js = driver;
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("direction","down");
//        scrollObject.put("element",  "home.CountryandLanguage");
//        js.executeScript("mobile: scroll", scrollObject);



        Set<String> contexts = driver.getContextHandles();

        // made sure we have web view content
        // assertThat(contexts.size(), greaterThan(1));
        for (String context : contexts) {
            System.out.println(contexts);

        }




    }

    public void CountryAndLanguage()
    {
        homepage home = new homepage(driver);
        //home.CountryandLanguage.click();
        TouchAction action = new TouchAction(driver);
        action.tap(PointOption.point(352,588)).release();
        action.perform();


    }

    //search text field in home screen

    public void searchitems()
    {

        Set<String> contexts = driver.getContextHandles();

        // made sure we have web view content
        // assertThat(contexts.size(), greaterThan(1));
        for (String context : contexts) {
            System.out.println(contexts);

        }
        homepage home = new homepage(driver);
        //home.searchitemfromhomescreen.click();
        MobileElement element = home.searchitemfromhomescreen;
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//
//        js.executeScript("arguments[0].value='tested'", element);
        home.searchitemfromhomescreen.sendKeys("shoe");
    }
}
