package Automation.Mobile;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.OrderPage;
import resources.base;

public class OrderTest extends base {

	@Test(dataProvider="getData",priority=1)
	public void orderTest(String fn,String ln,String em,String pw,String pn,String ad1,String ad2,String c,String zp,String cnt) throws IOException
	{
		driver = initializeDriver();
		
		LandingPage l= new LandingPage(driver);
		l.getSLink().click();
		l.getOLink().click();
		
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		OrderPage op = new OrderPage(driver);
		
		op.getFName().sendKeys(fn);
		op.getLName().sendKeys(ln);
		op.getEmail().sendKeys(em);
		op.getPassword().sendKeys(pw);
		op.getMCheck().click();
		op.getMNumber().sendKeys(pn);
		op.getAddressOne().sendKeys(ad1);
		op.getAddressTwo().sendKeys(ad2);
		op.getCity().sendKeys(c);
		WebElement staticDropDown1 = driver.findElement(By.id("inputState"));
		Select state= new Select(staticDropDown1);
		state.selectByVisibleText("Karnataka");
		op.getZipCode().sendKeys(zp);
		op.getSCheck().click();
		op.getACheck().click();
		op.getAProduct().click();
		op.getNoCount().sendKeys(cnt);
		WebElement staticDropDown2 = driver.findElement(By.id("bought"));
		Select count= new Select(staticDropDown2);
		count.selectByVisibleText("No");
		op.getAddressCheck().click();
		op.getMobileCheck().click();
		op.getOButton().click();
		String  message=op.getSMes().getText();
		Assert.assertFalse(op.getCloseButton().isDisplayed());
		System.out.println(message);
		op.getCloseButton().click();
		
	}
	@DataProvider
	public Object getData()
	{
		return new Object [][] {{"Test","Example","Test@Example.com","1234","1234567890","#3390/26, 3rd cross,","hampinagara","Bangalore","560003","3"},
			};
		
	}
	@Test(dataProvider="getInvalidData")
	public void orderInvalidTest(String fn,String ln,String em,String pw,String pn,String ad1,String ad2,String c,String zp,String cnt) throws IOException
	{
		driver = initializeDriver();
		
		LandingPage l= new LandingPage(driver);
		l.getSLink().click();
		l.getOLink().click();
		
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		OrderPage op = new OrderPage(driver);
		op.getFName().sendKeys(fn);
		op.getLName().sendKeys(ln);
		op.getEmail().sendKeys(em);
		op.getPassword().sendKeys(pw);
		op.getMCheck().click();
		op.getMNumber().sendKeys(pn);
		op.getAddressOne().sendKeys(ad1);
		op.getAddressTwo().sendKeys(ad2);
		op.getCity().sendKeys(c);
		WebElement staticDropDown1 = driver.findElement(By.id("inputState"));
		Select state= new Select(staticDropDown1);
		state.selectByVisibleText("Karnataka");
		op.getZipCode().sendKeys(zp);
		op.getSCheck().click();
		op.getACheck().click();
		op.getAProduct().click();
		op.getNoCount().sendKeys(cnt);
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
	@DataProvider
	public Object getInvalidData()
	{
		return new Object [][] {
			{"","Example","Test@Example.com","1234","1234567890","#3390/26, 3rd cross,","hampinagara","Bangalore","560003","3"},
			{"Test","","Test@Example.com","1234","1234567890","#3390/26, 3rd cross,","hampinagara","Bangalore","560003","3"},
			{"Test","Example","","1234","1234567890","#3390/26, 3rd cross,","hampinagara","Bangalore","560003","3"},
			};
		
	}
}
