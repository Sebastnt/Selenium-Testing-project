package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopLoginPage extends BasePage {
	
	public WebDriver driver;

	By email = By.cssSelector("input#field-email");
	By password = By.cssSelector("input#field-password");
	By signInBtn = By.cssSelector("button#submit-login");
	By errorMessage = By.cssSelector("div.help-block li");
	
	public ShopLoginPage() throws IOException {
		super();
	}
	
	public WebElement getEmail() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(email);
	}
	
	public WebElement getPassword() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(password);
	}
	
	public WebElement getSignInBtn() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(signInBtn);
	}
	
	public WebElement getErrorMessage() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(errorMessage);
	}

}
