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
import selenium.framework.pages.GameDevelopmentPracticePage;

public class TS_05_AirlinePractice extends CommonMethods {
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	AirlinePracticePage airlinepractice= null;
	
	@BeforeClass
	public void beforeClass(){
		driver= WebDriverManager.getWebDriver();
		System.out.println(className + ":" + driver );
	}
	@Test(priority=0)
	public void TC_01_NavigatingAPPage() throws InterruptedException {
		String testcaseName = new Object(){
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		AirlinePracticePage airlinepractice = new AirlinePracticePage(driver);
		airlinepractice.clickOnIndustries();
		Thread.sleep(10000);
		airlinepractice.clickingOnAirlinePractice();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/airline-practice";
		String actual = airlinepractice.getCurrentUrl();
		airlinepractice.assertText(expected, actual,airlinepractice.VALIDATE_APPage, "Validating Scalable Unity Development Page Name");
		Assert.assertEquals(expected, actual, "Validating Scalable Unity Developement Practice Failed.");
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
