package org.utilities;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.Cell;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebbokbaseclass  {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static  Select s;
	public static void Launchchrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	//2maximise
			public static void winmax() {	
				driver.manage().window().maximize();
			
		}
			//3.load url
			public static void loadurl(String url) {	
				driver.get(url);
		

	}
			//4.gettitle
			public static void printtitle()	{
				driver.getTitle();
				
			}	
			//5.getcorrent url
			public static void printcurrenturl()	{
				driver.getCurrentUrl();
				
			}	
			//6.webelement send keys
			public static void fill(WebElement txtbox,String value) {
				txtbox.sendKeys(value);
				
				
			}
			//7.click
			public static void webeleclick (WebElement ele) {
				ele.click();
				}
			//8.getting text
			public static void printtext(WebElement ele,String text) {
				ele.getText();
				System.out.println(text);
			}
			//9.getting attribute
			public static void printattri(WebElement ele,String text){
				ele.getAttribute(text);
			}
			//closebrowser
			public static void closebrowser() {	
				driver.close();
			
		}
			
			
			
			
}
