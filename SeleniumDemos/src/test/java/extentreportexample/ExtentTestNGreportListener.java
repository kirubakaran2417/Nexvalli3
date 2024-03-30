package extentreportexample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTestNGreportListener implements ITestListener {
	//extentreport is a class provided by extentreports; we will create an object of it and create a report
	private ExtentReports extent;
	//extenttest is a class provided by extentreports; we will create an object of it and create a test case
	private ExtentTest extentTest;
	
	public ExtentTestNGreportListener() {
		//specify location of the report where you want to generate the report
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("reports//extentreport.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		//create object of ExtentReports class
		extent = new ExtentReports();

		//attach the html report to the report object
		extent.attachReporter(htmlReporter);
	}
	
	public void onStart(ITestContext result) {
		System.out.println("Test started ->"+result.getName());
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started ->"+result.getMethod().getMethodName());
		extentTest = extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed ->"+result.getMethod().getMethodName());
		extentTest.pass("Test passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed ->"+result.getMethod().getMethodName());
		extentTest.fail(result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped ->"+result.getMethod().getMethodName());
		extentTest.skip(result.getThrowable());
	}
	
	public void onFinish(ITestContext result) {
		System.out.println("Test finished ->"+result.getName());
		//flushing the report to write all information to the html file
		extent.flush();
	}
}
