package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Incident_Creation {
	public WebDriver driver;
	 
	By incidents = By.xpath("//a[@href='/IncidentArea/Incidents']/div");	
	By incidentsDropdown = By.cssSelector("");
	By incidentsClick = By.cssSelector(""); 
	
	By createIncidents = By.xpath("");
	By incidentDate = By.id("IncidentDate");
	By incidentCaseNumber = By.id("AgencyIdentifier");
	By incidentType = By.id("IncidentTypeId");
	
	
	
	public Incident_Creation(WebDriver driver) {
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
