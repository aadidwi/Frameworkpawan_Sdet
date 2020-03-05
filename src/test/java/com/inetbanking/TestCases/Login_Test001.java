package com.inetbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.Login_Page;

public class Login_Test001 extends BaseClass {

	@Test
	public void loginTest() {

		driver.get(baseURL);
		
		logger.info("Url is Open");

		Login_Page lp = new Login_Page(driver);
		lp.SetUserName(username);
		
		logger.info("entered UserName");
		
		lp.SetPassword(password);
		logger.info("entered password");


		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info("loginTest Pass");


		} else
			Assert.assertTrue(false);
		logger.info("login test fail");


	}

}
