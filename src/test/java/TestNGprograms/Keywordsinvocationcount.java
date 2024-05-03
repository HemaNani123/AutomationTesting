package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywordsinvocationcount{
@Test(invocationCount = 20)
 public void m1()
 {
	Reporter.log("hii",true);
 }
}
