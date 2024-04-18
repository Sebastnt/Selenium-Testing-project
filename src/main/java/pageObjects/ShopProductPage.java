package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage {
	
	public WebDriver driver;
	
	By sizeOption = By.xpath("//select[@aria-label=\"Size\"]");
	By whiteColorOption = By.xpath("//input[@title=\"White\"]");
	By blackColorOption = By.xpath("//input[@title=\"Black\"]");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
	By homepageLink = By.xpath("//span[.='Home']");
	
	public ShopProductPage() throws IOException {
		super();
	}
	
	public WebElement getSizeOption() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(sizeOption);
	}
	
	public WebElement getWhiteColorOption() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(whiteColorOption);
	}
	
	public WebElement getBlackColorOption() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(blackColorOption);
	}
	
	public WebElement getQuantityIncrease() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(quantityIncrease);
	}

	public WebElement getQuantityDecrease() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(quantityDecrease);
	}
	
	public WebElement getAddToCartBtn() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement getHomepageLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}

}
