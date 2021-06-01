package stepdefinition;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locat.signin;
import method.homepagemethod;
import method.loginmethod;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@Listeners(ReportTest.class)

public class basepage

{

   public static AppiumDriver<MobileElement> driver;
    capabilities ca= new capabilities();
    //loginmethod login=new loginmethod();

//loginmethod login= PageFactory.initElements(driver, loginmethod.class);
//homepagemethod s= PageFactory.initElements(driver, homepagemethod.class);

  //public static loginmethod login ;
    //Sttaic homepagemethod homepage;
    // homepagemethod home;



@Test
    @Given("^I launch the app$")
    public void applaunch () throws Throwable
    {

        ca.andcap();
        driver = ca.getAndroidDriver();


    }
@Test
    @Then("^I wait for the page to load$")
    public void i_wait_for_the_page_to_load() throws Throwable {
        Thread.sleep(5000);
   // WebDriverWait wait = new WebDriverWait(driver, 20, 100);

    }


@Test
    @Then("^I skip login$")
        public void i_skip_login() throws IOException {

//driver=ca.getAndroidDriver();
    //working
//    signin s= new signin( driver);
//
//        s.skipmethod();

    loginmethod log= new loginmethod(driver);
    log.skipmethod();

    }
@Test
    @Then("^I tap on humburger$")
    public void i_tap_on_humburger() throws Throwable {

    homepagemethod home = new homepagemethod(driver);
    home.Humburger();


    }

    @Then("^I scroll the list$")
    public void i_scroll_the_list() throws Throwable {
        homepagemethod home = new homepagemethod(driver);
        home.scrollscreen();

    }
    @Then("^I tap on settings$")
    public void i_tap_on_settings() throws Throwable {
        homepagemethod home = new homepagemethod(driver);
        home.settings();
        home.getlist();
    }

    @Then("^I tap on Country and Language$")
    public void i_tap_on_country_and_language() throws Throwable {
        homepagemethod home = new homepagemethod(driver);
        home.CountryAndLanguage();
    }

    @Then("^I tap on device back button$")
    public void i_tap_on_device_back_button() throws Throwable {

        driver.navigate().back();
        //((AndroidDriver) driver).pressKey(Key);
       // ((AndroidDriver) driver).pressKey(AndroidKey.BACK);
       // ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }
//search for an item
    @Given("^I search for the item$")
    public void i_search_for_the_item() throws Throwable {

        homepagemethod home = new homepagemethod(driver);
        home.searchitems();

    }
}
