package Groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Allgroups {
@Test(priority = 1,groups = "SmokeTest")
public void verifyLink()
{
	Reporter.log("smoketestcase",true);
}
@Test(priority = 3,groups = "FuctionalTest")
public void verifyLogin()
{
	Reporter.log("functionaltestcase",true);
}
@Test(priority = 2,groups = "SmokeTest")
public void verifyLogo()
{
	Reporter.log("smoketestcase",true);
}
@Test(priority = 4,groups = "FuctionalTest")
public void verifyLogout()
{
	Reporter.log("functionaltestcase",true);
}
}
