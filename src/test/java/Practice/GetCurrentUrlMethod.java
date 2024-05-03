package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // it will get the title of web page
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		//get the current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}
