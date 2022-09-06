package org.utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Browser extends BaseClasss {
	private static final String  e = null;

	public static void main(String[] args) throws IOException, Exception {
		Launchchrome();
		winmax();
		loadurl("https://www.thomasnet.com/");
		printtitle();
		printcurrenturl();
		WebElement txtbox=driver.findElement(By.xpath("//input[@placeholder='Search Thomas']"));
		fill(txtbox,"ventilators");
		WebElement sbtn=driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary search-execute']"));
		webeleclick (sbtn);
		
		WebElement attribute=driver.findElement(By.xpath("//a[text()='Thomasnet Reviews']"));
		filll(attribute,"ji");
		WebElement contain=driver.findElement(By.xpath("//a[contains(text(),' Plant & Facility Equipment')]"));
		fillcon(contain,"plant");
		WebElement find=driver.findElement(By.xpath("//span[text()='Find Buyers']"));
		movingmouse(find);
		WebElement dclick=driver.findElement(By.xpath("//span[text()='Find Buyers']"));
		twoclick(dclick);
		WebElement rclick=driver.findElement(By.xpath("//span[text()='Find Buyers']"));
		rightclick(rclick);
		WebElement da=driver.findElement(By.xpath("//span[text()='Display Advertising']"));
		actionclick(da);
		WebElement advet=driver.findElement(By.xpath("//span[text()='Advertise']"));
		downkey(advet);
		WebElement adveta=driver.findElement(By.xpath("//span[text()='Advertise']"));
		upkey(adveta);
		WebElement asearch=driver.findElement(By.xpath("//input[@placeholder='Search Thomas']"));
		filcon(asearch,"ventilators");
		downrobotkey(asearch);
		uprobotkey(asearch);
		tabrobotkey(asearch);
		tabrobotkeyrelease(asearch);
		alertSimple();
		alertConfirm();
		alertPrompt("hi");
		screenShot("login");
		frameInt("iframe");
		frameOut();
		frameDefault();
		waitTime( 20);
		dynamicimplicitwait();
		dynamicexplicitwait();
		WebElement ref=driver.findElement(By.xpath("//input[@placeholder='By Category, Company or Brand']"));
		javaScript( ref);
		javaScrollTrue( ref);
		javaScrollFalse( ref);
		javasendvalue( ref);
		javaexehighlight( ref);
		indexbasedselection( ref);
		visibletextbasedselection( ref);
		ismultipledropdown( ref);
		optionsget( ref);
		alloptionsget( ref);
		firstselectoptions( ref);
		deselectionasedonindex( ref);
		deselectionasedonvalue( ref);
		deselectionasedontext( ref);
		deselectionall( ref);
		parentwindowid(ref);
		allwindowid(ref);
		
		
		
	}

	
	
	

}
