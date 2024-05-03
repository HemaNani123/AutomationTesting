package TestNGprograms;

import org.openqa.selenium.bidi.log.Log;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class Priority {
@Test(priority = 3)
public void logout()
{
	Reporter.log("logout",true);
}
@Test(priority = 1)
 public void register()
 {
	Reporter.log("register",true);
 }
@Test(priority = 2)
public void login()
{
	Reporter.log("login",true);
}
}
