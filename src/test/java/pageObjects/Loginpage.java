package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BasePage
{
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	/*//constructor//extending base  class no need of it
	Loginpage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}*/
	//Locator 
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtusername;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnlogin;
	
	//Action methods
	public void setUsername(String username)//to allow diff values//by giving like this we can pass values in login test
	{
		txtusername.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnlogin.click();
	}

}
