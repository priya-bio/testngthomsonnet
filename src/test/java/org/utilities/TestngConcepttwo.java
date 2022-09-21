package org.utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngConcepttwo extends Facebbokbaseclass{
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
			PojoTwo p=new PojoTwo();
			p.getButtons();
			webeleclick(p.getClickbtn());
			Thread.sleep(3000);
			
			
			System.out.println("test3");
		}
		@Test
		private void tc2() throws InterruptedException {
			PojoTwo p=new PojoTwo();
			fill(p.getCadsearch(),"pulleys");
			webeleclick(p.getClickbtn());
			Thread.sleep(3000);
			System.out.println("test2");
		}
		@BeforeMethod
		private void start() {
			System.out.println(new Date());
			loadurl("https://cad.thomasnet.com/cadmodels.html");
		}
		@AfterMethod
		private void end() {
			System.out.println(new Date());
			
		}

}

