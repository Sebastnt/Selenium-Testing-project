package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopContentPanel extends BasePage {
	
	public WebDriver driver;
	
	
	By continueShopping = By.xpath("//button[normalize-space()=\"Continue shopping\"]");
	By checkoutBtn = By.linkText("PROCEED TO CHECKOUT");
	
	public ShopContentPanel() throws IOException {
		super();
	}
	
	public WebElement getContinueShopping() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(continueShopping);
	}
	
	public WebElement getCheckoutBtn( ) throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}

}
