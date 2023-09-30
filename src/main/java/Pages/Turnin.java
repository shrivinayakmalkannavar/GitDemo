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
		System.out.println("clicked tools");
	}
	
	public void turninclick()
	{
		driver.findElement(tuenin).click();
		System.out.println("Clicked turn in");
		System.out.println("After clicking turn in it will land to Turn in page page");
	}
	
	public void vinid(String vin)
	{
		driver.findElement(vinid).sendKeys(vin);
		System.out.println("Entered vin");
		System.out.println("After this it will land to turn in 2nd page");
	}
	
   public void continueclick()
   {
	   driver.findElement(continurbtn).click();
	   System.out.println("clicked turn in ");
	   System.out.println("it will land to completeion page");
   }
   
   public void continue2()
   {
	   driver.findElement(secContinue).click();  
   }
	

}
