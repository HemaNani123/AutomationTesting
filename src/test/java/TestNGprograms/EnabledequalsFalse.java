package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledequalsFalse {
@Test(priority = 2)
public void logout()
{
	Reporter.log("logout",true);
}
@Test(priority = 1,enabled = false)
public void login()
{
	Reporter.log("login",true);
}
}
