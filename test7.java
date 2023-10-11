package testng1;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test7 {
	//assert in testNg
		//soft assertion and hard assertion
		WebDriver driver;
		@BeforeMethod
		public void BeforeMethod() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/"); 

	}
		
		@Test
		public void TestCaseone() {
			// WebDriverUniversity.com
					//assertEquals(expected,actual)
					//assertNotEquals(expected,actual)
					//assertTrue(condition)
					//assertFalse(condition)
					
					// API 
					//assertNull(object)
					//assertNotNull(Object)
			 String actualTitle=driver.getTitle(); 
			 String expectedTitle="WebDriverUniversity.com";
			 assertEquals(actualTitle,expectedTitle);
			 
			 
			// WebDriver | Contact Us
				WebElement contactus = driver.findElement(By.cssSelector("#contact-us"));
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].removeAttribute('target')", contactus);
				contactus.click();
				actualTitle  = driver.getTitle();
				assertNotEquals(actualTitle,expectedTitle);
			  
			 
			
		}
		@Test
		public void TestcaseTwo() {
			// webdriver university
			String currentUrl = driver.getCurrentUrl();
			boolean avail = currentUrl.contains("university");
			assertTrue(avail);
			// google 
			driver.get("https://www.google.com");
			avail = driver.getCurrentUrl().contains("university");
			assertFalse(avail);
			
		}
			
		@AfterMethod
		public void AfterMethod() {
			driver.close();
		}

			
		
}

	