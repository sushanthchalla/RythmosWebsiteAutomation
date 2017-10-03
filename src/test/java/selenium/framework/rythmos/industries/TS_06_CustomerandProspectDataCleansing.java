package selenium.framework.rythmos.industries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.AirlinePracticePage;

public class TS_06_CustomerandProspectDataCleansing extends CommonMethods {
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	AirlinePracticePage customerandprospectdatacleansing= null;
	
	@BeforeClass
	public void beforeClass(){
		driver= WebDriverManager.getWebDriver();
		System.out.println(className + ":" + driver );
	}
	@Test(priority=0)
	public void TC_06_NavigatingCPDCPage() throws InterruptedException {
		String testcaseName = new Object(){
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		AirlinePracticePage customerandprospectdatacleansing = new AirlinePracticePage(driver);
		customerandprospectdatacleansing.clickOnIndustries();
		Thread.sleep(10000);
		customerandprospectdatacleansing.CustomerandProspectDataCleansing();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/airline-prospect-data-cleansing";
		String actual = customerandprospectdatacleansing.getCurrentUrl();
		customerandprospectdatacleansing.assertText(expected, actual,customerandprospectdatacleansing.VALIDATE_CPDCPage, "Validating Customer Prospect and Data Cleansing Page Name");
		Assert.assertEquals(expected, actual, "Validating Customer Prospect and Data Cleansing Failed.");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowser();
	}

	@BeforeMethod
	public void beforeMethod() {
		
	}

	@AfterMethod
	public void afterMethod() {

	}
}

