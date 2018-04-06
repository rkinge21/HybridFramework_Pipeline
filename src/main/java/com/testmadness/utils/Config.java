package com.testmadness.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config 
{
	private static Properties prop;

	public static Properties getProp() 
	{
		if (prop == null) 
		{
			prop = new Properties();
			InputStream input = null;
			try 
			{
				input = new FileInputStream(new File(Constants.PROP_LOCATION, Constants.PROP_NAME));
				prop.load(input);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return prop;
	}
}
