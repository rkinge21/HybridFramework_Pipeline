package com.testmadness.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.testmadness.base.BasePage;
import com.testmadness.utils.Log;


public class FlightFinderPage extends BasePage 
{

	public FlightFinderPage(WebDriver driver) 
	{
		super(driver);
	}

	//Element Locators for one way radio button
	@FindBy(xpath = "//input[@value='oneway']")
	private WebElement onewayRadio;

	public WebElement getOneWayRadio() 
	{
		try 
		{
			elementDetails.put(onewayRadio, "One Way radio button");
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return onewayRadio;
	}
	
	//Select the location from dropdown
	@FindBy(name = "fromPort")
	private WebElement fromPortDrop;
	public WebElement getFromPortDrop(){
		try
		{
			elementDetails.put(fromPortDrop, "From Port drop down");
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}	
		return fromPortDrop;
	}
	
	//Select the day from dropdown
	@FindBy(xpath = "//select[@name='fromDay']")
	private WebElement fromDayDrop;
	public WebElement getFromDayDrop(){
		try
		{
			elementDetails.put(fromDayDrop, "From Day drop down");
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return fromDayDrop;
	}
	
	//Click Business radio button
	@FindBy(xpath = "//input[@value='Business']")
	private WebElement businessRadio;
	public WebElement getBusinessRadio()
	{
		try
		{
			elementDetails.put(businessRadio, "Business radio button");
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return businessRadio;
	}
	
	//Click find flights button
	@FindBy(name = "findFlights")
	private WebElement findFlightsButton;
	public WebElement getFindFlightsButton(){
		try
		{
			elementDetails.put(findFlightsButton, "Find Flights button");
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return findFlightsButton;
	}


	//Find Flights method. Notice there is no return type
	public void findFlights(String departFrom, String departDate) 
	{
		// Click one way radio button
		clickElement(getOneWayRadio());
		Log.info("FlightFinderPage.findFlights - One way Radio Button clicked");
		// Select Departing From dropdown
		SelectElementByText(getFromPortDrop(), departFrom);
		Log.info("FlightFinderPage.findFlights - Depart From Dropdown clicked");

		// Select Departing Day dropdown
		SelectElementByText(getFromDayDrop(), departDate);
		Log.info("FlightFinderPage.findFlights - Depart Date Dropdown clicked");

		// Click business class
		clickElement(getBusinessRadio());
		Log.info("FlightFinderPage.findFlights - Business Radio Button clicked");

		// Click Find Flights button
		clickElement(getFindFlightsButton());
		Log.info("FlightFinderPage.findFlights - Find Flights Button clicked");
	}
}
