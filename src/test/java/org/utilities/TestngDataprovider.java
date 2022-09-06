package org.utilities;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngDataprovider extends Facebbokbaseclass {
	@BeforeClass
	private void browser() {
		Launchchrome();
		winmax();
		}
	@AfterClass
	private void browserclose() {
		closebrowser();
	}
		@Test(priority=0,dataProvider="login")
		private void tc3(String s1,String s2) throws InterruptedException {
			PojoLogin a=new PojoLogin();
			fill(a.getEmail(),s1);
			fill(a.getPassword(),s2);
			
			Thread.sleep(3000);
			
			
			System.out.println("test3");
		}
		@Test(enabled=true,priority=-5,dataProvider="login")
		private void tc2(String s3,String s4) throws InterruptedException {
			PojoLogin a=new PojoLogin();
			fill(a.getEmail(),s3);
			fill(a.getPassword(),s4);
			
			Thread.sleep(3000);
			
			System.out.println("test2");
		}
		@Test(enabled=true,priority=5,dataProvider="login")
		private void tc1(String s5,String s6) throws InterruptedException {
			PojoLogin a=new PojoLogin();
			fill(a.getEmail(),s5);
			fill(a.getPassword(),s6);
			
			Thread.sleep(3000);
			
			System.out.println("test1");
		}
		@BeforeMethod
		private void start() {
			System.out.println(new Date());
			loadurl("https://www.thomasnet.com/account/login");
		}
		@AfterMethod
		private void end() {
			System.out.println(new Date());
			
		}
	@DataProvider(name="login")
	private Object[][] thomson() {
		return new Object [][] {
			{"hi@gmail.com","passhi"},
			{"jack@gmail.com","passjack"},
			{"thomson@gmail.com","passthomson"}
			

			
			
			
		};
}
}
