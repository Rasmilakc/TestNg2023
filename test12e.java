package testng1;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore

public class test12e {
	@Test(priority=1)
	public void  Testthree() {
		System.out.println("Test case three pass");
	}
	@Test(priority=2)
	public void  Testfour() {
		System.out.println("Test case four pass");
	}
	@Test(priority=3,enabled=false)
	public void  Testfive() {
		System.out.println("Test case five pass");
	}


}



