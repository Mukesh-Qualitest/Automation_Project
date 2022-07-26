package Automation.Mobile;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class LoginPageTest extends base {
	
	@Test(dataProvider="getData")
	public void logIn(String username,String password) throws IOException
	{
		driver = initializeDriver();
		
		LandingPage l= new LandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		
		l.getSignUp().click();
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogIn().click();
		
	}
	
	@DataProvider
	public Object getData()
	{	
		return new Object[][] {{"Test@xyz.com","1234"},
			{"","1234"},
			{"Test@xyz.com",""},
			{"",""}};
	}
}
