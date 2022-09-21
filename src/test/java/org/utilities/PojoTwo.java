package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PojoTwo extends Facebbokbaseclass{
	//https://cad.thomasnet.com/cadmodels.html
	//1.non parametric construtor
		public PojoTwo() {
			
			
			PageFactory.initElements(driver,this);
		}
		//2.private webelement
		//https://www.thomasnet.com/
		@FindBy(xpath="//h3[text()='Buttons']")
		private WebElement buttons;
		
		@FindBy(xpath="//input[@placeholder='By Product Category']")
		private WebElement cadsearch;
		
		@FindBy(xpath="//button[text()='Search']")
		private WebElement clickbtn;

		public WebElement getButtons() {
			return buttons;
		}

		
		public WebElement getCadsearch() {
			return cadsearch;
		}


		public WebElement getClickbtn() {
			return clickbtn;
		}
		
		
}
