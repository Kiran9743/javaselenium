package finaltestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class NewTest {
	String fpath = System.setProperty("user.dir", "\\Excelsheet\\login.xlsx");
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeData() {
	row = sheet.createRow(0);				//Create 1st row inside the sheet
	cell = row.createCell(0);				//Create 1st cell inside 1st row
	
	cell.setCellValue("Adika"); 			//Put the data inside the cell
	
	//row = sheet.createRow(0);
	cell = row.createCell(1);
	
	cell.setCellValue("Jadhav");
	
	sheet.createRow(1).createCell(0).setCellValue("Banti");
	sheet.getRow(1).createCell(1).setCellValue("Nayak");
}

@BeforeTest
public void beforeTest() throws IOException {
	//One time configuration
	file = new File(fpath);
	fos = new FileOutputStream(file);
	wb = new XSSFWorkbook();				//Create the workbook
	sheet = wb.createSheet("My Sheet");		//Create the sheet
}

@AfterTest
public void afterTest() throws IOException {
	wb.write(fos); 			//Write the data physically to the file
	wb.close();
	fos.close();
}
}
