package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProducts {
	
	//Create WebDriver Object
	WebDriver ldriver;
	
	//Create Constructor
	public AddProducts(WebDriver rDriver) {
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Products']")
	WebElement Prdct;
	
	@FindBy(xpath="//span[@class='add-templates-header']")
	WebElement AddProduct;
	
	@FindBy(xpath="//input[@type='name']")
	WebElement PrdctMneField;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement SubmitBTn;
	
	@FindBy(xpath="//input[@id='input-placeholder']")
	WebElement SrchField;
	
	@FindBy(xpath="//*[name()='path' and contains(@d,'M12 4.5C7 ')]")
	WebElement ViewDetails;
	
	@FindBy(xpath="//button[@aria-label='Close']")
	WebElement CloseVieW;
	
	@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]")
	WebElement EditView;
	
	@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[3]")
	WebElement Delete;
	
	@FindBy(xpath="(//button[normalize-space()='Confirm'])[1]")
	WebElement ConfirmedDelete;
	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	WebElement ClickOnLogout;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement ConfirmLogout;
	
	
	public void ProductSection() {
		Prdct.click();
	}
	public void addProduct() {
		AddProduct.click();
	}
	public void productNameField(String Prdctname) {
		PrdctMneField.click();
		PrdctMneField.sendKeys(Prdctname);
	}
	public void Submibtn() {
		SubmitBTn.click();
	}
	public void searchField(String pdctName) {
		SrchField.click();
		SrchField.sendKeys(pdctName);
	}
	public void viewDetails() {
		ViewDetails.click();
	}
	public void closeVieW() {
		CloseVieW.click();
	}
	public void editDetails() {
		EditView.click();
	}
	public void deletePrdct() throws InterruptedException {
		Delete.click();
		Thread.sleep(1000);
		ConfirmedDelete.click();
	}
	public void ClickOnLogOut() throws InterruptedException {
		ClickOnLogout.click();
		Thread.sleep(1000);
		ConfirmLogout.click();
	}

}
