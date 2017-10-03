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

public class TS_04_GameBackendDevelopment extends CommonMethods {
	String className = this.getClass().getSimpleName();
	WebDriver driver;
	GameDevelopmentPracticePage gamebackenddevelopmentpage = null;
	
	@BeforeClass
	public void beforeClass(){
		driver = WebDriverManager.getWebDriver();
		System.out.println(className + ":" + driver);
		}
    @Test(priority=0)
    public void TC_01_navigatingGBDPage() throws InterruptedException{
    String testcaseName = new Object(){
    }.getClass().getEnclosingMethod().getName();
      ReporterTextBold("ExecutingTestCase:" + testcaseName);
      GameDevelopmentPracticePage gamebackenddevelopmentpage = new GameDevelopmentPracticePage(driver);
      gamebackenddevelopmentpage.clickOnIndustries();
      Thread.sleep(10000);
      gamebackenddevelopmentpage.clickingOnGameBackendDevelopment();
      Thread.sleep(10000);
      String expected ="http://www.rythmos.com/game-back-end-development";
      String actual = gamebackenddevelopmentpage.getCurrentUrl();
      gamebackenddevelopmentpage.assertText(expected, actual, gamebackenddevelopmentpage.VALIDATE_GBDPage, "Validating Game Backend Development Page Name");
      Assert.assertEquals(expected,actual,"Validating Game Backend Development Page is Failed");
          
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
}}
