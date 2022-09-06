package org.utilities;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngGroupInclude extends Facebbokbaseclass{
	@BeforeClass
	private void browser() {
		Launchchrome();
		winmax();
		}
	@AfterClass
	private void browserclose() {
		closebrowser();
	}
		@Test(groups= {"smoke","Regression"})
		private void tc3() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"ventilators");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			
			
			System.out.println("test3");
		}
		@Test(groups= {"Sanity","Regression"})
		private void tc2() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"adaptors");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			System.out.println("test2");
		}
		@Test(groups= {"Integration"})
		private void tc1() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"rollerchains");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			System.out.println("test1");
		}
		@Test(groups= {"Regression","Smoke"})
		private void tc4() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"coatings");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			System.out.println("test1");
		}
		@Test(groups= {"Performance,Functional"})
		private void tc5() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"gears");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			System.out.println("test5");
		}
		@Test(groups= {"Integration","Acceptance"})
		private void tc6() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"flowmeters");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			System.out.println("test6");
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
