package org.utilities;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngParllelClasses extends Facebbokbaseclass {
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
			fill(p.getSearch(),"pulleys");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			long id=Thread.currentThread().getId();
			
			System.out.println("test3"+id);
		}
		@Test(enabled=true,priority=-5)
		private void tc2() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"roller chains");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			long id=Thread.currentThread().getId();
			System.out.println("test2"+id);
		}
		@Test(enabled=true,priority=-5)
		private void tc1() throws InterruptedException {
			Pojo p=new Pojo();
			fill(p.getSearch(),"oxygen saturator");
			webeleclick(p.getButton());
			Thread.sleep(3000);
			long id=Thread.currentThread().getId();
			System.out.println("test1"+id);
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
