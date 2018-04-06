package com.testmadness.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testmadness.base.BasePage;
import com.testmadness.utils.Log;

public class HomePage extends BasePage 
{	
	public HomePage(WebDriver driver) 
	{
		super(driver);		
	}

	// Element Locators for username textbox
	@FindBy(name = "userName")
	private WebElement userName;
	public WebElement getUserName()
	{
		try{
			elementDetails.put(userName, "User Name text box");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return userName;
	}

	// Element Locators for password textbox
	@FindBy(name = "password")
	private WebElement password;
	public WebElement getPassword()
	{
		try{
			elementDetails.put(password, "Password text box");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return password;
	}

	// Element Locators for login button
	@FindBy(xpath = "//input[@name='login']")
	private WebElement login;
	public WebElement getLogin()
	{
		try{
			elementDetails.put(login, "Login button");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return login;
	}

	// Login method. Notice there is no return type
	public FlightFinderPage loginUser(String uname, String pwd) 
	{
		// Enter username
		EnterText(getUserName(), uname);
		// Log4j logging
		Log.info("HomePage.loginUser - username entered");

		// Enter password
		EnterText(getPassword(), pwd);
		// Log4j logging
		Log.info("HomePage.loginUser - password entered");

		// Click Login button
		clickElement(getLogin());
		// Log4j logging
		Log.info("HomePage.loginUser - login button clicked");
	
		return new FlightFinderPage(driver);
	}

}
