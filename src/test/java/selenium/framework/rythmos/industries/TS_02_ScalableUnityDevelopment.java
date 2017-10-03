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
import selenium.framework.pages.GameDevelopmentPracticePage;

public class TS_02_ScalableUnityDevelopment extends CommonMethods {
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	GameDevelopmentPracticePage scalableunitydevelopmentpage= null;
	
	@BeforeClass
	public void beforeClass(){
		driver= WebDriverManager.getWebDriver();
		System.out.println(className + ":" + driver );
	}
	@Test(priority=0)
	public void TC_01_NavigatingSUDPage() throws InterruptedException {
		String testcaseName = new Object(){
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		GameDevelopmentPracticePage scalableunitydevelopmentpage = new GameDevelopmentPracticePage(driver);
		scalableunitydevelopmentpage.clickOnIndustries();
		Thread.sleep(10000);
		scalableunitydevelopmentpage.clickingOnScalableUnityDevelopment();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/scalable-unity-development";
		String actual = scalableunitydevelopmentpage.getCurrentUrl();
		scalableunitydevelopmentpage.assertText(expected, actual,scalableunitydevelopmentpage.VALIDATE_SUDPage, " Validatin Scalable Unity Development Page Name");
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
