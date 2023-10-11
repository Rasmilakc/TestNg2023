package testng1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class test6 {
WebDriver driver;
	
	@Test
	public void TestCase1() {
		
		//Javascript executor to click on element
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\chromedriver\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.webdriveruniversity.com/"); 
		 //driver.findElement(By.id("contact-us")).click();  
		  WebElement contatcUsLink  = driver.findElement(By.id("contact-us")); 
		  JavascriptExecutor je = (JavascriptExecutor) driver; 
		  je.executeScript("arguments[0].click()",contatcUsLink );  
			driver.close(); 
			   
			    
	}	
	
	//scroll element
	
	@Test()
	public void TestCase2() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\chromedriver\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		// driver.findElement(By.id("contact-us")).click();
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)", scrollElement);
		Thread.sleep(5000);
		driver.close();
	}
	@Test()
	public void TestCase3() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\chromedriver\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		// driver.findElement(By.id("contact-us")).click();
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('data-cy','two')", scrollElement);
		// je.executeScript("arguments[0].removeAttribute('data-cy')", scrollElement);
		String attributeValue = scrollElement.getAttribute("data-cy");// two
		System.out.println(attributeValue);
		 driver.close();
	}
	@Test
	public void TestCase4() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\chromedriver\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		// driver.findElement(By.id("contact-us")).click();
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String title = (String) je.executeScript("return document.title;");
		
		// First parameter of JavascriptExecutor is script
		Assert.assertEquals(title, "WebDriverUniversity.com");
		driver.close();
	}
	
	
	@Test
	 public void TestCase5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement e = driver.findElement(By.id("double-click"));
		ac.doubleClick(e).build().perform();
		String className = e.getAttribute("class");
		Assert.assertEquals(className, "div-double-click double");
		driver.close();
	}
	
	
	
	@Test
	public void testcase6() throws InterruptedException {
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	   WebElement draggable = driver.findElement(By.id("draggable"));
	   WebElement droppable = driver.findElement(By.id("droppable"));
	   ac.dragAndDrop(draggable, droppable).build().perform();
	   Assert.assertEquals(droppable.getText(), "Dropped!");
	   driver.close();
	
		
	}
	
	      //click and hold
	@Test
	public void TestCase7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement clickable=driver.findElement(By.id("click-box"));
		ac.clickAndHold(clickable).build().perform();
		Assert.assertEquals(clickable.getText(), "Well done! keep holding that click now.....");
		driver.close();
	


	}	
	@Test
	public void TestCase8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement e=driver.findElement(By.cssSelector("#double-click"));
		ac.contextClick(e).build().perform();
		Thread.sleep(5000);
		driver.close();
	
	
	}	
	@Test
	public void TestCase9() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement e=driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		ac.moveToElement(e).build().perform();
		WebElement e2=driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div"));
		Assert.assertEquals(true, e2.isDisplayed());
		driver.close();
		
	
	}	
	
		
	 
		

	

	}



