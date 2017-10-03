package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.framework.common.PageControls;

public class AirlinePracticePage extends PageControls{
	/**
	 * Description:This is AirlinePractice page constructor. It holds
	 * all the element locators in AirlinePractice page
	 * 
	 * @param webDriver
	 */
	public AirlinePracticePage(WebDriver driver) {
		super(driver);
	}
	public static final By Industries_link = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/a");
	public static final By AirlinePractice_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[1]/a");
	public static final By VALIDATE_APPage = By.xpath("//*[@id='hs_cos_wrapper_module_1487261916561740']/div/div[2]/div[1]/div/h1");
	public static final By CustomerandProspectDataCleansing_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[1]/ul/li[1]/a");
	public static final By VALIDATE_CPDCPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h1");
	public static final By AirlineCXDataWarehouse_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[1]/ul/li[2]/a");
	public static final By VALIDATE_ACXDWPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h1");
	public static final By AirlineLoyaltyandCX_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[1]/ul/li[3]/a");
	public static final By VALIDATE_ALCXPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h1");
	public static final By AirlineCustomerDataExchange_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[1]/ul/li[4]/a");
	public static final By VALIDATE_ACDXPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h1");
	/**
	 * MethodName: clickOnIndustries() Description: This method is used to
	 * navigating On Industries tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnIndustries() throws InterruptedException {

		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//div[2]/ul/li[2]/a"));
		action.moveToElement(menu).perform();
		reportInfo("Clicking on Industries tab");
	}
	/**
	 * MethodName: clickingOnAirlinePractice() Description: This method is used
	 * to navigate AirlinePracticePage
	 */
	public void clickingOnAirlinePractice() {
		this.click(AirlinePractice_Page);
		reportInfo("clicked on AirlinePractice link");
	}
	public void CustomerandProspectDataCleansing() {
		this.click(CustomerandProspectDataCleansing_Page);
		reportInfo("clicked on CustomerandProspectDataCleansing link");
	}
	public void AirlinecxDataWarehouse() {
		this.click(AirlineCXDataWarehouse_Page);
		reportInfo("clicked on AirlineCXDataWarehouse link");
	}
	public void AirlineLoyaltyandCX() {
		this.click(AirlineLoyaltyandCX_Page);
		reportInfo("clicked on AirlineLoyaltyandCX link");
	}
	public void AirlineCustomerDataExchange() {
		this.click(AirlineCustomerDataExchange_Page);
		reportInfo("clicked on AirlineCustomerDataExchange link");
	}
	
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	/**
	 * MethodName: assertAirlinePracticeName() Description: This method is used to assert
	 * statements
	 */

	public void assertText(String expected, String actual, By by, String message){
		if(expected.equalsIgnoreCase(actual)){
			reportPassedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String successFilePath = elementScreenshot(by);
			reportSuccessScreenshot(successFilePath,message);
		}else{
			reportFailedStatus("Expected [ "+expected+" ] : Actual [ "+actual+" ]");
			String failureFilePath = driverScreenshot();
			reportFailureScreenshot(failureFilePath);
		}
	}


}
