package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {

	public WebDriver driver;

	public ContactUs(WebDriver driver) {
		this.driver = driver;
	}
	
	By uName = By.xpath("//input[@name=\"name\"]");
	By eMail = By.xpath("//input[@name=\"email\"]");
	By ph = By.xpath("//input[@name=\"phone\"]");
	By msg = By.xpath("//textarea[@name=\"message\"]");
	By sButton = By.xpath("//input[@type='submit']");
	
	
	public WebElement get_UName()
	{
		return driver.findElement(uName);
	}
	public WebElement get_Email()
	{
		return driver.findElement(eMail);
	}
	public WebElement get_Ph()
	{
		return driver.findElement(ph);
	}
	public WebElement get_Msg()
	{
		return driver.findElement(msg);
	}
	
	public WebElement get_SendButton()
	{
		return driver.findElement(sButton);
	}


}
