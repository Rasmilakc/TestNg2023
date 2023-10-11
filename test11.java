package testng1;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test
;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	
	public class test11 {
	    private WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com");
	    }

	    @Parameters({"username", "password"})
	    @Test
	    public void TestCase1(String un, String pwd) {
	        System.out.println("Test case one");
	        driver.findElement(By.id("user-name")).sendKeys(un);
	        driver.findElement(By.id("password")).sendKeys(pwd);
	        driver.findElement(By.id("login-button")).click();
	        boolean avail = driver.getCurrentUrl().contains("inventory");
	        Assert.assertTrue(avail);
	    }

	    @Parameters({"username", "password"})
	    @Test
	    public void TestCase2(String un, String pwd) {
	        System.out.println("Test case two");
	        driver.findElement(By.id("user-name")).sendKeys(un);
	        driver.findElement(By.id("password")).sendKeys(pwd);
	        driver.findElement(By.id("login-button")).click();
	        boolean avail = driver.getCurrentUrl().contains("inventory");
	        Assert.assertTrue(avail);
	    }

	    @Parameters({"username", "password"})
	    @Test
	    public void TestCase3(String un, String pwd) {
	        System.out.println("Test case three");
	        driver.findElement(By.id("user-name")).sendKeys(un);
	        driver.findElement(By.id("password")).sendKeys(pwd);
	        driver.findElement(By.id("login-button")).click();
	        boolean avail = driver.getCurrentUrl().contains("inventory");
	        Assert.assertTrue(avail);
	    }

	    @Parameters({"username", "password"})
	    @Test
	    public void TestCase4(String un, String pwd) {
	        System.out.println("Test case four");
	        driver.findElement(By.id("user-name")).sendKeys(un);
	        driver.findElement(By.id("password")).sendKeys(pwd);
	        driver.findElement(By.id("login-button")).click();
	        boolean avail = driver.getCurrentUrl().contains("inventory");
	        Assert.assertTrue(avail);
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.close();
	    }
	}
