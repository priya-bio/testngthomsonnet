package org.utilities;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngConcept extends Facebbokbaseclass {
@BeforeClass
private void browser() {
	Launchchrome();
	winmax();
	}
@AfterClass
private void browserclose() {
	closebrowser();
}
	@Test(priority=0)
	private void tc3() throws InterruptedException {
		Pojo p=new Pojo();
		fill(p.getSearch(),"ventilators");
		webeleclick(p.getButton());
		Thread.sleep(3000);
		
		
		System.out.println("test3");
	}
	@Test(enabled=true,priority=-5,invocationCount=3)
	private void tc2() {
		System.out.println("test2");
	}
	@BeforeMethod
	private void start() {
		System.out.println(new Date());
		loadurl("https://www.thomasnet.com/");
	}
	@AfterMethod
	private void end() {
		System.out.println(new Date());
		
	}
	
}


