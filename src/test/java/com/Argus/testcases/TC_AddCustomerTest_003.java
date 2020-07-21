package com.Argus.testcases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Argus.PageObjects.AddCustomerPage;
import com.Argus.PageObjects.LoginPage;


public class TC_AddCustomerTest_003 extends BaseaClass {
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.custName("Pavan");
		addcust.custgender("male");
		//Thread.sleep(5000);
		addcust.custdob();
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		Thread.sleep(3000);
		addcust.custcity("HYD");
		Thread.sleep(3000);
		addcust.custstate("AP");
		Thread.sleep(3000);
		addcust.custpinno("5000074");
		Thread.sleep(3000);
		addcust.custtelephoneno("1234567891");
		Thread.sleep(3000);
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
	
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}

	 
	
}

