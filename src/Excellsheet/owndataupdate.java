package Excellsheet;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class owndataupdate {
	
	String fpath ="E:\\javaselenium\\Javaselenium\\excellsheet\\login1.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i = 1;
	
	
	@Test(dataProvider = "getLogin")
	public void createLoginData(String un,String tn, String ps) {
		row = sheet.createRow(i);
		cell = row.createCell(1);
		cell.setCellValue(ps);
		
		cell = row.createCell(5);
		cell.setCellValue(un);
		
		cell = row.createCell(6);
		cell.setCellValue(tn);
		
		cell = row.createCell(7);
		cell.setCellValue("Not Run");
		
		i++;
	}

	@DataProvider
	public Object[][] getLogin() {
		return new Object[][] {
			new Object[] { "admin" , "admin123" ,"login"},
			new Object[] { "kiran" , "kiran123" , "login"},
			new Object[] { "anitha" , "anitha123" ,"login"},
			new Object[] { "admin" , "admin123" ,"login"},
		};
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("login1");
		
		sheet.createRow(0).createCell(1).setCellValue("User Name");
		sheet.getRow(0).createCell(5).setCellValue("Password");
		sheet.getRow(0).createCell(6).setCellValue("succes");
		sheet.getRow(0).createCell(7).setCellValue("Result");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}
}
