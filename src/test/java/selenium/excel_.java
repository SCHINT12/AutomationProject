package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\shiva\\Desktop\\test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("TestData");
		int lastrow=sheet.getLastRowNum();
		System.out.println(lastrow);
		int firstrow=sheet.getFirstRowNum();
		System.out.println(firstrow);
		int totalrows=lastrow-firstrow+1;
		System.out.println("Total Rows in Excel : "+totalrows);
		XSSFRow row=sheet.getRow(0);
		int lastcol=row.getLastCellNum();
		System.out.println(lastcol);
		int firstcol=row.getFirstCellNum();
		System.out.println(firstcol);
		int totalcol=lastcol-firstcol;
		System.out.println("Column count : "+totalcol);
		
		for(int i=0;i<totalrows;i++)
		{
			XSSFRow roww=sheet.getRow(i);
			for(int j=0;j<roww.getLastCellNum();j++)
			{
				System.out.println(roww.getCell(j).getStringCellValue());
			}
		}
		

	}

}
