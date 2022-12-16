package stepDefinition;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Config;
import utils.ExcelConnection;
import utils.SessionVariables;

public class Hooks {
	public static WebDriver driver;
	static Fillo dbfillo;
	 public static Connection connection;
	 
	 
	
	@Before
	public void before(Scenario scenario)
	{
		System.out.println("Executed before the feature:" + scenario.getName());
		SetWebDriver();
		
		
		
		System.out.println("Data taken from Property files:"+SessionVariables.AppURL);
		
	}
	
	@BeforeAll
	public static void beforeall()
	{
		System.out.println("Exceuted only once");
		Config.setProperties();
		ExcelConnection.GetExcelConnection();
		
		
	}
	
	
	public static void SetWebDriver()
	{
		 if (driver==null)
		 {
			System.setProperty("webdriver.chrome.driver","src/test/resources/resourcesfiles/chromedriver.exe");
			 driver=new ChromeDriver();
			 System.out.println("The driver is set");
		 }
		 
	}
	
	
	
	
	
	
}
