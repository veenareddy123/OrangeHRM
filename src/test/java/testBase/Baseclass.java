package testBase;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass
{
	public WebDriver driver;
	public Logger logger;
	
	@BeforeClass//it executes first in login page class 
	@Parameters({"browser"})
	public void setup(String br)
	{
		logger=LogManager.getLogger(this.getClass());
		switch(br.toLowerCase())
		{
		case"chrome":
			driver=new ChromeDriver();
			break;
		case"edge":
			driver=new EdgeDriver();
			break;
		case"fire":
			driver=new FirefoxDriver();
			break;
		
		}
		//driver = new  ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
