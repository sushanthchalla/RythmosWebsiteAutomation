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

public class TS_01_DataSolutions extends CommonMethods{
	String className = this.getClass().getSimpleName();
	 WebDriver driver;
	DataSolutionsPage dataSolutionsPage = null;
	
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
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		dataSolutionsPage.clickOnSolutions();
		Thread.sleep(10000);
		dataSolutionsPage.clickingOnDataSolutions();
		Thread.sleep(10000);
		String expected = "http://www.rythmos.com/data-solutions";
		String actual = dataSolutionsPage.getCurrentUrl();
		dataSolutionsPage.assertText(expected, actual, dataSolutionsPage.VALIDATE_GDPLPage, "Validating Data Solutions NAME");
		Assert.assertEquals(expected, actual, "Validating Data Solutions Failed.");
	}
	@Test(priority = 1)
	public void validateH2OfDataSolutions() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/h1"));

		        //Get width of element.
		        dataSolutionsPage.clickingOnH8DataSolutions();
				Thread.sleep(10000);
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "55px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_GDPLPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_GDPLPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "100";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_GDPLPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");	 
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_GDPLPage, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
			
	}
	@Test(priority = 2)
	public void validateH8SummaryDataSolutions() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_widget_1491428745026']/div/p/span"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text).perform();
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "24px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolDesc, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions size Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolDesc, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolDesc, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolDesc, "Validating Data Solutions NAME");
		        Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }

	@Test(priority = 3)
	public void validateH8OfDataOverview() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487260765840671']/p"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "30px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "40px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(78, 87, 87, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	@Test(priority = 4)
	public void validateH5OfDWH() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585484893766']/div/div[1]/h4/a"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "23px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DWH_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "26px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DWH_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(240, 90, 40, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DWH_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DWH_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DWH_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 5)
	public void validateH5OfAnalytics() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585491508769']/div/div[1]/h4/a"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "23px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_ANALYTICS_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "26px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_ANALYTICS_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(240, 90, 40, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_ANALYTICS_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_ANALYTICS_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_ANALYTICS_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 6)
	public void validateH5OfCloud() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585488830768']/div/div[1]/h4/a"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "23px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_CLOUD_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "26px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_CLOUD_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(240, 90, 40, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_CLOUD_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_CLOUD_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_CLOUD_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 7)
	public void validateH5OfSupport() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489585492644770']/div/div[1]/h4/a"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "23px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_SUPPORT_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "26px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_SUPPORT_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(240, 90, 40, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_SUPPORT_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_SUPPORT_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_SUPPORT_IMAGE, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 8)
	public void validateH54OfToolExpertise() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14871953872791097']/h3/span"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "25px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "35px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(241, 89, 50, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 9)
	public void validateIntroOfToolExpertise() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14871953872791097']/div/span"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "20px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 10)
	public void validateGetHelpToday() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14871958508831107']/a"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "29px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(240, 90, 40, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 11)
	public void validateH3PlatFormExpertise() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489596871484925']/h3/span"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "25px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "35px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(241, 89, 50, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 12)
	public void validatePlatFormExpertise() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14895986248231017']/div/div[1]"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "normal";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	@Test(priority = 13)
	public void validateCloudDWH() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14895986248231017']/div/div[2]"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "16px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextBgColor = Text.getCssValue("background-color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actualcolor = "rgba(78, 78, 78, 0.498039)";
		        dataSolutionsPage.assertText(TextBgColor, actualcolor, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextBgColor, actualcolor, "Validating Cloud DWH Background color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "normal";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	@Test(priority = 14)
	public void validateOnPremiseDWH() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_14895986248231017']/div/div[3]"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("background-color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(48, 48, 48, 0.6)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "normal";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 15)
	public void validateAboutRythmos() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487256899243559']/span"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "30px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "35px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 
	}
	@Test(priority = 16)
	public void validateVisualization() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1487190735025523']/div/div[2]"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(255, 255, 255, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextBgColor = Text.getCssValue("background-color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actualcolor = "rgba(78, 78, 78, 0.8)";
		        dataSolutionsPage.assertText(TextBgColor, actualcolor, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextBgColor, actualcolor, "Validating Cloud DWH Background color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
		 }
	
	@Test(priority = 17)
	public void validateEtlAndDataPrep() throws InterruptedException {
		String testcaseName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		ReporterTextBold("Executing Test Case : " + testcaseName);
	
		DataSolutionsPage dataSolutionsPage=new DataSolutionsPage(driver);
		  //Locate element for which you wants to get height and width.
		        WebElement Text = driver.findElement(By.xpath(".//*[@id='hs_cos_wrapper_module_1489590650417896']/div/div[1]/img"));
		        Actions action = new Actions(driver);
		        action.moveToElement(Text);
		        ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].scrollIntoView();", Text);
		        //Get width of element.
		        String TextFontSize = Text.getCssValue("font-size");
		        System.out.println("Text size Is "+TextFontSize+" pixels");
		        String actual1 = "14px";
		        dataSolutionsPage.assertText(TextFontSize, actual1, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontSize, actual1, "Validating Data Solutions font size Failed.");
				String TextLineHeight = Text.getCssValue("line-height");
		        System.out.println("Text size Is "+TextLineHeight+" pixels");
		        String actual5 = "23px";
		        dataSolutionsPage.assertText(TextLineHeight, actual5, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextLineHeight, actual5, "Validating Data Solutions linne height Failed.");
				String TextFontColor = Text.getCssValue("color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actual2 = "rgba(121, 121, 121, 1)";
		        dataSolutionsPage.assertText(TextFontColor, actual2, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontColor, actual2, "Validating Data Solutions color Failed.");
				String TextBgColor = Text.getCssValue("background-color");
		        System.out.println("Text color Is "+TextFontColor+" pixels");
		        String actualcolor = "rgba(78, 78, 78, 0.8)";
		        dataSolutionsPage.assertText(TextBgColor, actualcolor, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextBgColor, actualcolor, "Validating Cloud DWH Background color Failed.");
				String TextFontFamily = Text.getCssValue("font-family");
		        System.out.println("Font family Is "+TextFontFamily+" pixels");
		        String actual3 = "Lato, sans-serif";
		        dataSolutionsPage.assertText(TextFontFamily, actual3, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontFamily, actual3, "Validating Data Solutions color Failed.");
				String TextFontWeight = Text.getCssValue("font-weight");
		        System.out.println("Font family Is "+TextFontWeight+" pixels");
		        String actual4 = "300";
		        dataSolutionsPage.assertText(TextFontWeight, actual4, dataSolutionsPage.VALIDATE_DataSolutionsDetails, "Validating Data Solutions NAME");
				Assert.assertEquals(TextFontWeight, actual4, "Validating Data Solutions font weight Failed.");
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
