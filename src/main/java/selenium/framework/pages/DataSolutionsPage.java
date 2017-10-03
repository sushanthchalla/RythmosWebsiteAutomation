package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.framework.common.PageControls;

public class DataSolutionsPage extends PageControls{
	
	/**
	 * Description:This is DataSolutions page constructor. It holds
	 * all the element locators in DataSolutions page
	 * 
	 * @param webDriver
	 */

	public DataSolutionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static final By VALIDATE_DWHPage = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h1");
	public static final By VALIDATE_GDPLPage = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/h1");
	public static final By VALIDATE_DataSolDesc = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/p/span");
	public static final By Solutions_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a");
	public static final By DataSolutions_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/a");
	public static final By DataWarehouse_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[1]/a");
	public static final By Analytics_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[2]/a");
	public static final By CloudSolutions_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[3]/a");
	public static final By DataSupport_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[1]/ul/li[4]/a");
	public static final By DataSolutionsH8_Page = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/p/span");
	public static final By VALIDATE_DataSolutionsDetails = By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/h1");
	
	
	
	/**
	 * MethodName: clickOnSolutions() Description: This method is used to
	 * navigating On Solutions tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnSolutions() throws InterruptedException {

		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//div[2]/ul/li[1]/a"));
		action.moveToElement(menu).perform();
		reportInfo("Clicking on Solutions tab");
	}
	
	/**
	 * MethodName: clickingOnDataSolutions() Description: This method is used
	 * to navigate DataSolutionsPage
	 */
	public void clickingOnDataSolutions() {
		this.click(DataSolutions_Page);
		reportInfo("clicked on Data Solutions link");
	}
	
	public void clickingOnH8DataSolutions(){
		this.click(DataSolutionsH8_Page);
		reportInfo("clicked on Data Solutions H8 text");
	}
	
	public void DataWarehouse() {
		this.click(DataWarehouse_Page);
		reportInfo("clicked on Data Warehouse link");
	}
	
	public void Analytics() {
		this.click(Analytics_Page);
		reportInfo("clicked on Analytics link");
	}
	
	public void CloudSolutions() {
		this.click(CloudSolutions_Page);
		reportInfo("clicked on Cloud Solutions link");
	}
	
	public void DataSupport() {
		this.click(DataSupport_Page);
		reportInfo("clicked on Cloud Solutions link");
	}
	
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	/**
	 * MethodName: assertDataSolutionsName() Description: This method is used to assert
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
