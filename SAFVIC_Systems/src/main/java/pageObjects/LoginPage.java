package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	 
	By email =  By.id("Email");   
	By password = By.id("Password");
	By login = By.xpath("//div/button");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() { 
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
}
