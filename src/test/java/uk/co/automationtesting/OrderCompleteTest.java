package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayment;
import pageObjects.OrderFormPersInfo;
import pageObjects.OrderFormShippingMethod;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();
		
	}
	
	@Test
	public void endToEndTest() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting OrderCompleteTest...");
		
		
		Homepage home = new Homepage();
		home.getCookie().click();
		home.getTestStoreLink().click();
		ExtentManager.pass("Reached the store homepage");
		
		Thread.sleep(2000);
		
		ShopHomePage shopHome = new ShopHomePage();
		shopHome.getProdOne().click();
		ExtentManager.pass("Have successfully clicked on product");
		
		Thread.sleep(2000);
		
		ShopProductPage shopProduct = new ShopProductPage();
		ExtentManager.pass("Have successfully reached shop product page");
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
		shopContent.getCheckoutBtn().click();
		
		Thread.sleep(2000);
		
		ShoppingCart shopCart = new ShoppingCart();
		ExtentManager.pass("Have successfully reached shopping cart page");
		shopCart.getHavePromo().click();
		Thread.sleep(2000);
		ExtentManager.pass("Have successfully selected the promo button");
		shopCart.getPromoTextbox().sendKeys("20OFF");
		shopCart.getPromoAddBtn().click();
		shopCart.getProceedCheckoutBtn().click();
		ExtentManager.pass("Have successfully selected the checkout button");
		
		OrderFormPersInfo  persInfo = new OrderFormPersInfo();
		persInfo.getGenderMr().click();
		persInfo.getFirstNameField().sendKeys("Pepito");
		persInfo.getLastnameField().sendKeys("Perez");
		persInfo.getEmailField().sendKeys("pepito1@gmail.com");
		persInfo.getTermsConditionsCheckbox().click();
		persInfo.getContinueBtn().click();
		ExtentManager.pass("Have successfully entered customer details");
		
		OrderFormDelivery formDelivery = new OrderFormDelivery();
		formDelivery.getAddressField().sendKeys("123 Testing St");
		formDelivery.getCityField().sendKeys("Metropolis");
		Select stateOption = new Select(formDelivery.getStateDropdown());
		stateOption.selectByVisibleText("Florida");
		formDelivery.getPostcodeField().sendKeys("54781");
		formDelivery.getContinueBtn().click();
		ExtentManager.pass("Have successfully entered delivery info");
		
		OrderFormShippingMethod shippingMethod = new OrderFormShippingMethod();
		shippingMethod.getDeliveryMsgTextbox().sendKeys("Testing this field");
		shippingMethod.getContinueBtn().sendKeys("Testing this field");
		ExtentManager.pass("Have successfully selected the shipping method");
		
		OrderFormPayment formPayment = new OrderFormPayment();
		formPayment.getPayByCheck().click();
		formPayment.getTermsAndConditions().click();
		formPayment.getOrderBtn().click();
		ExtentManager.pass("Have successfully placed order");
		
	}
}
