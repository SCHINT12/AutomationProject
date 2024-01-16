package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\shiva\\Desktop\\test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("TestData");
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
		for(int i=0;i<rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				String value=row.getCell(j).getStringCellValue();
				System.out.println(value);
				System.out.println("done");
			}
		}

	}

}
