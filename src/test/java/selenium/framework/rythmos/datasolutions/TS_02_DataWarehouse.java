package selenium.framework.rythmos.datasolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		dataSolutionsPage.ClickingOnDataWarehouse();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/data-warehouse";
		String actual = dataSolutionsPage.getCurrentUrl();
		dataSolutionsPage.assertText(expected, actual, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
		Assert.assertEquals(expected, actual, "Validating Data Solutions Failed.");
	}
	@Test(priority = 1)
	public void validateH1OfDataWarehouse() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428851553']/div/h1"));

		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "55px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "100";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "62px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
	}
	@Test(priority = 2)
	public void validateH8OfDWHDesc() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428851553']/div/p/span"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "20px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "30px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
	}
	@Test(priority = 3)
	public void validateH4OfDWHSolution() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1490017783973']/div/h1"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "38px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(240, 89, 38, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "62px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
	}
	@Test(priority = 4)
	public void validateIntroOfDWHSolution() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1490017783973']/div"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
	}
	@Test(priority = 5)
	public void validateAfterParaIntroOfDWHSolution() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath("html/body/div[2]/div/div[3]/div/div/div/div/div"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
	}
	@Test(priority = 6)
	public void validateAboutRythmosOnDWHSolution() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='assessmentform']/div/div/div/div/div/div/div[1]/div/div/div"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "29px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "35px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
	}
	
	@Test(priority = 7)
	public void validateAssessmentOfDWHSolution() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487250617033522']/img"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("font-weight Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("line-height Is "+TextFontFamily+" pixels");
		        String actualLineHgt = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actualLineHgt, dataSolutionsPage.VALIDATE_DWHPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actualLineHgt, "Validating Data Warehouse Line Height Failed.");
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
