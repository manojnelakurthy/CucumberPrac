package constants;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

public HashMap<String, List<String>> read() throws Exception {
	FileInputStream fi=null;
	XSSFWorkbook wb=null;
	HashMap<String, List<String>> data1 = null;
	try{
	fi=new FileInputStream("E:\\WorkSpace\\Cucumber\\XLDATA\\DATA.xlsx");
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
	
	}catch(Exception e){
		
	}finally{
		wb.close();
		fi.close();
	}
	return data1;
}
/*public static void main(String[] args) throws Exception {
	
	ExcelData data=new ExcelData();
			try {
				data.read();
			} catch (IOException e) {
			
				e.printStackTrace();
			} 
}*/
}