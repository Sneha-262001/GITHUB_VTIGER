package Organization;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class DemoTest{
//	public void bsD() {
//		System.out.println("D-bs");
//	}
//	@BeforeTest
//	public void btD() {
//		System.out.println("D-bt");
//	}
//	@BeforeClass
//	public void bcD() {
//		System.out.println("D-bc");
//	}
//	@BeforeMethod
//	public void bmD() {
//		System.out.println("D-bm");
//	}
//	@Test
//	public void m1D() {
//		System.out.println("D-m1");
//	}
//	@AfterMethod
//	public void amD() {
//		System.out.println("D-am");
//	}
//	@AfterTest
//	public void atD() {
//		System.out.println("D-at");
//	}
//	@AfterClass
//	public void acD() {
//		System.out.println("D-ac");
//	}
//	@AfterSuite
//	public void asD() {
//		System.out.println("D-as");
//	} 


@Test(groups = "smoke")
public void demo_m1() {
	System.out.println("--demo_m1--");
	//Assert.fail();
}

@Test(groups = "regression")
public void demo_m2() {
	System.out.println("--demo_m2--");
}
}
