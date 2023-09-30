package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.BaseTest;

public class Turnin extends BaseTest {
	
	
	public Turnin(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public String turninpagetitle()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(" Gf Home"));
		return gettitle();
	}
	
	private By tools=By.xpath("//*[@id=\"example-2\"]/li[3]/a");
	private By tuenin=By.xpath("//*[@id=\"example-2\"]/li[3]/span/ul[2]/i");
	private By vinid=By.xpath("//input[@id='dq_156001001' and @name='dq_vin']");
	private By continurbtn=By.xpath("//input[@value='Continue']");
	private By secContinue=By.xpath("//input[@id='qa_1' and @name='qa_1' and @value='Continue']");
	
	
	
	public void toolsclick()
	{
		driver.findElement(tools).click();
	}
	
	public void turninclick()
	{
		driver.findElement(tuenin).click();
	}
	
	public void vinid(String vin)
	{
		driver.findElement(vinid).sendKeys(vin);
	}
	
   public void continueclick()
   {
	   driver.findElement(continurbtn).click();
   }
   
   public void continue2()
   {
	   driver.findElement(secContinue).click();  
   }
	

}
