package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	By sButton = By.xpath("//button[@type='submit']");
	By sLink = By.xpath("//a[contains(text(),\"Support\")]");
	By oLink = By.xpath("//a[contains(text(),\"Order\")]");
	By cLink = By.xpath("//a[contains(text(),\"Contact Us\")]");
	By amLink = By.xpath("//a[contains(text(),'All Mobile')]");
	
	public WebElement getSignUp() {
		return driver.findElement(sButton);
	}
	
	public WebElement getSLink() {
		return driver.findElement(sLink);
	}
	
	public WebElement getOLink() {
		return driver.findElement(oLink);
	}
	public WebElement getCLink()
	{
		return driver.findElement(cLink);
	}
	public WebElement getAllMobileLink()
	{
		return driver.findElement(amLink);
	}


}
