package org.utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	private static final WebElement WebElement = null;
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static  Select s;
	public static void Launchchrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		//2maximise
		public static void winmax() {	
			driver.manage().window().maximize();
		
	}
		//3.load url
		public static void loadurl(String url) {	
			driver.get(url);
	

}
		//4.gettitle
		public static void printtitle()	{
			driver.getTitle();
			
		}	
		//5.getcorrent url
		public static void printcurrenturl()	{
			driver.getCurrentUrl();
			
		}	
		//6.webelement send keys
		public static void fill(WebElement ele,String value) {
			ele.sendKeys(value);
			
			
		}
		//7.click
		public static void webeleclick (WebElement ele) {
			ele.click();
			}
		//8.getting text
		public static void printtext(WebElement ele,String text) {
			ele.getText();
			System.out.println(text);
		}
		//9.getting attribute
		public static void printattri(WebElement ele,String text){
			ele.getAttribute(text);
		}
		//10.xpath text syntax
		public static void filll(WebElement ele,String valuea) {
			ele.sendKeys(valuea);
		}
		//11.xpath contains syntax
		
		public static void fillcon(WebElement ele,String valueb) {
			ele.sendKeys(valueb);
		}
		//12.actions-move to element
		public static void movingmouse(WebElement ele) {
		a.moveToElement(ele).perform();
		}
		//13.actions doubleclick
		
		public static void twoclick(WebElement ele) {
			a.doubleClick().perform();
			}
		//14.actions context click
		
		public static void rightclick(WebElement ele) {
			a.contextClick().perform();
			}
		//15.actions click
		public static void actionclick(WebElement ele) {
			a.click().perform();
		}
		//16.ACTIONS keydown
		public static void downkey(WebElement ele) {
			CharSequence ENTER=null;
			a.keyDown(ele, ENTER).perform();
		}
		//17.actions keyup
		public static void upkey(WebElement ele) {
			CharSequence ENTER=null;
			a.keyDown(ele, ENTER).perform();
		}
		//18.actions build same as above
		public void dragDrop(WebElement src, WebElement des) {
			a = new Actions(driver);
		a.dragAndDrop(src,des);
		}


		//actions- key down and key up
		public static void pressKey() {
		act=new Actions(driver);

		}
		//19.actions send keys
		public static void filcon(WebElement ele,String valuec) {
			a.sendKeys(ele).build().perform();
		}
		//20.robot key down
		public static void downrobotkey(WebElement ele) {
			r.keyPress(KeyEvent.VK_ENTER);
		}
		//21.robot keyup
		public static void uprobotkey(WebElement ele) {
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		//22.robot key tab
		public static void tabrobotkey(WebElement ele) {
			r.keyPress(KeyEvent.VK_TAB);
		}
		//23.robot key tabrelease
		
		public static void tabrobotkeyrelease(WebElement ele) {
			r.keyRelease(KeyEvent.VK_TAB);
		}
		//24.alert-simple
		public static void alertSimple() {
			Alert alt=driver.switchTo().alert();
			alt.accept();
			}
		//25.alert - confirm
		public static void alertConfirm() {
			Alert alt = driver.switchTo().alert();
			alt.dismiss();
		
          }
		//26.alert - prompt
		public static void alertPrompt(String value) {
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			alt.sendKeys(value);
			}
		//27.28.29.Screenshot

		public static void screenShot(String name) throws IOException {
		TakesScreenshot take= (TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\Users\udhay\eclipse-workspace\myProject\screenshot\\"+name+"jpg");
		FileUtils.copyFile(src, des);
		}
		
		//30.frame-into frame
		
		public static void frameInt(String name) {
			driver.switchTo().frame(name);

			}
		//31.frames- out of frame
		public static void frameOut() {
			driver.switchTo().parentFrame();

			}
		//32.frames-out of all frames
		public static void frameDefault() {
			driver.switchTo().defaultContent();
			}
		//33.static wait
		public static void waitTime(int sec) throws InterruptedException {
			Thread.sleep(sec);
			}
		//34.dynamicwait
		public static void dynamicimplicitwait()
		{
			
			driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(5));
		}
		//35-50 to .dynamicwait-explicitwait
		WebDriverWait w=new WebDriverWait(driver,10);
		
		public static void dynamicexplicitwait() {
			WebDriverWait w=new WebDriverWait(driver,10);
			w.until(ExpectedConditions.alertIsPresent());
			w.until(ExpectedConditions.elementSelectionStateToBe(locator, selected));
			w.until(ExpectedConditions.elementToBeClickable(element));
			w.until(ExpectedConditions.elementToBeSelected(locator));
			w.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
			w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			w.until(ExpectedConditions.presenceOfElementLocated(locator));
			w.until(ExpectedConditions.textToBePresentInElement(element, text));
			w.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
			w.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
			w.until(ExpectedConditions.titleIs(title));
			w.until(ExpectedConditions.titleContains(title));
			w.until(ExpectedConditions.visibilityOf(element));
			w.until(ExpectedConditions.visibilityOfAllElements(elements));
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			w.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			
			
			
		}
		//51.Java Script executor-click
		public static void javaScript(WebElement ref) {
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()" ,ref);
		}
		//// 52Java Script executor-scroll up
		public static void javaScrollTrue(WebElement ref) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView(true)", ref);
			}
		//53.// Java Script executor-scroll down
		public static void javaScrollFalse(WebElement ref) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView(false)", ref);
			}
		//54.Java Script executor-send keys
		public static void javasendvalue(WebElement ref) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].setAttribute('value','ventilators')", ref);
			}
		//55.Java Script executor-highlighter
		
		public static void javaexehighlight(WebElement ref) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].setAttribute('value','ventilators')", ref);
			}
		//56.dropdown-select by value
		public static void valuebasedselection(WebElement ref) {
			Select s=new Select(ref);
			s.selectByValue("");
			
		}
		//57.dropdown-select by index
		
		public static void indexbasedselection(WebElement ref) {
			Select s=new Select(ref);
			int i=0;
			s.selectByIndex( i);
			
		}
		
		//58.dropdown-select by visible text
		
		public static void visibletextbasedselection(WebElement ref) {
			Select s=new Select(ref);
			int i=0;
			s.selectByVisibleText("");
			
		}
		//59.dropdown-is multiple or not
		
				public static void ismultipledropdown(WebElement ref) {
					Select s=new Select(ref);
					boolean a =s.isMultiple();
					System.out.println(a);
					
				}
				//60.dropdown-getoptions
				
				public static void optionsget(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
		//61.dropdown-getallselected option
				public static void alloptionsget(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
				//61.dropdown-getfirstselected option
				public static void firstselectoptions(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
		
				//62.dropdown-deselectbyindex
				public static void deselectionasedonindex(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
				//63.dropdown-deselectbyvalue
				public static void deselectionasedonvalue(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
				//64.dropdown-deselectbyvisiletext
				public static void deselectionasedontext(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
				//65.dropdown-deselectall
				public static void deselectionall(WebElement ref) {
					Select s=new Select(ref);
					s.getOptions();
					System.out.println(a);
					
				}
				//66.windowhandling-get parent window id
				public static void parentwindowid() {
					String parentId=driver.getWindowHandle();
				}
				//67windowhandling get all window id 
				public static void allwindowid() {
				Set<String> allwindowid=driver.getWindowHandles();
				}
				
				
				
}
		

