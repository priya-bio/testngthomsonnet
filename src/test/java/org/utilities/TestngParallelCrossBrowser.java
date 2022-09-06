package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParallelCrossBrowser {
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc(String name) {
		System.out.println("launch chrome");
		if (name.equals("chrome")) {
			//steps to launch chrome
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(name.equals("edge")) {
			//steps to launch edge driver
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else{
			//steps to laubch internet explorer
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			
			}
		driver.get("https://www.thomasnet.com/");
		
	}
	
	

}

