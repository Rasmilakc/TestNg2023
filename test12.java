package testng1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test12 {
	
		@Parameters({"browser","username","password"})
		@Test
		public void Testcaseone(String bw,String un,String pwd) {
			System.out.println("test case one pass");
			System.out.println(bw);
			System.out.println(un);
			System.out.println(pwd);
			
		}
		@Test
		public void Testcasetwo() {
			System.out.println("test case two pass");
		}
		@Test
		public void Testcasethree() {
			System.out.println("test case three pass");
		}

	}


