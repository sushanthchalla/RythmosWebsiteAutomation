package selenium.framework.rythmos.industries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.GameDevelopmentPracticePage;

public class TS_03_GameQAandTestAutomation extends CommonMethods {
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	GameDevelopmentPracticePage gameqatestautomationpage = null;
	
	@BeforeClass
	public void beforeClass(){
	driver = WebDriverManager.getWebDriver();
	System.out.println(className + ":" + driver);
	}
	
	@Test(priority=0)
	public void TC_01_NavigatingGQATAPage() throws InterruptedException{
		String testcaseName = new Object(){
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("ExecutingTestCase :" + testcaseName);
		GameDevelopmentPracticePage gameqaandtestautomationpage = new GameDevelopmentPracticePage(driver);
		gameqaandtestautomationpage.clickOnIndustries();
		Thread.sleep(1000);
		gameqaandtestautomationpage.clickingOnGameQAandTestAutomation();
		Thread.sleep(1000);
		String expected ="http://www.rythmos.com/game-qa-and-test-automation";
		String actual= gameqaandtestautomationpage.getCurrentUrl();
		gameqaandtestautomationpage.assertText(expected,actual,gameqaandtestautomationpage.VALIDATE_GQATAPage,"Validating Game QA and Test Automation Page Name");		
		Assert.assertEquals(expected,actual,"Validating Game QA and Test Automation Page Failed.");
		
	}
	@AfterClass(alwaysRun=true)
	public void afterClass(){
		closeBrowser();
	}
	@BeforeMethod
	public void beforeMethod(){
		
	}
    @AfterMethod
    public void afterMethod(){
    	
    }
}
