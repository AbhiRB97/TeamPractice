package com.teampractice.genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * @Rakesh Babu K N
 * This class is used as base class for this project
 * it will take care of all db connection,browser launch, login,logout,browser close,and DB close
 */

public class BaseClass {
	public ExcelUtility eLib=new ExcelUtility();
	public DatabaseUtiliy dLib=new DatabaseUtiliy();
	public FileUtility fLIb=new FileUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public static WebDriver sDriver;
	
	public WebDriver driver;
	// to launch the database connection
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("It will launch the database connection");
	}
	//this method launch the browser as per the parameter passed by user  
	
	@BeforeClass
	public void beforeClass()
	{ String browser="chrome";
		if(browser=="chrome")
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			 driver=new ChromeDriver(options);
		}	else 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get("https://www.ebay.com/");
	}
	//this method will login to application
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("login to application");
	}
	// this method will logout from application
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("logout from applicaytion");
	}
	// this class will close the browser from execution
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	// this method will close the database connection
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("DB connnection is closed");
	}
	

}
