package testng1;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test14 {
	@Test
	public void login() {
		System.out.println("Exectinh the login test case");
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods = "login")
	public void search(){
		System.out.println("Executing the search testcase");
		Assert.assertEquals(false, true);
	

}
	@Test(dependsOnMethods = {"login","search"})
	public void addTocart(){
		System.out.println("Executing the search testcase");
		Assert.assertEquals(false, true);
	
	}	 
	
}



