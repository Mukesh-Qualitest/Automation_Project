package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllMobile {
	
	public WebDriver driver;

	public AllMobile(WebDriver driver) {

		this.driver = driver;
	}
	
	By search = By.xpath("//input[@id='myInput']");
	
	public WebElement getSearchBox()
	{
		return driver.findElement(search);
	}

}
