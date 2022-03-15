package com.inetBankingTestCases;



import org.testng.annotations.Test;

import com.inetBankingPageObjects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_LoginTest_001  extends BaseClass{
	
	@Test
	public void loginPage()
	{
		driver.get(baseURL); 
		    test.log(LogStatus.INFO,"Testcase Loginpage is Started");
		    test.log(LogStatus.PASS, baseURL);
		LoginPage lp = new LoginPage(driver);
		
		
		lp.setUserName(userName);
		
		
		
		lp.setPassword(password);
		
		
		
		lp.clickSubmit();
		
		
		lp.clickRejectall();
	
	}	
	
	
}
