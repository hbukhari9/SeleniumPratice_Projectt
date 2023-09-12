package day_6workingWithWebElements2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Homework {

	



	



	public static void main(String[] args) throws InterruptedException {

        // Set the path to your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
		//Testcase();
		Testcase1();
		//Testcase2();
	}
	
		
		
		public static void Testcase() throws InterruptedException {
        // Create a new instance of ChromeDriver
			 WebDriver driver = new ChromeDriver();
		        // Navigate to Amazon website
		        driver.get("https://www.amazon.com");
		        // Click on the "Sign In" link
		        driver.findElement(By.linkText("Sign in")).click();
		        // Verify if you are on the Sign-In page by checking the presence of a specific element (e.g., email field)
		        if (isElementDisplayed(driver, By.id("ap_email"))) {
		            System.out.println("You are on the Sign-In page");
		        }
		        // Navigate back
		        driver.navigate().back();
		        // Navigate forward
		        driver.navigate().forward();
		        // Verify if you are on the Sign-In page after navigating forward
		        if (isElementDisplayed(driver, By.id("ap_email"))) {
		            System.out.println("You are on the Sign-In page after navigating forward");
		        }
		        // Click on "Create your Amazon account" button
		        driver.findElement(By.id("createAccountSubmit")).click();
		        // Verify if you are on the Create Account page by checking the presence of a specific element (e.g., firstname field)
		        if (isElementDisplayed(driver, By.id("ap_customer_name"))) {
		            System.out.println("You are on the Create Account page");
		        }
		        // Navigate back
		        driver.navigate().back();
		        // Verify if you are on the Sign-In page after navigating back
		        if (isElementDisplayed(driver, By.id("ap_email"))) {
		            System.out.println("You are on the Sign-In page after navigating back");
		        }
		        // Navigate forward
		        driver.navigate().forward();
		        // Verify if you are on the Create Account page after navigating forward
		        if (isElementDisplayed(driver, By.id("ap_customer_name"))) {
		            System.out.println("You are on the Create Account page after navigating forward");
		        }
		        // Click on the Continue button without filling the form
		        driver.findElement(By.id("continue")).click();
		        // Verify error messages displayed and get text to verify
		        WebElement nameError = driver.findElement(By.xpath("//div[contains(text(), 'Enter your name')]"));
		        WebElement emailError = driver.findElement(By.xpath("//div[contains(text(), 'Enter your email or mobile phone number')]"));
		        WebElement minCharactersError = driver.findElement(By.xpath("//div[contains(text(), 'Minimum 6 characters required')]"));
		        System.out.println("Error Messages:");
		        System.out.println(nameError.getText());
		        System.out.println(emailError.getText());
		        System.out.println(minCharactersError.getText());
		        	
		        	
		        }
		        	
		        	
		        
		



		private static boolean isElementDisplayed(WebDriver driver, By id) {
			
			return false;
		
		}
		public static void Testcase1() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			   // Maximize the browser window
			driver.manage().window().maximize();
		    // implicitly wait for 5 seconds.
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		     //go to ebay.com.  
			driver.get("https://www.ebay.com");
		     //search coffee mug.
			 driver.findElement(By.name("_nkw")).sendKeys("coffee mug");
		 driver.findElement(By.id("gh-btn")).click();
		     //find all the results and store them in a list of webelements.
		  List<WebElement> searchResults = driver.findElements(By.xpath("//li[contains(@class, 's-item')]"));
		    //loop through all those and get the prices of each item and print it out. 
		  System.out.println("price of Coffe Mugs");
		  for(WebElement result:searchResults) {
			  String price = result.findElement(By.className("s-item__price")).getText();
			  System.out.println(price);{
			  }
		  }
			  }
				  
			  
			  
			  
			  
		  
		  
		
		     //then quit.
		  
			  
		
			  public static      void Testcase2() throws InterruptedException {
				
					WebDriver driver = new ChromeDriver();
					   // Maximize the browser window
					driver.manage().window().maximize();
				    // implicitly wait for 5 seconds.
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					// Navigate to Amazon website
			        driver.get("https://www.amazon.com");
		
			        // Verify that the dropdown value is by default "All Departments"
			        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
			        Select letsSelect = new Select(dropdown);
			       
					
					String selectedOption = letsSelect.getFirstSelectedOption().getText();
			        if (selectedOption.equals("All Departments")) {
			            System.out.println("The default dropdown value is \"All Departments\"");
			        }else {
						System.out.println("The default dropdown not value is \\\"All Departments\\\"");
			        // Select department Home & Kitchen and search for "coffee mug"
			        letsSelect.deselectByVisibleText("Home & Kitchen");
			        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug");
			        driver.findElement(By.cssSelector("input[type='submit'][value='Go']")).click();
			        // Verify that you are on the coffee mug search results page by checking the title
			        if (driver.getTitle().contains("coffee mug")) {
			            System.out.println("You are on the coffee mug search results page");
			        }else {
						System.out.println("You are on not the coffee mug search results page");
			        // Verify that you are in the Home & Kitchen department
			        WebElement departmentLabel = driver.findElement(By.xpath("//span[@class='a-text-bold' and contains(text(), 'Home & Kitchen')]"));
			        if (departmentLabel.isDisplayed()) {
			            System.out.println("You are in the Home & Kitchen department");
			  }
			  
			        }
			        
			        }
			  }
		  }
			        
			        



		
		



	
		

		
		
		
		

