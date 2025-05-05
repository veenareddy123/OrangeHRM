package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Loginpage;
import testBase.Baseclass;

public class tc_001_LoginTest extends Baseclass
//we gave @before class in base class it executes first
{
	@Test
	public void LogitTest()
	{
		logger.info("test is started");
		Loginpage login=new Loginpage(driver);
		login.setUsername("Admin");
		logger.info("enter username");
		login.setPassword("admin123");
		logger.info("Entered Password");
		login.clickLogin();
		logger.info("clicked on login");
		if(driver.getTitle().equals("OrangeHRM"))
		{
			Assert.assertTrue(true);
			logger.info("Login test is passed");
		}
		else
		{
			Assert.fail();
			logger.error("Login test is failed");
		}
		logger.info("Login test is finished");
	}
	
}


