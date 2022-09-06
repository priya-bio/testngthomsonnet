package org.utilities;
//https://www.thomasnet.com/catalogs/

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoThree extends Facebbokbaseclass{
	//1.non parametric construtor
	public PojoThree() {
		
		
		PageFactory.initElements(driver,this);
	}
	//2.private webelement
	@CacheLookup
	//AND
	@FindBys({
		@FindBy(xpath="(//figure[@class='media-item__figure'])[19]"),
		@FindBy(xpath="//h3[text()='HVAC']")
	})
	private WebElement hvac;
	
	
	@CacheLookup
	//AND
	@FindBys({
		@FindBy(xpath="(//figure[@class='media-item__figure'])[39]"),
		@FindBy(xpath="//h3[text()='Robotics']")
	})
	private WebElement robotics ;


	public WebElement getHvac() {
		return hvac;
	}


	public WebElement getRobotics() {
		return robotics;
	}
	
	
}
