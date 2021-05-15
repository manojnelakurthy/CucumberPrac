package constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {


public HashMap<String, String> read() throws IOException{
	FileInputStream fi=new FileInputStream("E:\\WorkSpace\\Cucumber\\XLDATA\\DATA.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	Sheet s=wb.getSheet("WebElement");
	int rowcount=s.getLastRowNum();
	HashMap<String, String> data1=new HashMap<String,String>();
	for(int i=0;i<=rowcount;i++){
		
		String key=s.getRow(i).getCell(0).getStringCellValue();
		String value=s.getRow(i).getCell(1).getStringCellValue();
		data1.put(key, value);
	}
	wb.close();
	fi.close();
	return data1;
}
}