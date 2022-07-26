package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	
	public WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By fName= By.xpath("//input[@placeholder='First Name']");
	By lName = By.xpath("//input[@placeholder='Last Name']");
	By email = By.xpath("//input[@placeholder='Enter Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By dob = By.xpath("//input[@type='date']");
	By mCheck = By.xpath("//div[@class='col-md-2']/input[1]");
	By fCheck = By.xpath("//div[@class='col-md-3']/input[1]");
	By phNo = By.xpath("//input[@type='number']");
	By sBio = By.xpath("//textarea[@placeholder='Short Bio']");
	By rButton = By.xpath("//button[contains(text(),'Register')]"); 
	By sButton = By.xpath("//button[contains(text(),'Sign In')]");
	
	
	
	public WebElement getFname() {
		return driver.findElement(fName);
	}
	
	public WebElement getLname() {
		return driver.findElement(lName);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getDob() {
		return driver.findElement(dob);
	}
	
	public WebElement getMaleCheck() {
		return driver.findElement(mCheck);
	}
	
	public WebElement getFemaleCheck() {
		return driver.findElement(fCheck);
	}
	
	public WebElement getPhNo() {
		return driver.findElement(phNo);
	}
	
	public WebElement getSBio() {
		return driver.findElement(sBio);
	}
	
	public WebElement getRBatton() {
		return driver.findElement(rButton);
	}
	
	public WebElement getSBatton() {
		return driver.findElement(sButton);
	}


}
