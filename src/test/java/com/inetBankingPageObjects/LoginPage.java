package com.inetBankingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	
	
	}
	
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(id="denyAll")
	WebElement btnrejectall;
	
	public void setUserName(String Uname)
	{
		txtUserName.sendKeys(Uname);
	}
	
	public void setPassword(String pwd)
	{
	txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		
	btnLogin.click();	
	}
	
	public void clickRejectall()
	{
		btnrejectall.click();
	}
}
