package Organization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class SampleTest {
//	@Test
//	public void sample_m4() {
//		int []a= {10,20,30};
//		System.out.println(a[4]);
//		System.out.println("---create---");
//	}
//	
//	@Test(invocationCount = 2)//we don't use this now sometimes if script is getting failed to configure which mistake we use invocationCount
//	public void sample_m2() {
//		System.out.println("---edit---");
//	}
//	@Test(dependsOnMethods = "sample_m4",priority = -1)
//	public void sample_m3() {
//		System.out.println("---delete---");
//	}
//	@Test(dependsOnMethods = "sample_m4")
//	public void sample_m1() {
//		System.out.println("---test---");
//	}
//	//default value of priority is 0
//	//default value of invocationCount is 1---to execute multiple times 
//
//}

@Test(groups = "regression")
public void sample_m1() {
	System.out.println("--sample_m1--");
	//Assert.fail();
}


}
