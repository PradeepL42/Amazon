package locat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindByAllSet;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import method.loginmethod;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class signin

{
    AppiumDriver<MobileElement> driver;


     //skipsingin
   @AndroidFindBy(id = "skip_sign_in_button")
  // @AndroidFindBy(xpath= "android.widget.Button[index=7]")
   public MobileElement skipping;

    public signin(AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @AndroidBy(id= "")
    public MobileElement signin;










}
