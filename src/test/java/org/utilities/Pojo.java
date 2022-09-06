package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo  extends Facebbokbaseclass{
	//1.non parametric construtor
	public Pojo() {
		
		
		PageFactory.initElements(driver,this);
	}
	//2.private webelement
	//https://www.thomasnet.com/
	@FindBy(xpath="//input[@class='form-control form-control-lg search-query']")
	private WebElement Search;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement button;

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getButton() {
		return button;
	}
	
	
	
	
	

}
