package testng1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class test16brokenlink {
	

	public class LinkCheckerTest {
	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set the path to your ChromeDriver executable
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com/");
	        // Initialize the WebDriver
	        driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
	    }

	    @Test
	    public void testLinkValidity() {
	        // Navigate to the webpage
	        driver.get("https://example.com");

	        // Get all the links on the page
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total links on the page: " + links.size());

	        // Check each link for validity
	        int brokenLinkCount = 0;
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                if (isLinkBroken(url)) {
	                    System.out.println("Broken link: " + url);
	                    brokenLinkCount++;
	                }
	            }
	        }

	        System.out.println("Number of broken links: " + brokenLinkCount);
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the WebDriver
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    private boolean isLinkBroken(String url) {
	        try {
	            HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
	            connection.setRequestMethod("HEAD");
	            connection.connect();
	            int responseCode = connection.getResponseCode();
	            return (responseCode >= 400);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return true;
	        }
	    }
	}


}
