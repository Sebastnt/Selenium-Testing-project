package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage {

	public WebDriver driver;

	By toggle = By.cssSelector(".toggle");
	By homeLink = By.linkText("HOMEPAGE");
	By accordionLink = By.linkText("ACCORDION");
	By browserTabLink = By.linkText("BROWSER TABS");
	By buttonsLink = By.linkText("BUTTONS");
	By calcLink = By.linkText("CALCULATOR (JS)");
	By contactUsLink = By.linkText("CONTACT US FORM TEST");
	By datePickerLink = By.linkText("DATE PICKER");
	By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
	By fileUpload = By.linkText("FILE UPLOAD");
	By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
	By iFrameLink = By.linkText("IFRAME");
	By loaderLink = By.linkText("LOADER");
	By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
	By mouseLink = By.linkText("MOUSE MOVEMENT");
	By popupLink = By.linkText("POP UPS & ALERTS");
	By predictiveLink = By.linkText("PREDICTIVE SEARCH");
	By tablesLink = By.linkText("TABLES");
	By testStoreLink = By.linkText("TEST STORE");
	By aboutMeLink = By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");

	public Homepage() throws IOException {
		super();
	}

	public WebElement getToggle() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(toggle);
	}

	public WebElement getHomepageLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(homeLink);
	}

	public WebElement getAccordionLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(accordionLink);
	}

	public WebElement getBrowserTabLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(browserTabLink);
	}

	public WebElement getButtonLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(buttonsLink);
	}

	public WebElement getCalcLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(calcLink);
	}

	public WebElement getContactUsLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(contactUsLink);
	}

	public WebElement getDatePickerLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(datePickerLink);
	}

	public WebElement getDropdownLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(dropdownLink);
	}

	public WebElement getFileUploadLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(fileUpload);
	}

	public WebElement getHiddenElementsLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(hiddenElementsLink);
	}

	public WebElement getIframeLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(iFrameLink);
	}

	public WebElement getLoaderLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(loaderLink);
	}

	public WebElement getLoginPortalLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(loginPortalLink);
	}

	public WebElement getMouseLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(mouseLink);
	}

	public WebElement getPopupLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(popupLink);
	}

	public WebElement getPredictiveLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(predictiveLink);
	}

	public WebElement getTablesLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(tablesLink);
	}

	public WebElement getTestStoreLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(testStoreLink);
	}

	public WebElement getAboutMeLink() throws InterruptedException, IOException {
		this.driver = getDriver();
		return driver.findElement(aboutMeLink);
	}

	public WebElement getCookie() throws IOException, InterruptedException {
		this.driver = getDriver();
		return driver.findElement(cookie);
	}
}
