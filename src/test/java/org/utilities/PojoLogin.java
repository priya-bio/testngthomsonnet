package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin  extends Facebbokbaseclass{
		//1.non parametric construtor
		public PojoLogin() {
			
			
			PageFactory.initElements(driver,this);
		}
		//2.private webelement
		//https://www.thomasnet.com/account/login
		@FindBy(xpath="//input[@id='email']")
		private WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}
		

		
		


}
