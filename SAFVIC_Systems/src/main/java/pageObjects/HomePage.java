package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	 
	By title = By.cssSelector("body > div.page-wrapper > div.page-container > div.page-content-wrapper.foggy-page-container > div > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(1) > a > div > div > span.info-box-text");	
	By navBar = By.cssSelector("body > div.page-wrapper > div.page-container > div.page-content-wrapper.foggy-page-container > div > div:nth-child(3) > div:nth-child(1) > div");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}
	
}
