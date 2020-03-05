package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		try {
			File src = new File("./Configurations/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getusername() {
		String username = pro.getProperty("username");
		return username;

	}

	public String getpassword() {
		String password = pro.getProperty("password");
		return password;

	}
	
	public String getChromePath() {
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
		
	}
	
	public String getfirefoxPath() {
		String firefox =pro.getProperty("firefoxpath");
		return firefox;
		
		
	}
	
	
	public String getIEpath() {
		String IEpath =pro.getProperty("IEpath");
		return IEpath;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
