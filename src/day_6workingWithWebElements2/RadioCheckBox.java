package day_6workingWithWebElements2;
import java.time.temporal.IsoFields;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
		classActivity3();
	}
	
		
	
	/*public void radioButtonDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to facebook
		driver.get("https://facebook.com");
		// click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		// check if the Male radio button selected or not
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
		if (maleRadio.isDisplayed()) {
			System.out.println("The male radio button is displayed!");
		}else {
			System.out.println("The male radio button is NOT displayed!");
		}
		
		if (maleRadio.isEnabled()) {
			System.out.println("The male radio button is enabled!");
		}else {
			System.out.println("The male radio button is NOT enabled!");
		}
		
		if(maleRadio.isSelected()) {
			System.out.println("Male radio button is already selected");
		}else {
			// if not, then select the Male radio button
			maleRadio.click();
		}
		
	}

		public void classActivity1() {
			// Test case 1.
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	        // go to https://indeed.com
			driver.get("https://indeed.com");
	        // check if the search fields are enabled and displayed.
			WebElement whatField = driver.findElement(By.id("text-input-what"));
			WebElement whereField = driver.findElement(By.id("text-input-where"));
			if (whatField.isEnabled() && whatField.isDisplayed()) {
				System.out.println("What search field is displayed and enabled!");
			}else {
				System.out.println("What search field is NOT displayed and enabled!");
			}
			
			if (whereField.isDisplayed() && whereField.isEnabled()) {
				System.out.println("Where search field is displayed and enabled!");
			}else {
				System.out.println("Where search field is NOT displayed and enabled!");
			}
			
		}

			public void classActivity2() throws InterruptedException {
				//Test case 2.
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		        //go to http://practice.primetech-apps.com/practice/radio-button
				driver.get("http://practice.primetech-apps.com/practice/radio-button");
		        //Find those available radio buttons.
				List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
		        //Check if it's displayed and enabled,
				//if true, check if it's selected, if false select the button and check if it's selected.
				for (WebElement radio : radioButtons) {
					if (radio.isDisplayed() && radio.isEnabled()) {
						System.out.println("Radio button is enabled and displayed!");
						if (radio.isSelected()) {
							System.out.println("Radio button is selected!");
						}else {
							radio.click();
						}
					}else {
						System.out.println("Radio button is NOT enabled and displayed!");
					}
					
					if (radio.isSelected()) {
						System.out.println("Radio button is selected now!");
					}else {
						System.out.println("Radio button is NOT selected now!");
					}
					Thread.sleep(1000);*/

				
			
				public static void classActivity3() throws InterruptedException {
					
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
			        //go to http://practice.primetech-apps.com/practice/radio-button
					driver.get("http://practice.primetech-apps.com/practice/checkboxes");
					
					new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			        // go to http://practice.primetech-apps.com/practice/check-box
					driver.get("http://practice.primetech-apps.com/practice/check-box");
			        // find the checkboxes and verify if it's displayed, if true, then verify if it's enabled, if true, 
					// verify if it's selected, if false, then check the boxes. Then verify if it's checked.
					List<WebElement> checkBoxes = driver.findElements(By.className("form-check-input"));
					for (WebElement checkbox : checkBoxes) {
						if (checkbox.isDisplayed()) {
							System.out.println("Checkbox is displayed.");
							if (checkbox.isEnabled()) {
								System.out.println("Checkbox is enabled.");
								if (checkbox.isSelected()) {
									System.out.println("Checkbox is selected.");
								}else {
									checkbox.click();
								}
							}else {
								System.out.println("Checkbox is NOT enabled.");
							}
						}else {
							System.out.println("Checkbox is NOT displayed.");
						}
						
						if (checkbox.isSelected()) {
							System.out.println("Checkbox is selected now.");
						}else {
							System.out.println("Checkbox is still NOT selected.");
						}
						Thread.sleep(1000);
					}







			}
		}





