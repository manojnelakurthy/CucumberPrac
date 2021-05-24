package constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public HashMap<String, List<String>> data1 = null;
	public ExcelData() {
		read();
	}
public HashMap<String, List<String>> read() {
	FileInputStream fi=null;
	XSSFWorkbook wb=null;
	
	try{
	fi=new FileInputStream("E:\\WorkSpace\\Cucumber\\XLDATA\\xldata.xlsx");
	wb=new XSSFWorkbook(fi);
	Sheet s=wb.getSheet("WebElement");
	int rowcount=s.getLastRowNum();
	 data1=new HashMap<String,List<String>>();
	for(int i=0;i<=rowcount;i++){
		
		String key=s.getRow(i).getCell(0).getStringCellValue();
		List<String> value=new ArrayList<String>();
		for(int j=1;j<=2;j++){
		value.add(s.getRow(i).getCell(j).getStringCellValue());
				data1.put(key, value);
	}
		
}
	System.out.println(data1);
	}catch(Exception e){
		
	}finally{
		try {
			wb.close();
			fi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	return data1;
}
public static void main(String[] args) {
	ExcelData data=new ExcelData();
			try {
				data.read();
				
			}catch (Exception e) {
			
				e.printStackTrace();
			} 
}
}