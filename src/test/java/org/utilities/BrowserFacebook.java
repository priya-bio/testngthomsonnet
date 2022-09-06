package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;


public class BrowserFacebook extends Facebbokbaseclass {
	private static final String  e = null;
	public static  void main(String[] args) throws IOException, Exception {
	Launchchrome();
	winmax();
	loadurl("https://my.naukri.com/account/register/basicdetails");
	printtitle();
	printcurrenturl();
	
	CharSequence value;
	WebElement a=driver.findElement(By.xpath("//input[@placeholder='What is your name?']"));
	File f=new File("C:\\Users\\udhay\\eclipse-workspace\\myProject\\src\\test\\resources\\framework.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s=w.getSheet("naukri");
	int i=0;
	Row r =s.getRow(i);
		filll(a,r.getCell(0));
		
		WebElement b=driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']"));
		filll(b,r.getCell(1));
		
		WebElement c=driver.findElement(By.xpath("//input[@placeholder='Create a password for your account']"));
filll(c,r.getCell(2));

WebElement d=driver.findElement(By.xpath("//input[@placeholder='Create a password for your account']"));
filll(d,r.getCell(3));
	}
}

