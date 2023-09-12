package ReviewClass;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Thrusday8_10 {

	public static void main(String[] args) throws InterruptedException {
		
		//testCase1();
		registerUser ();
	}
 
	public static void testCase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
  
//		Navigate to (https://www.thetestingworld.com/testings).
		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
//		Maximize the browser & declare implicitly wait for 5 second.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
// Implicit Wait:
//      1- Set globally
//		2- Applies to all elements
//		3- Does not require a setting of a condition
//		4- Best used when all elements are loaded before the duration time set

//		Locate  "Register" webelement & varifly the element isDisplayed().
		WebElement registerBtn = driver.findElement(By.id("tab1"));
		System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());
//		Locate the textBox's for:  userName, email, passWord & sendKeys the values for each box.
		WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
		String userN = "KM";
		WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
		String userEmail = "km@gmail.com";
		WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
		WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
		String userPassw = "12345";
		
		userName.sendKeys(userN);
		email.sendKeys(userEmail);
		
		passWord.sendKeys(userPassw);
		confirmPassW.sendKeys(userPassw);
		
		
//		Locate the "Date of birth", send the date in the correct format then click "Enter" using (Keys.ENTER).
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		String userDOB = "12/12/2000";
		
		//dob.sendKeys(userDOB);
		//dob.sendKeys(Keys.ENTER);
		dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
		//dob.sendKeys("06/13/1997", Keys.ENTER);
		
//		Locate "Select Country" dropdown & use select one for each: by value/visible text/index .
		WebElement countryDD = driver.findElement(By.id("countryId"));
		Select LetsSelect = new Select(countryDD);
		LetsSelect.selectByIndex(2);
		Thread.sleep(2000);
		LetsSelect.selectByValue("4"); 
		Thread.sleep(2000);
		LetsSelect.selectByVisibleText("United States");
//		Locate the "State" dropdown, use explicit wait for 3 seconds the select state by value 
		WebElement stateDD = driver.findElement(By.id("stateId"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(stateDD));
		
		
		Select sle1 = new Select(stateDD);
		sle1.selectByValue("3974");

		
		
//		Locate the "City" dropdown, use explicit wait for 3 seconds the select state by value 
		WebElement cityDD = driver.findElement(By.id("cityId"));
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.elementToBeClickable(cityDD));
		
		Select sle2 = new Select(cityDD);
		sle2.selectByVisibleText("Reston");
		
		
//		Locate checkbox for "terms & conditions" & "Sign up" then click on both.  
		
	}
	
	
public static void registerUser () {
		
//		Test case: registerUser 
//		   
//		Step 1: Go to URL "https://www.thetestingworld.com/testings".
		WebDriver driver = new ChromeDriver();
		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
//		Step 2: Maximize the browser & declare implicitly wait for 5 second.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Step 3:  Verify the browser landed on the "Register" page. 
		
		WebElement registerBtn = driver.findElement(By.xpath("//*[@for='tab1']"));
		System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());

//		Step 4: Locate all the required Text Boxes, Dropdowns, Radio Buttons.
	
		WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
		String userN = "KM";
		WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
		String userEmail = "km@gmail.com";
		WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
		WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
		String userPassw = "12345";
		
		userName.sendKeys(userN);
		email.sendKeys(userEmail);
		
		passWord.sendKeys(userPassw);
		confirmPassW.sendKeys(userPassw);
		
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		String userDOB = "12/12/2000";
		
		//dob.sendKeys(userDOB);
		//dob.sendKeys(Keys.ENTER);
		dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
		
		WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
		String userPHnumber = "1012023090";
		phoneNumber.sendKeys(userPHnumber);
		
		WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
		String userAddress = "1234 fairfax blvd";
		address.sendKeys(userAddress);
		
		WebElement radioAddresstype = driver.findElement(By.cssSelector("input[value='office']"));
		radioAddresstype.click();
		
		WebElement genderDD = driver.findElement(By.cssSelector("select[name='sex']"));
		Select sl3 = new Select(genderDD);
		sl3.selectByVisibleText("Male");
		
		WebElement countryDD = driver.findElement(By.id("countryId"));
		Select sel = new Select(countryDD);
		sel.selectByValue("231");
		
		WebElement stateDD = driver.findElement(By.id("stateId"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(stateDD));
		Select sle1 = new Select(stateDD);
		sle1.selectByValue("3974");
		
		WebElement cityDD = driver.findElement(By.id("cityId"));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.elementToBeClickable(cityDD));
		Select sle2 = new Select(cityDD);
		sle2.selectByVisibleText("Fairfax");
		
		WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
		String userZipCode = "11001";
		zipCode.sendKeys(userZipCode);
		
		

//		Step 5: Locate the checkbox for Terms and Conditions and Sign Up button and click.  
		
		WebElement termsAndCond = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		termsAndCond.click();
		WebElement logInBtn = driver.findElement(By.xpath("//*[@value='Sign up']"));
		logInBtn.click();
		
//		Step 6: Locate "User is successfully Register. Now You can Login" webelement and verify its displayed on the page. 
		
		String actualMsg = "User is successfully Register. Now You can Login";
		String expectedMsg = driver.findElement(By.className("vd_green")).getText();
		
//		System.out.println(actualMsg + "VS" +expectedMsg);
//		Step 7: Locate the Login button and click on it. 
		
		
	}
	
	
}
		
		
		
		
		