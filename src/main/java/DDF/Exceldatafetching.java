package DDF;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldatafetching {
public static void main(String[] args) throws Exception {
	FileInputStream fise=new FileInputStream("C:\\EclipsePrograms\\Selenium\\src\\test\\resources\\TESTDATA.xlsx");
	boolean data=WorkbookFactory.create(fise).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	System.out.println(data);
}
}
