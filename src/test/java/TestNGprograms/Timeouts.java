package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test(timeOut = 10)
public void  logout()
{
	Reporter.log("logout",true);
}
}
