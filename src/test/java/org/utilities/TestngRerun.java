package org.utilities;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngRerun extends Facebbokbaseclass{
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
		@Test(retryAnalyzer=Failed.class)
		private void tc2() {
			Assert.assertTrue(false, "checking");
			
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
