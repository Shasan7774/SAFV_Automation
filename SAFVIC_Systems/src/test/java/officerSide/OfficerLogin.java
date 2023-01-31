package officerSide;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Base;

public class OfficerLogin extends Base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void driverInitialization() throws IOException {
		//driver = initializeDriver();
		//driver.get("https://safv.stellasoftware.com/");
		
		//driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void loginPageNavigation(String userEmail, String password, String credText) throws IOException{
		
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		
		LoginPage ob1 = new LoginPage(driver);
		ob1.getEmail().sendKeys(userEmail);
		ob1.getPassword().sendKeys(password);
		log.info(credText);
		//ob1.getEmail().sendKeys("TestOFficer");
		//ob1.getPassword().sendKeys("123");
		
		ob1.getLogin().click(); 
		log.info("User Login Successful");
	}
	
    @DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		//0th Row or 1st data set  
		data[0][0] = "hasan.shahria@brainstation-23.com";
		data[0][1] = "bs23@Test123";
		data[0][2] = "First User's Credential Passed";
		
		//1st row or 2nd data set 
		data[1][0] = "testuser2bs23@gmail.com";
		data[1][1] = "bs23@Test123";
		data[1][2] = "Second User's Credential Passed";
		return data;
	}
    
    @AfterTest
    public void terminateBrowser() {
    	driver.close();
    }
}
