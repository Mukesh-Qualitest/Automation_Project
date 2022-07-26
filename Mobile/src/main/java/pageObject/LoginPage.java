package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By email = By.id("username");
	By password = By.id("password");
	By lButton = By.linkText("Log In");
	By lSignup = By.linkText("Sign up");

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogIn() {
		return driver.findElement(lButton);
	}
	
	public WebElement getSignup() {
		return driver.findElement(lSignup);
	}
}
