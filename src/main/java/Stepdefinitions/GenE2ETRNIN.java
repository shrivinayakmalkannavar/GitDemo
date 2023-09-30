package Stepdefinitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Pages.Login;
import Pages.Turnin;
import Pages.Turnin2page;
import TestBase.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GenE2ETRNIN extends BaseTest {


	public static Login log;
	public static Turnin trnin;
	public static Turnin2page trninsp;




	@Before
	public void Browsersetup()
	{
		BaseTest.initialize();
	}



	@After(order=1)
	public void screenshot(Scenario scenario)
	{

		if (scenario.isFailed()) {
			String screenshotname=scenario.getName().replaceAll(" ", "_");
			byte[] srcpath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcpath, "image/jpg", screenshotname);
		}
	}
	@After(order=0)
	public void teardown() throws InterruptedException
	{
		driver.close();


	}

	@After(order=2)

	public void dbcheck() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=ON)(FAILOVER=ON)(ADDRESS=(PROTOCOL=TCP)(HOST=t-aucscan-101.adesa.com)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=AUCS.adesa.com)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC))))\r\n" + 
						"","ADLOAD","ADLOAD") ; 

		System.out.println("Connected to DB"); 

		Statement stmt=con.createStatement();  

		ResultSet rs=stmt.executeQuery("select VIN,system_id,vehicle_status_id from vehicles where vin='KMHGN4JE6KU288874'");

		rs.next();


		String VIN=rs.getString(1);

		System.out.println("VIN :"+VIN);
		int system_id=rs.getInt(2);


		System.out.println("System_id:"+system_id);

		int vehicle_status_id=rs.getInt(3);

		System.out.println("vehicle_status_id:"+vehicle_status_id); 

	}


	@When("user enters blank username and password and click on submit")
	public void user_enters_blank_username_and_password_and_click_on_submit() {
		log=new Login(driver);
		log.dologin();
	}

	@When("user enters username and password and click on submit And select organization")
	public void user_enters_username_and_password_and_click_on_submit_and_select_organization() throws InterruptedException {
		log=new Login(driver);

		Thread.sleep(3000);
		log.dologin(prop.getProperty("username"), prop.getProperty("password"));

	}





	@Then("verify page title")
	public void verify_page_title() {
		log.Loginpagetitle();

	}


	@Then("Click on Tools")
	public void click_on_tools() {
		trnin=new Turnin(driver);
		trnin.toolsclick();

	}
	@Then("Select Turn in")
	public void select_turn_in() {
		trnin.turninclick();
	}
	@Then("Enter {string} and Click on Continue")
	public void enter_and_click_on_continue(String vin) throws InterruptedException {
		trnin.vinid(vin);

		trnin.continueclick();
	}

	@Then("Click on Continue")
	public void click_on_continue() {
		trnin.continue2();
	}
	@Then("Fill all details and {string} and click on Continue")
	public void fill_all_details_and_and_click_on_continue(String Mil) throws InterruptedException {
		trninsp=new Turnin2page(driver);
		trninsp.claenderclick();
		Thread.sleep(4000);
		trninsp.selectdate();
		Thread.sleep(4000);
		trninsp.vehicleloc();
		Thread.sleep(4000);
		trninsp.vlocselect();
		Thread.sleep(4000);
		trninsp.Noofkeyclick();
		Thread.sleep(4000);
		trninsp.keyselect();
		Thread.sleep(4000);
		trninsp.Mileageenter(Mil);
		Thread.sleep(4000);
		trninsp.continue3();




	}
	@Then("click on turn in")
	public void click_on_turn_in() {

		trninsp.completertn();
	}
}