package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class People {
	public WebDriver driver;
	//Add new person 
	By add_Person =  By.partialLinkText("/IncidentArea/IncidentPersons/Create?incidentId");
	
	//Basic Info
	By firstName = By.xpath("//input[@id='FirstName']");
	By lastName = By.xpath("//input[@id='LastName']");
	By midName = By.xpath("//input[@id='MiddleName']");
	By alias = By.className(null);
	By personType = By.xpath(null);
	By unknownPerson = By.xpath(null);
	By race = By.xpath("");
	By sex = By.xpath("");
	By dob = By.xpath("");
	 
	public People(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() { 
		return driver.findElement(lastName);
	}
	
	public WebElement getMidName() {
		return driver.findElement(midName);
	}
	
}
