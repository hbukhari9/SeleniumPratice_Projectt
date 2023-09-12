package ReviewClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Home_Work {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
	}
	
		//Go to 'https://demoqa.com/text-box'
		
		//http://practice.primetech-apps.com/practice/text-box
		//Find the Full Name field and store it in a variable  
		//Enter a full name 
		//Find the email field 
		//Enter an email 
		//Find the current address field and enter address
		//Find the permanent address field and enter address
		//Validate each entry of the text field 
	public static void homeWrok() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		// go to the URL "http://practice.primetech-apps.com/practice/text-box"
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		//Find the Full Name field and store it in a variable 
		WebElement fNameTextbox = driver.findElement(By.id("userName"));
		WebElement emailTextbox = driver.findElement(By.id("userEmail"));
		WebElement currentAddressbox = driver.findElement(By.id("currentAddress"));
		WebElement permentAddressbox = driver.findElement(By.id("permanentAddress"));
		WebElement submitBtn = driver.findElement(By.id("submit"));


		String actulFullName = "PrimeTech";
		String actuaEmail = "primetech@school.com";
		String actualCaddress = "Fairfax city";
		String actualPaddress = "VA";
		
		fNameTextbox.sendKeys(actulFullName);
		emailTextbox.sendKeys(actuaEmail);
		Thread.sleep(1000);
		currentAddressbox.sendKeys(actualCaddress);	
		permentAddressbox.sendKeys(actualPaddress);
		
		submitBtn.click();
		String expectedFName = fNameTextbox.getAttribute("value");
		String expectedemail = emailTextbox.getAttribute("value");
		String expectedCaddress= currentAddressbox.getAttribute("value");
		String expectedPaddress= permentAddressbox.getAttribute("value");
		
		
		Thread.sleep(2000);
		// Validating full name 
		
		
		if(expectedFName.equals(actulFullName)) {
			System.out.println("TEST PASS: The expected full name: "+ expectedFName + "is equals the actual full name " +actulFullName);
		}else {
			System.out.println("Test failed");
		}
		// validate the email 
		if(expectedemail.equals(actuaEmail)) {
			System.out.println("TEST PASS: The expected email: "+ expectedemail + " is equals the actual email " +actuaEmail);

		}else {
			System.out.println("TEST FAILD");
		}
		
		// validate the current address
		if(expectedCaddress.equals(actualCaddress)) {
			System.out.println("TEST pass: the expected address is equals to the actual address");
			
		}else {
			System.out.println("TEST FAIL");
		}
		// validate the perment address 
		if(expectedPaddress.equals(actualPaddress)) { 
			System.out.println("TEST PASS: the expected current address is equals to the actual current address");
			
		
	}

	}
}
