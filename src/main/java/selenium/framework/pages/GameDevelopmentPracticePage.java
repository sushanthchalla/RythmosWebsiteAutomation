package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import selenium.framework.common.PageControls;

public class GameDevelopmentPracticePage extends PageControls {

	/**
	 * Description:This is GameDevelopmentPractice page constructor. It holds
	 * all the element locators in GameDevelopmentPractice page
	 * 
	 * @param webDriver
	 */
	public GameDevelopmentPracticePage(WebDriver driver) {
		super(driver);

	}

	public static final By Industries_link = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/a");
	public static final By GameDevelopmentPractice_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[2]/a");
	public static final By VALIDATE_GDPLPage = By.xpath("//*[@id='hs_cos_wrapper_module_1487261916561740']/div/div[2]/div[1]/div/h1");
	public static final By ScalableUnityDevelopment_Page = By .xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[2]/ul/li[1]/a");
	public static final By VALIDATE_SUDPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h2");
	public static final By GameQAandTestAutomation_Page = By .xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[2]/ul/li[2]/a");
	public static final By VALIDATE_GQATAPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h2");
	public static final By GameBackendDevelopment_Page = By .xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[2]/ul/li[2]/ul/li[3]/a");
	public static final By VALIDATE_GBDPage = By.xpath("//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h2");
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
	 * MethodName: clickingOnGameDevelopment() Description: This method is used
	 * to navigate GameDevelopmentpage
	 */
	public void clickingOnGameDevelopment() {
		this.click(GameDevelopmentPractice_Page);
		reportInfo("clicked on GameDevelopment link");
	}
	/**
	 * MethodName: clickingOnScalableUnityDevelopment() Description: This method is used
	 * to navigate ScalableUnityDevelopmentpage
	 */
	public void clickingOnScalableUnityDevelopment() {
		this.click(ScalableUnityDevelopment_Page);
		reportInfo("clicked on ScalableUnityDevelopment link");
	}
	/**
	 * MethodName: clickingOnGameQAandTestAutomation() Description: This method is used
	 * to navigate GameQAandTestAutomationpage
	 */
	public void clickingOnGameQAandTestAutomation() {
		this.click(GameQAandTestAutomation_Page);
		reportInfo("clicked on Game QA and Test Automation link");
	}
	/**
	 * MethodName: clickingOnGameBackendDevelopment() Description: This method is used
	 * to navigate GameBackendDevelopmentpage
	 */
	public void clickingOnGameBackendDevelopment() {
		this.click(GameBackendDevelopment_Page);
		reportInfo("clicked on Game Backend Development link");
	}
	
	
	public String getText(By by,String testData){
		reportInfo(testData);
		return this.getText(by);
	}
	/**
	 * MethodName: assertGDPLName() Description: This method is used to assert
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