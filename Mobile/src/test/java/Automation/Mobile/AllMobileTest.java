package Automation.Mobile;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AllMobile;
import pageObject.LandingPage;
import pageObject.OrderPage;
import resources.base;

public class AllMobileTest extends base {
	
	@Test
	public void allMobile() throws IOException
	{
		driver = initializeDriver();
		
		LandingPage l = new LandingPage(driver);
		l.getAllMobileLink().click();
		AllMobile am = new AllMobile(driver);
		
		String pName="App";
		am.getSearchBox().sendKeys(pName);
		
		List<WebElement> products = driver.findElements(By.xpath("//td[contains(text(),'"+pName+"')]"));
		
		for(int i=0;i<=products.size()+2;i++)
		{
			driver.findElements(By.xpath("//td[contains(text(),'"+pName+"')]//following-sibling::td[4]//a")).get(i).click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			String paraentId = it.next();
			String childId = it.next();
			driver.switchTo().window(childId);
			driver.manage().window().maximize();
			OrderPage op = new OrderPage(driver);
			op.getFName().sendKeys("xcv");
			op.getLName().sendKeys("chj");
			op.getEmail().sendKeys("cghjk");
			op.getPassword().sendKeys("cjkl");
			op.getMCheck().click();
			op.getMNumber().sendKeys("dfghjkl");
			op.getAddressOne().sendKeys("fghjk");
			op.getAddressTwo().sendKeys("dfghjkl");
			op.getCity().sendKeys("vb");
			WebElement staticDropDown1 = driver.findElement(By.id("inputState"));
			Select state= new Select(staticDropDown1);
			state.selectByVisibleText("Karnataka");
			op.getZipCode().sendKeys("fghjkl");
			op.getSCheck().click();
			op.getACheck().click();
			op.getAProduct().click();
			op.getNoCount().sendKeys("cvbnm.");
			WebElement staticDropDown2 = driver.findElement(By.id("bought"));
			Select count= new Select(staticDropDown2);
			count.selectByVisibleText("No");
			op.getAddressCheck().click();
			op.getMobileCheck().click();
			op.getOButton().click();
			String  message=op.getSMes().getText();
			Assert.assertTrue(op.getCloseButton().isDisplayed());
			System.out.println(message);
			op.getCloseButton().click();
		}
	}

}
