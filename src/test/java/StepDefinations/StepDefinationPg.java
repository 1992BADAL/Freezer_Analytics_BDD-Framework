package StepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.AddProducts;
import PageObject.AddTemplatePg;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinationPg {
	public WebDriver driver;
	public AddTemplatePg AddTemp;
	public AddProducts Addprdct;
	
	@Given("User launch Chrome browser and Open the URL {string}")
	public void user_launch_chrome_browser_and_open_the_url(String facegenie) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("use-fake-ui-for-media-stream");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AddTemp = new AddTemplatePg(driver);
		Addprdct = new AddProducts(driver);
		
		driver.get(facegenie);
	}
	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String EmailId, String Pswd) {
		AddTemp.enterEmail(EmailId);
		AddTemp.enterPassword(Pswd);
	}

	@And("Click on login btn")
	public void click_on_login_btn() throws InterruptedException {
		AddTemp.ClickOnLogin();  
	}

	@Then("Verify dashboard page")
	public void verify_dashboard_page() {
		Assert.assertTrue(AddTemp.VerifyDashBoardPage());
	}

	@Then("Go to the Manage Template section")
	public void go_to_the_manage_template_section() throws InterruptedException {
		AddTemp.ClickOnManageTemplates(); 
	}

	@Then("Click on Add Template")
	public void click_on_add_template() throws InterruptedException {
		AddTemp.ClickOnAddTempate();
	}

	@Then("Select Product type")
	public void select_product_type() throws InterruptedException {
		AddTemp.SelectProductField();
	}
	@Then("Click on Choose file for Upload image")
	public void click_on_choose_file_for_upload_image() throws InterruptedException {
		AddTemp.ClickOnChooseImage();
	}

	@Then("Click on Submit btn")
	public void click_on_submit_btn() throws InterruptedException {
		AddTemp.ClickOnSubmit();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	@Then("Search the Template Name on Search field and Verify in Table")
	public void search_the_template_name_on_search_field_and_verify_in_table() throws InterruptedException {
		AddTemp.ClickOnSearchField();
	}

	@Then("Click on View Template")
	public void click_on_view_template() throws InterruptedException {
		AddTemp.ViewDetails();
	}

	@Then("Click on Edit Template")
	public void click_on_edit_template() throws InterruptedException {
		AddTemp.EditTemplateDetails();
	}

	@Then("Click on Delete Template")
	public void click_on_delete_template() throws InterruptedException {
		AddTemp.DeleteTemplate();
	}

	@Then("Click on Logout")
	public void click_on_logout() throws InterruptedException {
		AddTemp.LogOut();
	}

	@Then("Driver close")
	public void driver_close() {
	    driver.quit();
	}
	
	//@@@@@@@@@@@@@@@@@@@@@@@  Add Products  @@@@@@@@@@@@@@@@@@@@@@@@@@\\
	
	

	@Then("Go to the Products section")
	public void go_to_the_products_section() {
		Addprdct.ProductSection(); 
	}

	@Then("Click on Add Product")
	public void click_on_add_product() {
		Addprdct.addProduct(); 
	}

	@Then("Write Product name as {string} on product name field")
	public void write_product_name_as_on_product_name_field(String PdctName) {
		Addprdct.productNameField(PdctName);
	}
	
	@Then("Click on Submit")
	public void click_on_submit() throws InterruptedException {
		Addprdct.Submibtn();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Then("search product name {string} on search field")
	public void search_product_name_on_search_field(String Productname) {
		Addprdct.searchField(Productname);
	}

	@Then("Click on View Product")
	public void click_on_view_product() throws InterruptedException {
		Addprdct.viewDetails();
		Thread.sleep(1000);
		Addprdct.closeVieW();
	}

	@Then("Click on Edit Product")
	public void click_on_edit_product() throws InterruptedException {
		Addprdct.editDetails();
		Thread.sleep(1000);
		Addprdct.closeVieW();
	}

	@Then("Click on Delete Product")
	public void click_on_delete_product() throws InterruptedException {
		Addprdct.deletePrdct();
		Thread.sleep(1000);
		Addprdct.closeVieW();
	}

}