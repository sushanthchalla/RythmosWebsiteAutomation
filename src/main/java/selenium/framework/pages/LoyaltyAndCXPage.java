package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.framework.common.PageControls;

public class LoyaltyAndCXPage extends PageControls{
	/**
	 * Description:This is LoyaltyAndCX page constructor. It holds
	 * all the element locators in LoyaltyAndCX page
	 * 
	 * @param webDriver
	 */

	public LoyaltyAndCXPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static final By Solutions_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a");
	public static final By LoyaltyAndCX_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[4]/a");
	
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
	 * MethodName: clickingOnLoyaltyAndCX() Description: This method is used
	 * to navigate LoyaltyAndCXpage
	 */
	public void clickingOnLoyaltyAndCX() {
		this.click(LoyaltyAndCX_Page);
		reportInfo("clicked on LoyaltyAndCX link");
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
