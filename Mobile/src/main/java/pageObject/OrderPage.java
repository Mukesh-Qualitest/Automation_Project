package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {

	public WebDriver driver;
	
	public OrderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By fName = By.xpath("//div[1]/input[@id='inputFirstName']");
	By lName = By.xpath("//div[2]/input[@id='inputFirstName']");
	By email = By.xpath("//input[@id='inputEmail']");
	By password = By.xpath("//input[@id='inputPassword']");
	By mCheck = By.xpath("//input[@id='flexRadioDefault1']");
	By fCheck = By.xpath("//input[@id='flexRadioDefault2']");
	By mNumber = By.xpath("//input[@placeholder='00000000000']");
	By addressOne = By.xpath("//input[@placeholder='12 Apartment or floor']");
	By addressTwo = By.xpath("//input[@placeholder='Main St']");
	By city = By.xpath("//input[@id='inputCity']");	
	By zip = By.xpath("//input[@id='inputZip']");
	By sCheck = By.xpath("//*[@id=\"myForm\"]/fieldset/div/div[1]/div/div[2]/label/input");
	By aCheck = By.xpath("//*[@id=\"myForm\"]/fieldset/div/div[1]/div/div[1]/label/input");
	By lCheck = By.xpath("//input[@rel='lenovo']");
	By aProduct = By.xpath("//option[contains(text(),'Apple XS ')]");
	By noCount = By.xpath("//input[@placeholder='no of mobiles']");
	By addressCheck = By.xpath("//div[8]//input[@id='gridCheck1']");
	By mobileCheck = By.xpath("//div[9]//input[@id='gridCheck1']");
	By oButton = By.xpath("//button[contains(text(),'Order Now')]");
	By sMes = By.xpath("//div[contains(text(),'Your Order has been Placed Successfully!')]");
	By cButton = By.xpath("//a[contains(text(),'Close')]");
	
	
	public WebElement getFName()
	{
		return driver.findElement(fName);
	}
	
	public WebElement getLName()
	{
		return driver.findElement(lName);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getMCheck()
	{
		return driver.findElement(mCheck);
	}
	
	public WebElement getFCheck()
	{
		return driver.findElement(fCheck);
	}
	
	public WebElement getMNumber()
	{
		return driver.findElement(mNumber);
	}
	
	public WebElement getAddressOne()
	{
		return driver.findElement(addressOne);
	}
	
	public WebElement getAddressTwo()
	{
		return driver.findElement(addressTwo);
	}
	
	public WebElement getCity()
	{
		return driver.findElement(city);
	}
	
	public WebElement getZipCode()
	{
		return driver.findElement(zip);
	}
	
	public WebElement getSCheck()
	{
		return driver.findElement(sCheck);
	}
	
	public WebElement getACheck()
	{
		return driver.findElement(aCheck);
	}
	
	public WebElement getLCheck()
	{
		return driver.findElement(lCheck);
	}
	public WebElement getAProduct()
	{
		return driver.findElement(aProduct);
	}
	
	public WebElement getNoCount()
	{
		return driver.findElement(noCount);
	}
	
	public WebElement getAddressCheck()
	{
		return driver.findElement(addressCheck);
	}
	
	public WebElement getMobileCheck()
	{
		return driver.findElement(mobileCheck);
	}
	
	public WebElement getOButton()
	{
		return driver.findElement(oButton);
	}
	
	public WebElement getSMes()
	{
		return driver.findElement(sMes);
	}
	
	public WebElement getCloseButton()
	{
		return driver.findElement(cButton);
	}
	
}
