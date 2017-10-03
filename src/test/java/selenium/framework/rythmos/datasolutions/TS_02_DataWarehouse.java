package selenium.framework.rythmos.datasolutions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.framework.common.CommonMethods;
import selenium.framework.common.WebDriverManager;
import selenium.framework.pages.DataSolutionsPage;

public class TS_02_DataWarehouse extends CommonMethods{
	String className = this.getClass().getSimpleName();
	 WebDriver driver;
	DataSolutionsPage dataSolutionsPage = null;
	
	@BeforeClass
	public void beforeClass() {
		driver = WebDriverManager.getWebDriver();
		System.out.println(className + " : " + driver);

	}
	@Test(priority = 0)
	public void TC_02_NavigatingtoGDPLpage() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		dataSolutionsPage.clickOnSolutions();
		Thread.sleep(10000);
		dataSolutionsPage.DataWarehouse();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/data-warehouse";
		String actual = dataSolutionsPage.getCurrentUrl();
		dataSolutionsPage.assertText(expected, actual, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
		Assert.assertEquals(expected, actual, "Validating Data Solutions Failed.");
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
