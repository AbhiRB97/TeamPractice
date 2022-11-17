package com.teampractice.genericutilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImpClass extends BaseClass implements ITestListener {

	ExtentReports reports;
	ExtentSparkReporter sparkReporter;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" is Passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" is Failed");
		test.log(Status.FAIL, result.getThrowable());
		String path1 = getScreenShot(driver);
		test.addScreenCaptureFromBase64String(path1);
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" is Skipped");
	}

	public void onStart(ITestContext context) {
		String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		sparkReporter = new ExtentSparkReporter(new File("./Reports/MyReport"+currentTime+".html"));
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("TeamPractice Report");
		sparkReporter.config().setTheme(Theme.DARK);
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("Team Name", "Team1");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Browser", "Chrome");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}
	
	public static String getScreenShot(WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		String path= ts.getScreenshotAs(OutputType.BASE64);
		return path;
	}

}
