package TestNGprograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
@Test(dependsOnMethods = "login")
public void logout() {
	Reporter.log("logout",true);
}
@Test
public void login()
{
	Reporter.log("login",true);
	Assert.fail();
}
}
