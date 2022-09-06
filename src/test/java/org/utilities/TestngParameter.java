package org.utilities;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter extends Facebbokbaseclass{
	//launch and maximise the browser
	@BeforeClass
	private void browser() {
		Launchchrome();
		winmax();
		}
	//closing the browser
	@AfterClass
	private void browserclose() {
		closebrowser();
	}
	//send keys called ventilators and click
	@Parameters({"covid"})
	@Test(priority=0)
	private void tc3() throws InterruptedException {
		Pojo p=new Pojo();
		fill(p.getSearch(),"ventilators");
		webeleclick(p.getButton());
		Thread.sleep(3000);
		
		
		System.out.println("test3");
	}
	@Parameters({"products"})
	@Test(enabled=true,priority=-5,invocationCount=3)
	private void tc2() throws InterruptedException {
		Pojo p=new Pojo();
		fill(p.getSearch(),"adaptors");
		webeleclick(p.getButton());
		Thread.sleep(3000);
		
		
		
		System.out.println("test2");
	}
	@Parameters({"cadmodels"})
	@Test(enabled=true,invocationCount=2)
	private void tc1() throws InterruptedException {
		Pojo p=new Pojo();
		fill(p.getSearch(),"valves");
		webeleclick(p.getButton());
		Thread.sleep(3000);
		
		System.out.println("test3");	
	}
	
	//loading the url
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
