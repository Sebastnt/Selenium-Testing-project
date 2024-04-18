package uk.co.automationtesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopHomePage;
import pageObjects.ShopLoginPage;
import pageObjects.ShopYourAccount;



@Listeners(resources.Listeners.class)

public class ShopLoginTest extends Hooks {

	public ShopLoginTest() throws IOException {
		super();
	}
	
	
	@Test
	public void ShopLogin() throws IOException, InterruptedException {
		
		ExtentManager.log("Starting ShopLoginTest...");
		
		Homepage home = new Homepage();
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		Thread.sleep(1000);
		
		ShopHomePage shopHome = new ShopHomePage();
		ExtentManager.pass("Reached the shop homepage");
		shopHome.getSignInBtn().click();
		

		Thread.sleep(1000);
		
		FileInputStream workbookLocation = new FileInputStream(System.getProperty("user.dir") + 
				"\\src\\main\\java\\resources\\credentials.xlsx");
				
		XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cellR1C0 = sheet.getRow(1).getCell(0);
		XSSFCell cellR1C1 = sheet.getRow(1).getCell(1);
		
		String emailRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();		
				
		ShopLoginPage loginPage = new ShopLoginPage();
		ExtentManager.pass("Reached the login page");
		loginPage.getEmail().sendKeys(emailRow1);
		loginPage.getPassword().sendKeys(passwordRow1);
		loginPage.getSignInBtn().click();
		
		
		try {
			Assert.assertEquals(true, shopHome.getProfileBtn().isDisplayed());
			ExtentManager.pass("The user has logged in successfully!!");
		} catch (AssertionError e) {
			Assert.assertEquals(false, shopHome.getProfileBtn().isDisplayed());
			ExtentManager.fail("The user has not logged. The credentials are not valid");
		}
		
		shopHome.getProfileBtn().click();
		
		ShopYourAccount yourAccount = new ShopYourAccount();
		
		try {
			Assert.assertEquals(yourAccount.getHeading().getText(), "Your account");
			ExtentManager.pass("The page heading is equal to Your account");
		} catch (AssertionError e) {
			Assert.fail("The page header did not match the expected value, it found " + yourAccount.getHeading().getText() + " expected Your account");
			ExtentManager.fail("The page heading is not equal to Your account");
		}
		
		yourAccount.getSignOutBtn().click();
		ExtentManager.pass("The user has logged out successfully!!");
		
		
		XSSFRow row2 = sheet.getRow(2);
		XSSFCell cellR2C0 = sheet.getRow(2).getCell(0);
		XSSFCell cellR2C1 = sheet.getRow(2).getCell(1);
		
		String emailRow2 = cellR2C0.toString();
		String passwordRow2 = cellR2C1.toString();		
		
		ExtentManager.pass("Reached the login page");
		loginPage.getEmail().sendKeys(emailRow2);
		loginPage.getPassword().sendKeys(passwordRow2);
		loginPage.getSignInBtn().click();
		
		
		try {
			Assert.assertEquals(loginPage.getErrorMessage().getText(), "Authentication failed.");
			ExtentManager.pass("The error message is equal to Authentication failed.");
		} catch (AssertionError e) {
			Assert.fail("The error message did not match the expected value, it found " + yourAccount.getHeading().getText() + " expected Authentication failed.");
			ExtentManager.fail("The page heading is not equal to Your account");
		}
		
	}
}
