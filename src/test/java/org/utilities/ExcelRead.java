package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws Exception {
	//1.mentioning the file path
	File f=new File("C:\\Users\\udhay\\eclipse-workspace\\myProject\\src\\test\\resources\\framework.xlsx");
	//2.read the value from the file
	FileInputStream fin=new FileInputStream(f);
	//3.type of workbook typecasting
	Workbook w=new XSSFWorkbook(fin);
	//4.get the sheet
	Sheet s=w.getSheet("naukri");
	//for loop for row iteration
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r =s.getRow(i);
		//for loop to get cells from row
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c =r.getCell(j);
			System.out.println(c);
			
		}
		
	}
	
	}
}




