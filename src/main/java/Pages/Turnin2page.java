package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestBase.BaseTest;

public class Turnin2page extends BaseTest {
	
	
	public Turnin2page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public String pagetitle()
	{
		return gettitle();
		
	}
	
	
	private By Calclick=By.xpath("//input[@name='dq_returnDate' and @id='dq_156003005']");
	private By datesel=By.xpath("//*[@id=\"mainHtml\"]/body/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[6]/div");
	private By vehicleloc=By.xpath("//select[@name='dq_locationId']");
	private By vlocselect=By.xpath("//option[@id='dq_156003010_21253' and @value='21253']");
	private By Nok=By.xpath("//select[@name='dq_numberOfKeys']");
	private By keysel=By.xpath("//option[@id='dq_156003015_1' and @value='1']");
	private By mileage=By.xpath("//input[@name='dq_mileage' and@id='dq_156003020']");
	private By continue3=By.xpath("//input[@name='qa_3' and@id='qa_3']");
	private By completertn=By.xpath("//input[@name='qa_1' and@id='qa_1']");
	
	
	public void claenderclick()
	{
		driver.findElement(Calclick).click();
	}
	
	public void selectdate()
	{
		driver.findElement(datesel).click();
	}
	
	public void vehicleloc()
	{
		driver.findElement(vehicleloc).click();
	}
	
	public void vlocselect()
	{
		driver.findElement(vlocselect).click();
	}
	
	public void Noofkeyclick()
	{
		driver.findElement(Nok).click();
	}
	
	public void keyselect()
	{
		driver.findElement(keysel).click();
	}
	
	public void Mileageenter(String Mil)
	{
		driver.findElement(mileage).sendKeys(Mil);
	}
	
	public void continue3()
	{
		driver.findElement(continue3).click();
	}
	
	public void completertn()
	{	
		driver.findElement(completertn).click();
	}
	
	

}

