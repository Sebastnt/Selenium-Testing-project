package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPayment extends BasePage {
	public WebDriver driver;
	
	By payByCheck = By.cssSelector("input#payment-option-1");
	By payByWire = By.cssSelector("input#payment-option-2");
	By termsAndConditions = By.cssSelector("input[id=\"conditions_to_approve[terms-and-conditions]\"]");
	By orderBtn = By.xpath("//button[normalize-space()=\"Place order\"]");
	
	public OrderFormPayment() throws IOException {
		super();
	}
	
	public WebElement getPayByCheck() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(payByCheck);
	}
	
	public WebElement getPayByWire() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(payByWire);
	}
	
	public WebElement getTermsAndConditions() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(termsAndConditions);
	}
	
	public WebElement getOrderBtn() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(orderBtn);
	}
	
	
	
}
