package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellllllllll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fwpath=System.getProperty("user.dir");
		System.out.println(fwpath);
		String path=fwpath+"/src/test/Resources/test.xlsx";
		System.out.println(path);
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("TestData");
		int rows=sheet.getLastRowNum()+1;
		//XSSFRow row=sheet.getRow(4);
//		XSSFCell cell=row.getCell(3);
//		String value=cell.getStringCellValue();
		String value=sheet.getRow(4).getCell(3).getStringCellValue();
		
		System.out.println(value);
		

	}

}
