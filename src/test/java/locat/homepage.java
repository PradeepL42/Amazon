package locat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class homepage {

   AppiumDriver<MobileElement> driver;

    public homepage( AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //Humburger icon
    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    //android.widget.Button[index=7]
    public MobileElement humburger;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/gno_drawer_list")

    //android.widget.Button[index=7]

  public  MobileElement humburgerlist;

    //settings
//    @AndroidFindBy(xpath="a")
//    public  MobileElement settings;

    //humburger list
//    @FindAll( {
//            @FindBy(id= "wnd_view_pager"),
//            @FindBy( id= "gno_menu_first_level"),
//            @FindBy( id= "gno_drawer_list"),
//            @FindBy( id= "anp_drawer_item"),
//            @FindBy (xpath= "android.widget.LinearLayout[index='12'")
//
//    })
    @FindBy (id="com.amazon.mShop.android.shopping:id/anp_drawer_item")
    public MobileElement setting;

    @AndroidFindBy(xpath= "//android.widget.LinearLayout[@index='12']")
    public MobileElement CountryandLanguage;

    //search for an item
    @FindBy(id="com.amazon.mShop.android.shopping:id/rs_search_src_text")
    public MobileElement searchitemfromhomescreen;


    @AndroidFindBy(uiAutomator = "new UiSelector().xpath(\"android.widget.LinearLayout[@index='12'\"]")
   // @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    public MobileElement mobileElementViews;








}
