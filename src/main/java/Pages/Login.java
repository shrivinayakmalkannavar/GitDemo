package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.BaseTest;

public class Login extends BaseTest {
	

	
	
	public Login(WebDriver driver)
	{
		Login.driver=driver;
		
	}
	 
	
	private By uname=By.id("accountName");
	private By pass=By.id("password");
	private By submit=By.id("loginSubmit");
	private By orgdrp=By.xpath("//*[@id=\"wholeView\"]/div/section/section[1]/div/div[2]/form/div/select");
	
	private By orgselctn=By.xpath("//option[@value='11274']");
	
	
	
	public String Loginpagetitle()
	{
		return gettitle() ;
		
		
	}
	
//	public void  SetUsername(String username)
//	{
//		driver.findElement(uname).sendKeys(username);
//	}
//	
//	public void  SetPassword(String password)
//	{
//		driver.findElement(pass).sendKeys(password);
//	}
//	
//	public void Submit()
//	{
//		driver.findElement(submit).click();
//	}
	
	public void dologin(String username,String password) throws InterruptedException

	{
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(submit).click();
		System.out.println("successfully logged in to the site");
		
		driver.findElement(orgdrp).click();
		Thread.sleep(6000);
		driver.findElement(orgselctn).click();
	    System.out.println("successfully selected organization");
		
		
		
	}
	
	public void dologin()

	{
	
		driver.findElement(submit).click();
		  
		
	}
}
