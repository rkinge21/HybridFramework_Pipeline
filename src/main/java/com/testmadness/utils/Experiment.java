package com.testmadness.utils;

import java.util.Properties;

public class Experiment
{
	public static void main(String[] args)
	{
		// Printing Name of the system property
		System.out.println("user.dir: "+System.getProperty("user.dir"));

		// Fetches the property set with 'home' key
		System.out.println("home: "+System.getProperty("home"));
		// Resulting in Null as no property is present

		// Printing 'name of Operating System'	
		System.out.println("os.name: "+System.getProperty("os.name"));

		// Printing 'JAVA Runtime version'
		System.out.println("version: "+System.getProperty("java.runtime.version" ));

		// Printing 'name' property
		System.out.println("name: "+System.getProperty("name" ));
		// Resulting in Null as no property is present

		System.out.println("--------------------------  XOXO  ---------------------");
		// use of getProperty(String key, String definition) method

		// Here key = "Hello" and System Property = "Geeks"
		System.out.println("Hello property : " + System.getProperty("Hello", "Geeks"));

		// Here key = "Geek" and System Property = "For Geeks"
		System.out.println("System-property :" + System.getProperty("System", "For Geeks"));

		// Here key = "Property" and System Property = null
		System.out.println("Property-property :" + System.getProperty("Property"));

		System.out.println("--------------------------  XOXO  ---------------------");
		
		/* Use of getProperties() method
        System class refers to the JVM on which you are compling your JAVA code
        getProperty fetches the actual properties
        that JVM on your Sysytem gets from your Operating System
		 */

		System.out.println("Following are the JVM information of your OS :");
		System.out.println("");

		// Property Object
		Properties jvm = System.getProperties();
		jvm.list(System.out);
	}
}
