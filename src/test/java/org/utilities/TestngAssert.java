package org.utilities;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssert extends Facebbokbaseclass{
	@BeforeClass
	private void browser() {
		Launchchrome();
		winmax();
		}
	@AfterClass
	private void browserclose() {
		closebrowser();
	}
	        //soft assert
		@Test
		private void tc3() throws InterruptedException {
			SoftAssert s=new SoftAssert();
			s.assertTrue(true, "testing");
			Pojo p=new Pojo();
			fill(p.getSearch(),"ventilators");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			
			
			System.out.println("test3");
			
		}
		//hard assert
		@Test
		private void tc2() {
			Assert.assertTrue(true, "checking");
			
			System.out.println("test2");
		}
		//softassert ith assertall
		@Test
		private void tc1() throws InterruptedException {SoftAssert s=new SoftAssert();
		s.assertTrue(true, "testing");
		Pojo p=new Pojo();
		fill(p.getSearch(),"adaptors");
		webeleclick(p.getButton());
		Thread.sleep(3000);
		
			
			System.out.println("test1");
			System.out.println("thomsonnet");
			s.assertAll();
			System.out.println("success");
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

