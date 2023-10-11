package testng1;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test12c {
	@Parameters({"browser"})
	@Test
	public void Testcasefour(@Optional("chromeC")String bw) {
		System.out.println("test case four pass");
		System.out.println(bw);

}

}
