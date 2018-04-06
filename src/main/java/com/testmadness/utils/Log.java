package com.testmadness.utils;

import org.apache.log4j.Logger;
public class Log 
{

	// Initialize Log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());//

	// This is to print log for the beginning of the test case
	public static void startTestCase(String sTestCaseName) 
	{
		Log.info("****************************************************************************************");
		Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		Log.info("****************************************************************************************");
	}

	// This is to print log for the end of the test case
	public static void endTestCase(String sTestCaseName) 
	{
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");
	}

	// info method for printing info message
	public static void info(String message) 
	{
		Log.info(message);
	}

	// warn method for printing warning message
	public static void warn(String message) 
	{
		Log.warn(message);
	}

	// error method for printing error message
	public static void error(String message) 
	{
		Log.error(message);
	}

	// fatal method for printing fatal message
	public static void fatal(String message) 
	{
		Log.fatal(message);
	}

	// debug method for printing debug message
	public static void debug(String message) 
	{
		Log.debug(message);
	}
}