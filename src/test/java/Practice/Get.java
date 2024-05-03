package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        //get-->to open the application
        driver.get("https://www.ajio.com");
        //close-->to close the application
        driver.close();
	}

}
