package TestNGprograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	@Test
	public void login1() {
		Reporter.log("Hi Good Morning", true);
	}
	@Test
	public void login2() {
		Reporter.log("Heloo", true);
	}
	@Test
	public void logout() {
		String s1="Hii";
		String s2="Hello";
		Assert.assertEquals(s1, s2,"Both are not matching");
		System.out.println("TC is pass");
	}

}
