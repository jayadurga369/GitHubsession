package com.inetBankingTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.inetBankingUtilites.ReadConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

ReadConfig readConfig = new ReadConfig();

	
public String baseURL=readConfig.getApplicationURL();
public String userName=readConfig.getUsername();
public String password=readConfig.getPassword();
	
public static WebDriver driver;

public static ExtentReports report;
public static ExtentTest test;
@Parameters("browser")

@BeforeTest
	public void setup(String br)
	{
		
	if(br.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", readConfig.getChropath());
		driver = new ChromeDriver();
report = new ExtentReports("C:\\Users\\jayad\\eclipse-workspace\\inetBankingV2\\Reports\\Report.html",true);
test = report.startTest("Extent Report Demo");
	}	
		driver.get(baseURL); 
	}


@AfterTest
   public void teatDown()
   {
	driver.quit();//
	report.endTest(test);
	report.flush();
   }
   



}
