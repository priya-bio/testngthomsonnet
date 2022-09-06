package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFour extends Facebbokbaseclass{
	//https://business.thomasnet.com/resources
	//1.non parametric construtor
		public PojoFour() {
			
			
			PageFactory.initElements(driver,this);
		}
		//2.private webelement
		@CacheLookup
		//or
		@FindAll({
			@FindBy(xpath="(//img[@class='rl-content-img'])[7]"),
			@FindBy(xpath="(//p[text()='Product Data'])[1]")
		})
		private WebElement productdata ;
		
		
		@CacheLookup
		//or
		@FindAll({
			@FindBy(xpath="(//img[@class='rl-content-img'])[3]"),
			@FindBy(xpath="(//p[text()='Digital Marketing Tactics'])[1]")
		})
		private WebElement digitalmarketingstatus;	
		
	

}
