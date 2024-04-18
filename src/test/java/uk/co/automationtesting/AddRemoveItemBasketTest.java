package uk.co.automationtesting;

import java.io.IOException;



import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;


@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}
	
	
	@Test
	public void addRemoveItem() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting AddRemoveItemBasketTest...");
		
		Homepage home = new Homepage();
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		Thread.sleep(2000);
		
		ShopHomePage shopHome = new ShopHomePage();
		ExtentManager.pass("Reached the shop homepage");
		shopHome.getProdOne().click();
		

		Thread.sleep(2000);
		
		ShopProductPage shopProduct = new ShopProductPage();
		ExtentManager.pass("Reached the shop product page");
		Select sizeOption = new Select(shopProduct.getSizeOption());
		sizeOption.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selected product size");
		shopProduct.getBlackColorOption().click();
		ExtentManager.pass("Have successfully selected black color");
		shopProduct.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased quantity");
		shopProduct.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added product to basket");
		
		Thread.sleep(2000);
		
		ShopContentPanel shopContent = new ShopContentPanel();
		shopContent.getContinueShopping().click();
		
		Thread.sleep(2000);
		
		shopProduct.getHomepageLink().click();
		
		Thread.sleep(2000);
		
		shopHome.getProdTwo().click();
		
		Thread.sleep(2000);
		
		Select sizeOption2 = new Select(shopProduct.getSizeOption());
		sizeOption2.selectByVisibleText("L");
		shopProduct.getAddToCartBtn().click();
		
		Thread.sleep(2000);
		
		shopContent.getCheckoutBtn().click();
		
		Thread.sleep(2000);
		
		ShoppingCart shopCart = new ShoppingCart();
		System.out.println(shopCart.getTotalAmount().getText());
		Assert.assertEquals(shopCart.getTotalAmount().getText(), "$73.96");
		shopCart.getDeleteItemTwo().click();
		
		//waitForElementInvisible(shopCart.getDeleteItemTwo(), 10);
		Thread.sleep(3000);
		
		System.out.println(shopCart.getTotalAmount().getText());
		
		try {
			Assert.assertEquals(shopCart.getTotalAmount().getText(), "$45.23");
			ExtentManager.pass("The total amount matches the expected amount.");
		} catch (AssertionError e) {
			Assert.fail("Cart amount did not match the expected amount, if found " + shopCart.getTotalAmount().getText() + " expected $45.23");
			ExtentManager.fail("The total amount did not match the expected amount");
		}
		
	}
}
