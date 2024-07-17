package Excellsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13ReadFromExcel {
	String fpath ="E:\\javaselenium\\Javaselenium\\excellsheet\\login.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test (enabled = false)
	public void readData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	}
	
	@Test
	public void readAllData()
	{
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
				
		for(int i = 0; i< 6; i++)
		{
			row = sheet.getRow(i);
			for(int j = 0; j < 4; j++)
				
			{
				cell = row.getCell(j);
				System.out.print("\t" + cell.getStringCellValue());
			}
			System.out.println();
		}
	
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("OHRMLogin");
		
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}