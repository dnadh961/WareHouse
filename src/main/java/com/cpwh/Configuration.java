package com.cpwh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration{
	
	private Properties prop = null;
	
	public Configuration() {
		try{
			FileInputStream fis = new FileInputStream(new File("config.properties"));
			prop = new Properties();
			prop.load(fis);
		}catch(IOException e){
			throw new RuntimeException("Please check for config.properties file");
		}
	}

	public String getBrowserName() {
		return prop.getProperty("browser");
	}

	public String getUser() {
		return prop.getProperty("user");
	}

	public String getPassword() {
		return prop.getProperty("pwd");
	}

	public String getURL() {
		return prop.getProperty("instance.url");
	}

}
