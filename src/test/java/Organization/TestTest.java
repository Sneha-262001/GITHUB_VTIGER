package Organization;

import org.testng.Assert;
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



public class TestTest {
	
//	
//@BeforeSuite
//public void before_suite() {
//	System.out.println("before suite");
//}
//@BeforeTest
//public void before_test() {
//	System.out.println("before test");
//}
//@BeforeMethod
//public void before_method() {
//	System.out.println("before method");
//}
//@BeforeClass
//public void before_class() {
//	System.out.println("before class");
//} 
//@Test
//public void m1(){
//	System.out.println("m1");
//}
//@AfterClass
//public void ac() {
//	System.out.println("after class");
//}
//@AfterMethod
//public void am() {
//	System.out.println("after method");
//}
//@AfterSuite
//public void as() {
//	System.out.println("after suite");
//}
//@AfterTest
//public void at() {
//	System.out.println("after test");
//}
//@Test
//public void m2() {
//	System.out.println("m2");
//}
//@BeforeMethod
//public void bm() {
//	System.out.println("before method 1");
//}
//@AfterMethod
//public void am1() {
//	System.out.println("after method 1");
//}
//}

@Test(groups = "smoke")
public void test_m1() {
	System.out.println("--test_m1--");
	//Assert.fail();
}
@Test(groups="regression")
public void test_m2() {
	System.out.println("--test_m2--");
}

}