package stepdefinition;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.*;

public class ReportTest implements ITestListener {

    AppiumDriver driver;

    @Test
    public void testOnTestStart()
    {




    }



    @Test
    public void testOnTestFailure(ITestResult Result) {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File(""+Result.getName()+".png"));
            System.out.println("***Placed screen shot in "+""+" ***");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    @Test
    public void testOnTestSkipped() {
    }

}