package selenium.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.framework.common.PageControls;

public class IntegrationSolutionsPage extends PageControls{
	
	/**
	 * Description:This is Integration Solutions page constructor. It holds
	 * all the element locators in Integration Solutions page
	 * 
	 * @param webDriver
	 */

	public IntegrationSolutionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static final By Solutions_Page = By.xpath("//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/a");
	public static final By IntegrationSolutions_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/a");
	public static final By Microservices_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/ul/li[1]/a");
	public static final By SabreIX_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/ul/li[2]/a");
	public static final By APIs_Page = By.xpath(".//*[@id='hs_menu_wrapper_module_13884994340213']/ul/li[1]/ul/li[2]/ul/li[3]/a");
	
	
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
	 * MethodName: clickingOnIntegrationSolutions() Description: This method is used
	 * to navigate IntegrationSolutionspage
	 */
	public void clickingOnIntegrationSolutions() {
		this.click(IntegrationSolutions_Page);
		reportInfo("clicked on Integration Solutions link");
	}
	/**
	 * MethodName: clickingOnMicroservices() Description: This method is used
	 * to navigate Microservicespage
	 */
	public void clickingOnMicroservices() {
		this.click(Microservices_Page);
		reportInfo("clicked on Microservices link");
	}
	/**
	 * MethodName: clickingOnSabreIX() Description: This method is used
	 * to navigate SabreIXpage
	 */
	public void clickingOnSabreIX() {
		this.click(SabreIX_Page);
		reportInfo("clicked on Sabre IX link");
	}

	/**
	 * MethodName: clickingOnAPIs() Description: This method is used
	 * to navigate APIspage
	 */
	public void clickingAPIs() {
		this.click(APIs_Page);
		reportInfo("clicked on APIs link");
	}

}
