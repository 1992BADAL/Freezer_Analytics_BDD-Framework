package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTemplatePg {

	String TemplateName = "Butter";
	// Create WebDriver Object
	WebDriver ldriver;

	// Create Constructor
	public AddTemplatePg(WebDriver rDriver) {
		ldriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}

	@FindBy(xpath = "//input[@id='emailId']")
	WebElement EmailField;

	@FindBy(xpath = "//input[@id='passwordId']")
	WebElement PasswordField;

	@FindBy(xpath = "(//button[normalize-space()='Login'][1])")
	WebElement LoginBtn;

	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement VerifyDashboard;

	@FindBy(xpath = "//span[normalize-space()='Manage templates']")
	WebElement ManageTemplates;

	@FindBy(xpath = "(//span[@class='add-templates-header'])[1]")
	WebElement AddTemplatesBtn;

	@FindBy(xpath = "//input[@id='free-solo-2-demo']")
	WebElement SelectProduct;
	
	@FindBy(xpath = "//li[@id='free-solo-2-demo-option-2']")
	WebElement SlctTempateName; //Butter

	@FindBy(xpath = "//*[@id='Non-MMD']")
	WebElement NonMMDRadioBtn;

	@FindBy(xpath = "//*[@id='MMD']")
	WebElement MMDRadioBtn;

	@FindBy(xpath = "//input[@type='file']")
	WebElement ChooseFile;

	@FindBy(xpath = "//button[normalize-space()='Upload Images']")
	WebElement UploadImage;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submitbtn;

	@FindBy(xpath = "//input[@id='input-placeholder']")
	WebElement searchField;

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M12 4.5C7 ')]")
	WebElement ViewDetails;

	@FindBy(xpath = "//button[@aria-label='Close']") //
	WebElement CloseViewBtn;

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]")
	WebElement EditTemplateBtn;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[1]")
	WebElement CloseEditBtn;

	@FindBy(xpath = "//input[@id='Non-MMD']")
	WebElement ChangeTo_NonMMD;

	@FindBy(xpath = "//input[@id='MMD']")
	WebElement ChangeTo_MMD;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement ClickForSubmit;

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[3]")
	WebElement DeleteBtn;

	@FindBy(xpath = "//button[(text()='Confirm')]")
	WebElement ConfirmDelete;

	@FindBy(xpath = "//span[normalize-space()='Logout']")
	WebElement LogOutBtn;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	WebElement ConfirmLogOut;

	public void enterEmail(String emailAdd) 
	{
		EmailField.clear();
		EmailField.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd) 
	{
		PasswordField.clear();
		PasswordField.sendKeys(pwd);
	}

	public void ClickOnLogin() throws InterruptedException {
		LoginBtn.click();
		Thread.sleep(2000);
	}

	public boolean VerifyDashBoardPage() {
		return VerifyDashboard.isDisplayed();
	}

	public void ClickOnManageTemplates() throws InterruptedException {
		ManageTemplates.click();
		Thread.sleep(2000);
	}

	public void ClickOnAddTempate() throws InterruptedException {
		AddTemplatesBtn.click();
		Thread.sleep(2000);
	}

	public void SelectProductField() throws InterruptedException {
		SelectProduct.click();
		Thread.sleep(1000);
		SlctTempateName.click();//Butter
		Thread.sleep(1000);
	}

	public void ClickOnMmd() throws InterruptedException {
		MMDRadioBtn.click();
		Thread.sleep(1000);
	}

	public void ClickOnNonMMD() throws InterruptedException {
		NonMMDRadioBtn.click();
		Thread.sleep(1000);
	}

	public void ClickOnChooseImage() {
		ChooseFile.sendKeys("C:\\Users\\Badal\\Desktop\\Image\\Butter.jpg");
	}

	public void ClickOnUploadImage() throws InterruptedException {
		UploadImage.click();
		Thread.sleep(3000);
	}

	public void ClickOnSubmit() throws InterruptedException {
		Submitbtn.click();
		Thread.sleep(2000);
	}

	public void ClickOnSearchField() throws InterruptedException {
		searchField.click();
		searchField.sendKeys(TemplateName);
		Thread.sleep(2000);
	}

	public void ViewDetails() throws InterruptedException {
		ViewDetails.click();
		Thread.sleep(2000);
		CloseViewBtn.click();
	}

	public void EditTemplateDetails() throws InterruptedException {
		EditTemplateBtn.click();
		Thread.sleep(1000);
		CloseEditBtn.click();
	}

	public void ChangeMMDtoNonMMD() throws InterruptedException {
		ChangeTo_NonMMD.click();
		Thread.sleep(1000);
	}

	public void ChangeNonMMDtoMMD() throws InterruptedException {
		ChangeTo_MMD.click();
		Thread.sleep(1000);
	}

	public void SubmitBtn() throws InterruptedException {
		ClickForSubmit.click();
		Thread.sleep(1000);
	}

	public void DeleteTemplate() throws InterruptedException {
		searchField.click();
		searchField.clear();
		searchField.sendKeys(TemplateName);
		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(1000);
		ConfirmDelete.click();
		Thread.sleep(2000);
	}

	public void LogOut() throws InterruptedException {
		LogOutBtn.click();
		Thread.sleep(1000);
		ConfirmLogOut.click();
		Thread.sleep(2000);
	}

}