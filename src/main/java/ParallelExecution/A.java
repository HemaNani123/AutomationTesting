package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A {
@Test
public void TC1()
{
	WebDriver d=new EdgeDriver();
	d.get("https://www.amazon.com");
}
}
