package testng1;
import org.testng.annotations.Test;


public class test12d {
	@Test(priority=1)
	public void  Testone() {
		System.out.println("Test case one pass");
	}
	@Test(priority=2)
	public void  Testtwo() {
		System.out.println("Test case two pass");
	}
	@Test(priority=3,enabled=false)
	public void  Testthree() {
		System.out.println("Test case three pass");
	}

}


