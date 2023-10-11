package testng1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class test8 {
	// Hard assertion and Soft assertion
	
			WebDriver driver;
			@Test
			public void  testCaseOne() {
				// Hardassertion
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\chromedriver\\\\chromedriver.exe");
				 driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com");
				// verify title 
				String actualtitle = driver.getTitle();
				Assert.assertEquals(actualtitle, "WebDriverUniversity.com");
				// verify url
				boolean avail = driver.getCurrentUrl().contains("more");
				Assert.assertTrue(avail);
				// verify element displayed
				boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
				Assert.assertTrue(avail2);
				driver.close();
			}
			
			@Test
			public void  testCaseTwo() {
				// Soft assertion		
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\chromedriver\\\\chromedriver.exe");
				 driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com");
				SoftAssert  ss  = new SoftAssert ();
				// verify title 
				String actualtitle = driver.getTitle();
				ss.assertEquals(actualtitle, "WebDriverUniversity.com");
				// verify url
				boolean avail = driver.getCurrentUrl().contains("more");
				ss.assertTrue(avail);
				// verify element displayed
				boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
				ss.assertTrue(avail2);
				
				driver.close();
				
				ss.assertAll(); 
				
				// fail - any assertion is fail
				// pass - if any assertion is pass
				
			}


			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}



