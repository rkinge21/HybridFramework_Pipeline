package com.testmadness.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;

public class Utility
{
	public static void writePropertiesFile(String propertyFilePath, String key, String value)
	{
		try
		{
			File file = new File(propertyFilePath);
			if (!file.exists()) 
			{
				Properties props = new Properties();
				props.setProperty(key, value);
				FileWriter writer = new FileWriter(file);
				props.store(writer, "Execution Meta-data");
				writer.close();
			} 
			else 
			{
				PropertiesConfiguration config = new PropertiesConfiguration();//commons-configuration mvn dependency
				PropertiesConfigurationLayout layout = new PropertiesConfigurationLayout(config);
				layout.load(new InputStreamReader(new FileInputStream(file)));

				FileWriter fw = new FileWriter(propertyFilePath,false);
				config.setProperty(key, value);
				layout.save(fw);
			}
		} catch (org.apache.commons.configuration.ConfigurationException e)
		{
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
