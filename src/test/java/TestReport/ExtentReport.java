package TestReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport extends Extentconfig

{

    String fileName= location + "extentReport.html";
    public void extentrep()
    {
        ExtentReports extent = new ExtentReports();



        ExtentHtmlReporter html= new ExtentHtmlReporter(fileName);
        html.config().setTheme(Theme.STANDARD);
        html.config().setDocumentTitle("Test Report for Amazon App");
        html.config().setEncoding("utf-8");
        html.config().setReportName("Test Report");
        extent.attachReporter(html);



    }
}
