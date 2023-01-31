package officerSide;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;

public class OfficerHomePage extends Base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void driverInitialization() throws IOException{
		
		driver = initializeDriver();
		
		
		log.info("Driver is Initialized");
		//driver.get("https://safv.stellasoftware.com/");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the login page");
		driver.manage().window().maximize();
	}

	@Test
	public void basePageNavigation() throws IOException{
		LoginPage ob1 = new LoginPage(driver);
		//ob1.getEmail().sendKeys("TestOFficer");
		ob1.getEmail().sendKeys("testuser1bs23@gmail.com");
		ob1.getPassword().sendKeys("bs23@Test123");
		//ob1.getPassword().sendKeys("123");   
		ob1.getLogin().click();
		
		HomePage h1 = new HomePage(driver); 
		//Compare the text from the browser with the actual value. If any mismatch script should fail with -ERROR-  
		Assert.assertEquals(h1.getTitle().getText(), "Incidents1");
		log.info("Incidents Found");
		//Assert.assertTrue(false);
		Assert.assertTrue(h1.getNavBar().isDisplayed());
		log.info("Navbar is Displayed");
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	
}
