package method;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import locat.signin;
import org.openqa.selenium.support.PageFactory;
import stepdefinition.capabilities;

public class loginmethod {

    AppiumDriver<MobileElement> driver;
   public loginmethod(AppiumDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver),signin.class);
   }




    public void skipmethod()
    {
        signin sign= new signin(driver);
        sign.skipping.click();

    }


}
