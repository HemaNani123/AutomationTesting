package DDF;

import java.io.FileInputStream;
import java.util.Properties;

public class Notepaddatafetching {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
  FileInputStream fisp=new FileInputStream("C:\\EclipsePrograms\\Selenium\\Commondata.properties");
    Properties p=new Properties();
    p.load(fisp);
    String UN=p.getProperty("un");
    System.out.println(UN);
    String PWD=p.getProperty("pwd");
    System.out.println(PWD);
    String BW=p.getProperty("browser");
    System.out.println(BW);
    String URL=p.getProperty("url");
    System.out.println(URL);
	}

}
