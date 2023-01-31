package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Incident {
	public WebDriver driver;
	
	By incidentTab = By.id("test");
	 
	By incidentDate =  By.id("Email");   
	By incidentCaseNo = By.id("Password");
	By officerBadgeNumber = By.xpath("//div/button");
	
	By officerRank =  By.id("Email");   
	By district = By.id("Password");
	By childernInvolved = By.xpath("//div/button");
	By officerPrimayConcern =  By.id("Email");   
	By suspectedMethManufacture = By.id("Password");
	By sensitiveIssues = By.xpath("//div/button");
	By covidExposure =  By.id("Email");   
	By policeContacted = By.id("Password");
	By reported = By.xpath("//div/button");
	By dispathcedDate =  By.id("Email");   
	By dispathcedTime = By.id("Password");
    By incidentSave = By.id("test");
	
	public Incident(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getIncidentTab() {
		return driver.findElement(incidentTab);
	}
	
	public WebElement getIncidentDate() {
		return driver.findElement(incidentDate);
	}
	
	public WebElement getIncidentCaseNo() {
		return driver.findElement(incidentCaseNo);
	}
	
	public WebElement getOfficerBadgeNumber() {
		return driver.findElement(officerBadgeNumber);
	}
	public WebElement getOfficerRank() {
		return driver.findElement(officerRank);
	}
	public WebElement getDistrict() {
		return driver.findElement(district);
	}
	public WebElement getChildernInvolved() {
		return driver.findElement(childernInvolved);
	}
	public WebElement getOfficerPrimayConcern() {
		return driver.findElement(officerPrimayConcern);
	}
	public WebElement getSuspectedMethManufacture() {
		return driver.findElement(suspectedMethManufacture);
	}
	public WebElement getSensitiveIssues() {
		return driver.findElement(sensitiveIssues);
	}
	public WebElement getCovidExposure() {
		return driver.findElement(covidExposure);
	}
	public WebElement getPoliceContacted() {
		return driver.findElement(policeContacted);
	}
	public WebElement getReported() {
		return driver.findElement(reported);
	}
	public WebElement getDispathcedDate() {
		return driver.findElement(dispathcedDate);
	}
	public WebElement getDispathcedTime() {
		return driver.findElement(dispathcedDate);
	}
	public WebElement getIncidentSave() {
		return driver.findElement(dispathcedDate);
	}
	
}
