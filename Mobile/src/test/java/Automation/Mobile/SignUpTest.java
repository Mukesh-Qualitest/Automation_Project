package Automation.Mobile;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.SignupPage;
import resources.base;

public class SignUpTest extends base {
	
	@Test(dataProvider="getData",priority=1)
	public void signUp(String fn,String ln,String em,String pw,String db,String ph,String bio) throws InterruptedException, IOException 
	{
		
		driver=initializeDriver();
		LandingPage l = new LandingPage(driver);
		l.getSignUp().click();
		LoginPage lp = new LoginPage(driver);
		lp.getSignup().click();
		SignupPage sp = new SignupPage(driver);
		sp.getFname().sendKeys(fn);
		sp.getLname().sendKeys(ln);
		sp.getEmail().sendKeys(em);
		sp.getPassword().sendKeys(pw);
		sp.getDob().sendKeys(db);
		
		sp.getPhNo().sendKeys(ph);
		sp.getSBio().sendKeys(bio);
		sp.getMaleCheck().click();
		sp.getRBatton().click();
		Alert ar =driver.switchTo().alert();
		String responceAlert =ar.getText();
		Assert.assertEquals(responceAlert,"Hai,"+fn+"! Go To SingIn");
		ar.accept();
		
	}
	@DataProvider
	public Object getData()
	{
		
		return new Object[][] {{"test","Example","test@example","1234","13-12-19","2345678","i am a test engineer please ignore the meessage it was just for testing purpose"},
			/*{"test","","test@example","1234","13-12-19","2345678","xrctvybuniml"},
			{"test","Example","test","1234","13-12-19","2345678","xrctvybuniml"},
			{"test","Example","test.com","1234","13-12-19","2345678","xrctvybuniml"},
			{"test","Example","@com","1234","13-12-19","2345678","xrctvybuniml"},
			{"test","Example","test@example","","13-12-19","2345678","xrctvybuniml"},
			{"test","Example","test@example","1234","-19","2345678","xrctvybuniml"},
			{"test","Example","test@example","1234","13-12-19","2345678",""}*/};
	}
}
