package testng1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test15 {
	WebDriver driver;
	@Test
	public void TestcaseOne() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.id("contact-us")).click();
		Set<String>handles=driver.getWindowHandles();
		boolean windowfound=false;
		for (String wd:handles) {
			driver.switchTo().window(wd);
			if(driver.getCurrentUrl().contains("Contact-Us")) {
				windowfound=true;
			}
			
			}
		Assert.assertTrue(windowfound);
		
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		//capturing the screen shot
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		String path="C:\\JAVA\\testng\\img.png";
		File destination=new File(path);
		try {
			FileUtils.copyFile(src,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		}
		
		
	}


