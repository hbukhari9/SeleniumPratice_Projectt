package day_6workingWithWebElements2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
	
		

		}
	/*public static    <Select> void SelectDemo()throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //go to http://practice.primetech-apps.com/practice/select-menu
		driver.get("http://practice.primetech-apps.com/practice/select-menu");
		
		// select French from the language dropdown
				// whenever you get a dropdown which started with select tagname in HTML, 
				// that's the time that you can use this select class.
				
				WebElement languageDropdown = driver.findElement(By.id("language"));
				Select letsSelect = new Select(languageDropdown);
				
				// get all the options and get text print them
				List<WebElement> allOptions = ((ISelect) letsSelect).getOptions();
				for (WebElement option : allOptions) {
					System.out.println(option.getText());
				}
				
				// get first selected option
				WebElement firstSelectedOption = ((ISelect) letsSelect).getFirstSelectedOption();
				System.out.println("First selected item is: " + firstSelectedOption.getText());
				Thread.sleep(2000);
				
				
				// select by visible text - most commonly used one
				((ISelect) letsSelect).selectByVisibleText("French");
				Thread.sleep(2000);
				
				// get first selected option here
				System.out.println("After selecting French, first selected option is: " 
				+ ((ISelect) letsSelect).getFirstSelectedOption().getText());
				
				// select by index
				((ISelect) letsSelect).selectByIndex(4);
				
				Thread.sleep(2000);
				
				// select by value
				((ISelect) letsSelect).selectByValue("Spanish");
				Thread.sleep(2000);
				
				// deselect option only works with multi-select dropdown
				
				
				// select class only works with a dropdown which is created by Select tag in html
				// if the dropdown is not created with select tag in HTML, we just treat the dropdown as a regular element.
				// we find the dropdown element, and click on it to expand, then find the value we wanna select, 
				// click on it.
				
				*/
			}
				
		
				
			
				
			
			
		

	

