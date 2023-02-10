package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Incident {
	public WebDriver driver;
	
	By incidentTab = By.partialLinkText("/IncidentArea/Incidents/Edit?incidentId");
	 
	By incidentDate =  By.xpath("//div/input[@id = 'IncidentDate']");
	By agencyCaseNo = By.xpath("//input[@id='AgencyIdentifier']");
	By officerBadgeNumber = By.xpath("//input[@id='BadgeNumber']");
	
	By officerRank =  By.xpath("//input[@id='OfficerRank']");   
	By district = By.xpath("//input[@id='District']");
	By childernInvolved = By.xpath("//input[@id='InvolvesChildren']");
	By officerPrimayConcern =  By.xpath("//textarea[@id='OfficerPrimaryConcern']");   
	By suspectedMethManufacture = By.xpath("//textarea[@id 'SuspectedMethManufacture']");
	By sensitiveIssues = By.xpath("//textarea[@id='SensitiveIssues']");
	By covidExposure =  By.xpath("//*[@id='incident-form']/div/div[1]/div[15]/div/span[1]/span");
	By policeContacted = By.xpath("//div/span[@aria-owns='ReasonForContactId_listbox']");
	By reasonPoliceContacted = By.xpath("//*[text()='911 call from within location']");
	By reported = By.xpath("//div/span[@aria-labelledby='ReportedId_label']");
	By detailsReported = By.xpath("//*[text()='911 call hang-up']");
	
	By clickDispatchedDate =  By.xpath("//div/input[@id='DispatchedDate']");   
	//By selectDispatchedDate = By.xpath(""); 
	By clickDispathcedTime = By.xpath("//div/input[@id='DispatchedTime']");
	//By selectDispathcedTime = By.xpath("");
    By incidentSave = By.xpath("//div/button[@type='submit']");
	 
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
		return driver.findElement(agencyCaseNo);
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
		return driver.findElement(clickDispatchedDate);
	}
	public WebElement getDispathcedTime() {
		return driver.findElement(clickDispathcedTime);
	}
	public WebElement getIncidentSave() {
		return driver.findElement(incidentSave);
	}
	
	
}
