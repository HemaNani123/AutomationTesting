package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it willget the title of web page
     WebDriver driver=new EdgeDriver();
     driver.get("https://www.amazon.com");
     //take the title page
     String tit = driver.getTitle();
     System.out.println(tit);
	}

}

