package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args ) throws Throwable {
		// TODO Auto-generated method stub
      WebDriver driver=new EdgeDriver();
      driver.get("//https:www.amazon.com");
        //typecasting
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        //create obj of file class and give path of scshot folder
        File dest=new File("C:\\Users\\hemap\\Desktop\\Screenshot\\AMAZON.png");
        //copy
        Files.copy(src, dest);
	}
}
        

