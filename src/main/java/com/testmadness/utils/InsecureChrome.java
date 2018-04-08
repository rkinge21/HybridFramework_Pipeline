package com.testmadness.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class InsecureChrome {
	

//@Test
    public static WebDriver chrome(WebDriver driver)
{
     Map<String, Object> prefs = new HashMap<String, Object>();//To Turns off multiple download warning
     prefs.put("profile.default_content_settings.popups", 0);
     prefs.put( "profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );
     prefs.put("download.prompt_for_download", false);//Turns off download prompt
     prefs.put("credentials_enable_service", false);
     prefs.put("password_manager_enabled", false);//To Stop Save password prompts

     ChromeOptions options1 = new ChromeOptions();
     options1.addArguments("chrome.switches","--disable-extensions");
     options1.addArguments("--disable-notifications");//To Disable any browser notifications
     options1.addArguments("disable-infobars");//To disable yellow strip info bar which prompts info messages
     options1.addArguments("test-type");
     options1.addArguments("--disable-web-security");
     options1.addArguments("start-maximized");
     options1.addArguments("--js-flags=--expose-gc");  
     options1.addArguments("--enable-precise-memory-info"); 
     options1.addArguments("--disable-popup-blocking");
     options1.addArguments("--disable-default-apps"); 
     options1.setExperimentalOption("prefs", prefs);

     DesiredCapabilities cap = DesiredCapabilities.chrome();
     cap.setCapability(ChromeOptions.CAPABILITY, options1);
     cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
  // System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\ChromeDriver\\chromedriver.exe");
     System.setProperty("webdriver.chrome.driver", "src/main/resources/testData/chromedriver.exe");
     driver = new ChromeDriver(cap); 
     //context.setAttribute("WebDriver", driver);
     return driver;
     
}
}

