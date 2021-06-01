package stepdefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import method.loginmethod;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class capabilities  {





        AppiumDriver<MobileElement> driver;
        //@Parameters({"platformName", "automationName"})
        @Test
        public String andcap() throws IOException
        {
            File fis = new File("/Users/pradeep/Wipro-Amazon/Amazon_shopping.apk");
            //Properties prop = new Properties();
            //prop.load(fis);

            {

                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName", "AOSP on IA Emulator");
                cap.setCapability("platformName", "Android");
                cap.setCapability("platformVersion", "9");
                cap.setCapability("app", fis.getAbsolutePath());
                cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
                cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
                cap.setCapability("noReset ", false);
                cap.setCapability("fullReset ", true);
                //cap.setCapability("automationName ", "appium");
                cap.setCapability("autoGrantPermissions" , true);
                //driver = new AndroidDriver((new URL("http://127.0.0.1:4723/wd/hub")), cap);
                driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);


            }


            return "driver";

        }
        public AppiumDriver<MobileElement> getAndroidDriver() throws IOException {
        return driver;
    }




    }

