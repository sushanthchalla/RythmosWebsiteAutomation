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

public class TS_01_GameDevelopmentPractice extends CommonMethods {
	String className = this.getClass().getSimpleName();
	 WebDriver driver;
	GameDevelopmentPracticePage gamedevelopmentPage = null;
	
	@BeforeClass
	public void beforeClass() {
		driver = WebDriverManager.getWebDriver();
		System.out.println(className + " : " + driver);

	}
	@Test(priority = 0)
	public void TC_01_NavigatingtoGDPLpage() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		GameDevelopmentPracticePage gamedevelopmentPage=new GameDevelopmentPracticePage(driver);
		gamedevelopmentPage.clickOnIndustries();
		Thread.sleep(10000);
		gamedevelopmentPage.clickingOnGameDevelopment();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/game-development-practice";
		String actual = gamedevelopmentPage.getCurrentUrl();
		gamedevelopmentPage.assertText(expected, actual, gamedevelopmentPage.VALIDATE_GDPLPage, "Validating Game Developement Practice NAME");
		Assert.assertEquals(expected, actual, "Validating Game Developement Practice Failed.");
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
