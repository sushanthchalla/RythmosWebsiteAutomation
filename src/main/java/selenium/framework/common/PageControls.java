package selenium.framework.common;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

/**
 * ClassName:PageControls Description:This class extends Reporting
 * 
 * @author Pravin Lokeshwar
 *
 */
public class PageControls extends Reporting {

	/**
	 * Description:This is PageControls constructor. It holds all the element
	 * locators in PageControls
	 */
	protected WebDriver driver;

	public PageControls(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * MethodName:loadUrl() Description:This method used to get the webPage url
	 * 
	 * @param url
	 */
	public void loadUrl(String url) {
		driver.get(url);
	}

	/**
	 * MethodName:loadUrl() Description:This method used to get the current
	 * webPage url
	 * 
	 * @return String
	 */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * MethodName:getPageTitle() Description:This method used to get the page
	 * title
	 * 
	 * @return String
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * MethodName:closeBrowser() Description:This method used to close the
	 * Browser
	 */
	public void closeBrowser() {
		driver.quit();
	}

	/**
	 * MethodName:click() Description:This method used to click on webElement
	 * 
	 * @param by
	 */
	public void click(By by) {

		waitForElement(by).click();

	}

	/**
	 * MethodName:getText() Description:This method used to get the current
	 * webElement text
	 * 
	 * @param by
	 * @return String
	 */
	public String getText(By by) {
		return waitForElement(by).getText();
	}

	/**
	 * MethodName:check() Description:This method used to Check/UnCheck the
	 * CheckBox
	 * 
	 * @param by
	 */
	public void check(By by) {
		if (!driver.findElement(by).isSelected())
			waitForElement(by).click();
	}

	public void uncheck(By by) {
		if (driver.findElement(by).isSelected())
			waitForElement(by).click();
	}

	/**
	 * MethodName:type() Description:This method used to enter text to the input
	 * fields
	 * 
	 * @param by
	 * @param testdata
	 */
	public void type(By by, String testdata) {
		if (by != null) {
			waitForElement(by).sendKeys(testdata);
		} else {
			new Exception(by.toString() + " : is null").toString();
			ReporterTextError(by.toString() + " : is null.");
		}
	}

	public void type(By by, Keys enter) {
		waitForElement(by).sendKeys(enter);
	}

	/**
	 * MethodName:clear() Description:This method used to clear text in the
	 * input fields
	 * 
	 * @param by
	 */
	public void clear(By by) {
		waitForElement(by).clear();
	}

	/**
	 * MethodName:moveToElement() Description:This method used to move the
	 * mouseOver to WebElement
	 * 
	 * @param by
	 */
	public void moveToElement(By by) {
		WebElement e = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.moveToElement(e);
	}

	/**
	 * MethodName:selectDropdown() Description:This method used select the value
	 * from DropDown
	 * 
	 * @param by
	 * @param testData
	 */
	public void selectDropdown(By by, String testData) {
		Select select = new Select(waitForElement(by));
		try {

			select.selectByValue(testData);

		} catch (Exception e) {

			select.selectByVisibleText(testData);
		}
	}

	public String getFirstDropDownValue(By by) {

		int count = 0;
		Select select = new Select(waitForElement(by));
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			count = count + 1;
			if (count == 2) {
				return e.getAttribute("value");
			}
		}
		System.out.println("returning null");
		return null;
	}
	public String getFirstDropDownLabel(By by) {

		int count = 0;
		Select select = new Select(waitForElement(by));
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			count = count + 1;
			if (count == 2) {
				return e.getAttribute("label");
			}
		}
		System.out.println("returning null");
		return null;
	}

	public List<WebElement> getWebElementList(By by) {
		return driver.findElements(by);
	}

	/**
	 * MethodName:pause() Description:This method wait for specified amount of
	 * time
	 * 
	 * @param i
	 * @throws InterruptedException
	 */
	public void pause(int i) {

		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void elementHighlighter(By by) {
		WebElement el = waitForElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int iCnt = 0; iCnt < 10; iCnt++) {
			js.executeScript("arguments[0].style.border='4px groove green'", el);
			js.executeScript("arguments[0].style.border=''", el);
		}
	}

	/**
	 * MethodName:elementScreenshot() Description:This method takes the element
	 * Screenshot
	 * 
	 * @param by
	 * @param fileName
	 * @return String
	 */
	public String elementScreenshot(By by) {
		String fileName = String.valueOf(System.currentTimeMillis());
		String path = "./target/surefire-reports/html/Reports/Screenshot/";

		WebElement el = waitForElement(by);
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='4px groove green'", el);

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File(path + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Failure in taking screenshot.");
			e.printStackTrace();
		}

		return path + fileName + ".png";

	}

	/**
	 * MethodName:driverScreenshot() Description:This method takes the driver
	 * Screenshot
	 * 
	 * @param fileName
	 * @return
	 */
	public String driverScreenshot() {
		String fileName = String.valueOf(System.currentTimeMillis());
		String path = "./target/surefire-reports/html/Reports/Screenshot/";

		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File(path + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Failure in taking screenshot.");
			e.printStackTrace();
		}

		return path + fileName + ".png";

	}

	/**
	 * MethodName:getAttribute() Description:This method get Attribute value
	 * 
	 * @param by
	 * @param attributeType
	 * @return String
	 */
	public String getAttribute(By by, String attributeType) {
		String tmp = "";
		if (attributeType.equalsIgnoreCase("href")) {
			tmp = this.waitForElement(by).getAttribute("href");
		}

		return tmp;

	}

	/**
	 * MethodName:waitForElement() Description:This method wait for required
	 * WebElement
	 * 
	 * @param by
	 * @return WebElement
	 */
	public WebElement waitForElement(By by) {

		try {

			for (int i = 1; i < 51; i++) {
				try {
					this.driver.findElement(by).isDisplayed();
					this.driver.findElement(by).isEnabled();
					return this.driver.findElement(by);
				} catch (Exception e) {
					//e.printStackTrace();
					pause(300);
					
				}
				if (i == 50) {
					
					reportFailureScreenshot(driverScreenshot());
					throw new NoSuchElementException("Element Not Found : " + by);
				}
			}
		} catch (Exception e) {
		
			ReporterTextError(e.getCause().getMessage());
			reportFailureScreenshot(driverScreenshot(), "SCREENSHOT : FAILED");
		
		}
		return null;

	}

	/**
	 * MethodName:waitForPageToLoad() Description:This method wait for page to
	 * Load
	 * 
	 * @param by
	 */
	public void waitForPageToLoad(By by) {
		for (int i = 1; i < 50; i++) {
			try {
				driver.findElement(by).isDisplayed();
				Thread.sleep(200);
				System.out.println("PAGE LOADING..........  " + i);
			} catch (Exception e) {
				break;
			}

		}

	}

	public void waitForPageToLoad(By by, boolean flag) {
		if (flag) {
			for (int i = 1; i < 50; i++) {
				try {
					driver.findElement(by).isDisplayed();
					Thread.sleep(10);
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	
	
}