package com.Argus.testcases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Argus.PageObjects.LoginPage;

public class TC_Logintest_001 extends BaseaClass 
{
@Test
public void loginTest() throws InterruptedException, IOException
{
	
	logger.info("URL is opened");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered username");
	lp.setPassword(password);
	logger.info("Entered Password");
	lp.clicksubmit();
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("Test is passed");
	}
	else
	{
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("Test is failed");
	}

}
}
