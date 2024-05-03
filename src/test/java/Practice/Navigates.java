package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigates {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    WebDriver driver=new EdgeDriver();
    driver.navigate().to("https://www.ChromeDriver.com");
    Thread.sleep(2000);
    driver.navigate().to("https://www.ajio.com");
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
    //refresh the page
    driver.navigate().refresh();
    		
    
	}

}
