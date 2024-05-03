package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class B {
@Test
public void TC2()
{
	WebDriver d=new EdgeDriver();
	d.get("https://www.google.com");
}
}
