package Automation.Mobile;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ContactUs;
import pageObject.LandingPage;
import pageObject.OrderPage;
import resources.base;

public class ContactTest extends base {

	@Test(dataProvider="getData")
	public void get_Contact(String un,String em,String ph,String msg) throws IOException {
		driver = initializeDriver();
		LandingPage l = new LandingPage(driver);
		l.getSLink().click();
		l.getCLink().click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String paraentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		
		ContactUs cu = new ContactUs(driver);
		cu.get_UName().sendKeys(un);
		cu.get_Email().sendKeys(em);
		cu.get_Ph().sendKeys(ph);
		cu.get_Msg().sendKeys(msg);
		cu.get_SendButton().click();
	}
	@DataProvider
	public Object getData()
	{
		return new Object[][] 
				{{"Test","test@Example.com","1234567890","Full of bugs"},
			{"Test","","1234567890","Full of bugs"},
			{"Test","test@com","1234567890","Full of bugs"},
			{"Test","@Example.com","1234567890","Full of bugs"},
			{"Test","test@Example","1234567890","Full of bugs"},
			{"Test","test@Example.com","","Full of bugs"},
			{"Test","test@Example.com","1234567890",""},}; 
	}

}
