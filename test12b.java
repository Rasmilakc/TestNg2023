package testng1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test12b {
	@Parameters({"browser","username","password","domain"})
	@Test
	public void Testcasefour(String bw,String un,String pwd,String dm) {
		System.out.println("test case four pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(dm);
		
		
	}
	@Test
	public void Testcasefive() {
		System.out.println("test case five pass");
	}
	@Test
	public void Testcasesix() {
		System.out.println("test case six pass");
	}

}




