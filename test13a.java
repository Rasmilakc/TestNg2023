package testng1;
import org.testng.annotations.Test;


public class test13a {
	@Test(groups={"login"})
	public void Testcase4() {
		System.out.println("login  test1");
	}
	@Test(groups={"regression"})
	public void Testcase5() {
		System.out.println("regression test2");
	}
	@Test(groups={"login"})
	public void Testcase6() {
		System.out.println("login test3");
	

}



}


