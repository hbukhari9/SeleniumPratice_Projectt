package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
		//WebDriver driver = new ChromeDriver();
	
	/*driver.get("https://facebook.com");
		WebElement emailfield = driver.findElement(By.name("email"));
		emailfield.sendKeys("automation");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("automation");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		
		
		drive.get("https://amazon.com");
		WebElement backToSchoolLink = drive.findElement(By.linkText("Clinic"));
		backToSchoolLink.click();
		
		
		drive.get("https://amazon.com");
		WebElement partialText = drive.findElement(By.partialLinkText("footwear on Shopbop"));
		partialText.click();
		*/
		WebDriver driver = new ChromeDriver();
		
		//Go to “https://automationtesting.co.uk”
			driver.get("https:automationtesting.co.uk");
			//Click on Contact Us Form Test
			WebElement Contactus = driver.findElement(By.xpath("//contact"));
			Contactus.click();
			//Find the Test field for first name
			WebElement testfield = driver.findElement(By.xpath("test"));
					testfield.sendKeys();
			//Enter a first name
					WebElement firstname = driver.findElement(By.xpath("firstname"));
					firstname.sendKeys();
					//Find the Test field for last name 
					WebElement testfield1 = driver.findElement(By.xpath("test"));
					testfield1.sendKeys();
					//Enter last name.
					WebElement lastname= driver.findElement(By.xpath("lastname"));
					testfield.sendKeys();
					//Find the Test field for email
					WebElement testfield11 = driver.findElement(By.xpath("email"));
					testfield11.sendKeys();
					//Enter email address
					
					
	}

}
