package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public Properties prop; 
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\shahr\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		   
		String browserName = prop.getProperty("browser"); 
		System.out.println("Executing in:"+browserName);
		
		String safvURL= prop.getProperty("url");
		
		
		if(browserName.equals("chrome")) { 
			//execute in chrome -
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahr\\OneDrive\\Documents\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
		} 
		else if(browserName.equals("firefox")) { 
			//execute in firefox
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shahr\\OneDrive\\Documents\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) { 
			//execute in edge
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shahr\\OneDrive\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			//WebDriver driver = new EdgeDriver();
			driver = new EdgeDriver();
		}
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	return driver;
	
	}
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		
		return destinationFile;
	}

} 
   