package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHands {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 
        
        FileInputStream fis = new FileInputStream("C:\\Users\\shiva\\Desktop\\Manual & Automation testing\\Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (Row row : sheet) {
			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC: {
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				}
				case Cell.CELL_TYPE_STRING: {
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				}
				}
			}
			System.out.println();
		}
	}

	}

