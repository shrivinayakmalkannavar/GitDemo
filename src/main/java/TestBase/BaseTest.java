package TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.Allutil;

public class BaseTest extends Allutil {
	
	 
	  
	public static WebDriver driver;
	public static  Properties prop;

	@Override
	public String gettitle() {
		
		return driver.getTitle();
	}

	
	public BaseTest()
	{
		try
		{
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Gensis2E2ENW\\src\\main\\java\\Properties\\config.properties");
			prop.load(file);
	}
		
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
	}
	
		
		public static void initialize()
		{
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Gensis2E2ENW\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			else
			{
				System.out.println("Browser not opned");
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
		}
	

}


