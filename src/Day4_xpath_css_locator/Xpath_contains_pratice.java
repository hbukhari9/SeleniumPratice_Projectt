package Day4_xpath_css_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains_pratice {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
        // Create an instance of ChromeDriver
       // WebDriver driver = new ChromeDriver();
		//Go to etsy.com
				WebDriver driver1 = new ChromeDriver();
				driver1.get("https://etsy.com");
					//Click on Sign in.
				WebElement signinBtn = driver1.findElement(
						By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
				signinBtn.click();
				Thread.sleep(1000);
				    //Click on Register.
				WebElement registerBtn = 
						driver1.findElement(By.xpath("//button[@class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']"));
				registerBtn.click();
				Thread.sleep(1000);
				    //Enter an email address, (jon.dow@gmail.com)
				driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("jon.dow@gmail.com");
					//Enter first name.
				driver1.findElement(By.xpath("//input[@name='first_name']")).sendKeys("jon");
					//Enter password.
				driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("jkhgkjdgfgsd");
					//Click on Register.
				Thread.sleep(500);
				driver1.findElement(By.xpath("//button[@name='submit_attempt']")).click();
				Thread.sleep(3000);
					//Verify you get the error message:
					//"Sorry, the email you have entered is already in use."
				
				String errorMessage = driver1.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']")).getText();
				System.out.println(errorMessage);
				if (errorMessage.equals("Sorry, the email you have entered is already in use.")) {
					System.out.println("Test pass");
				}else {
					System.out.println("Test fail");
			

			}
		
	}

}
