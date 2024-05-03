package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Byclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver d=new EdgeDriver();
      d.get("https://www.ajio.com");
      //write expression for Email ID
      d.findElement(By.id("email")).sendKeys("XYZ@ABC.com");
      //write expression for password
      d.findElement(By.id("pass")).sendKeys("123456");
	}

}
