package Day3_advanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day_2HomeworkRewive {

	


	private static final By driver = null;

	public static void main(String[] args) {
	
		// Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
        // Create an instance of ChromeDriver
      /*  WebDriver driver = new ChromeDriver();
      try {
            // 1. Go to indeed.com
            driver.get("https://www.indeed.com");
            // 2. Get the current URL and store it in a variable called homeURL.
            String homeURL = driver.getCurrentUrl();
            // 3. Get the website title and store it in a variable homeTitle.
            String homeTitle = driver.getTitle();
            // 4. Find the input field for WHAT and type SDET
            WebElement whatInput = driver.findElement(By.name("q"));
            whatInput.sendKeys("SDET");
            // 5. Find the Search button and click on it.
            WebElement searchButton = driver.findElement(By.id("whatWhere"));
            searchButton.submit();
            // 6. Get the current URL and store it as a variable searchURL.
            String searchURL = driver.getCurrentUrl();
            // 7. Get the website title and store it in a variable searchTitle.
            String searchTitle = driver.getTitle();
            // 8. Verify that searchURL does not equal to homeURL and contains the search criteria.
            boolean isURLChanged = !searchURL.equals(homeURL) && searchURL.contains("SDET");
            // 9. Verify that searchTitle does not equal to homeTitle and has the search criteria.
            boolean isTitleChanged = !searchTitle.equals(homeTitle) && searchTitle.contains("SDET");
            // 10. Get Text of the JobsInLocation field, store it in a variable, then verify if it's equal to your search criteria.
            WebElement jobsInLocation = driver.findElement(By.id("location"));
            String jobsInLocationText = jobsInLocation.getText();
            boolean isJobsInLocationEqualsSearchCriteria = jobsInLocationText.contains("SDET");
            // Use if-else statements to verify the results
            if (isURLChanged) {
                System.out.println("URL changed and contains search criteria.");
            } else {
                System.out.println("URL did not change or does not contain search criteria.");
            }
            if (isTitleChanged) {
                System.out.println("Title changed and contains search criteria.");
            } else {
                System.out.println("Title did not change or does not contain search criteria.");
            }
            if (isJobsInLocationEqualsSearchCriteria) {
                System.out.println("JobsInLocation field contains search criteria.");
            } else {
                System.out.println("JobsInLocation field does not contain search criteria.");
            }
      }
            finally {
               
            
  
       WebDriver driver = new ChromeDriver();
    		  driver.get("https://www.indeed.com");
    		  
    		  where_field = driver.find_element(By.ID ("where"));
    		   value_attribute = where_field.get_attribute("value");
    		  //# Verify if it's based on your current location
    		 // # Replace 'Your Current Location' with the expected value for your location
    		  expected_location = ("Your Current Location");
    		  if( value_attribute == expected_location){
    		      System.out.println("The 'Where' field value is based on your current location.");
    		  } else {
    			  System.out.println("The 'Where' field value is not based on your current location.");
    		  }
    	  color_css_value = where_field.value_of_css_property(('color'));
    				  System.out.println ("The CSS value of the 'color' property for the 'Where' field is:", color_css_value);
    		  
    		  tag_name = where_field.tag_name;
    		 
    		  expected_tag_name = ("input");
    		  if (tag_name == expected_tag_name){
    			  System.out.println("The tag name of the 'Where' field is 'input'.");
    		  }  else {
    			  System.out.println("The tag name of the 'Where' field is not 'input'.");
    		  }
    		  //# Close the browser
    		  driver.quit();
	
	{
		
		
	}
	/* System.setProperty("webdriver.chrome.driver","/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
	 WebDriver driver = new ChromeDriver();
			//# Go to facebook.com
			driver.get("https://www.facebook.com");
			//# Find the "Create New Account" button and click on it using Xpath
			WebElement create_account_button = driver.findElement(By.xpath( "//a[text()='Create New Account"));
			 create_account_button.click();
			//# Find the FirstName field and type "Automation" using Xpath
			WebElement firstname  = driver.findElement(By.xpath( "//input[@name='firstname']"));
			 firstname.sendKeys("Automation");
			//# Find the LastName field and type "Automation" using Xpath
			 WebElement lastname  = driver.findElement(By.xpath( "//input[@name='lastname']"));
			lastname.sendKeys("Automation");
			//# Find the Email field and type "Automation" using Xpath
			WebElement emailfield = driver.findElement(By.xpath( "//input[@name='reg_email__']"));
			emailfield.sendKeys("Automation");
			///# Find the Password field and type "Automation" using Xpath
			create_account_button = driver.findElement(By.xpath( "//input[@name='reg_passwd__']"));
			create_account_button.sendKeys("Automation");
			//# Find the "Sign Up" button and click on it using Xpath
			WebElement signup_button = driver.findElement(By.xpath( "//button[@name='websubmit']"));
			signup_button.click();
			//# Close the browser
			driver.quit();*/

        System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//go to facebook.com
		driver.get(" https://www.facebook.com");
	    // find the Email or phone number field and type Automation
		WebElement emailflied = driver.findElement(By.xpath("email"));
		emailflied.sendKeys("Automation");
	     //find the Password field and type Automation
		WebElement passwordflied = driver.findElement(By.xpath("password"));
		passwordflied.sendKeys("Automation");
	    // find the Login button and click on it.
		WebElement loginbutton = driver.findElement(By.xpath("login"));
		loginbutton.click();

        
	}

	
	

	
	}

	
	

	
	


    		      	
            	
            
            
       
            


