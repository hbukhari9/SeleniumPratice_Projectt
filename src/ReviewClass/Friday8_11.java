package ReviewClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Friday8_11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
		//login();
		//testcase2();
		testcase3();
	}
	
public static void login () throws InterruptedException {
		
//		Test case: registerUser 
//		   
//		Step 1: Go to URL "https://www.thetestingworld.com/testings".
		WebDriver driver = new ChromeDriver();
		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
//		Step 2: Maximize the browser & declare implicitly wait for 5 second.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



//Locate the Login button and click on it.
		driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();
//Locate the userName and passWord text box and put your info. 
//Locate the Login button and click on it. 
		WebElement userNameBox = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
		userNameBox.sendKeys("PrimeT");
		WebElement passWordBox = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
		passWordBox.sendKeys("12345");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBtn.click();
//Locate the Home button then select "user list" from the drop down menu
		WebElement homeBtn = driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
		//homeBtn.click();
		Thread.sleep(1000);
		
		
		Actions letdoaction = new Actions(driver);
		letdoaction.moveToElement(homeBtn).perform();
		
		Thread.sleep(1000);
		
		WebElement userListbtn = driver.findElement(By.xpath("//*[contains(text(),'User List')]"));
		userListbtn.click();
		
		
//Save all users in a List of WebElements, then print the user information 
//Print only the email and phone number for user 2. 

	List <WebElement> usersLst = driver.findElements(By.className("items"));
	System.out.println(usersLst.size());
	for (int i = 0; i < usersLst.size(); i++) {
		System.out.println(usersLst.get(i).getText());
	}
	}
	
public static void testcase2() throws InterruptedException {
		
//		Go to URL "https://www.thetestingworld.com/testings".
		WebDriver driver = new ChromeDriver();
		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
//		Step 2: Maximize the browser & declare implicitly wait for 5 second.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		

//			Login to your account 
		driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();

		WebElement userNameBox = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
		userNameBox.sendKeys("PrimeT");
		WebElement passWordBox = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
		passWordBox.sendKeys("12345");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBtn.click();
//			Locate the "Dual List Box Demo"  and save it in a List of WebElements.
		WebElement listBox = driver.findElement(By.className("pickData"));
//		Use Select Class to select the first 5 names on the list 'by index' or 'visible text'.	
		Select slt1 = new Select(listBox);
		slt1.selectByIndex(0);
		slt1.selectByIndex(1);
		slt1.selectByVisibleText("Alice");
		slt1.selectByVisibleText("Isabella");
		slt1.selectByVisibleText("Manuela");
//			Get all the selected options using getAllSelectedOptions
		
		List <WebElement> selectedoption = slt1.getAllSelectedOptions();
		System.out.println(selectedoption.get(0).getText());
//			Add the selected names to the second list. 
		driver.findElement(By.className("pAdd")).click();
//			Select all the names from the second list and deselect the last two names. 
//			Use wait for 3 seconds then Locate Remove All button and click on it.
		Thread.sleep(1000);
		WebElement listofselecteduser = driver.findElement(By.className("pickListResult"));
		Select slt2 = new Select(listofselecteduser);
		slt2.selectByIndex(0);
		slt2.selectByIndex(1);
		slt2.selectByIndex(2);
		slt2.selectByIndex(3);
		slt2.selectByIndex(4);
		
		Thread.sleep(2000);
		slt2.deselectByIndex(4);
		slt2.deselectByIndex(3);

	
	
	}
public static void testcase3() throws InterruptedException {
	
	//Go to URL "https://www.thetestingworld.com/testings".
	WebDriver driver = new ChromeDriver();
	String url = "https://www.thetestingworld.com/testings";
	driver.get(url);
//	Step 2: Maximize the browser & declare implicitly wait for 5 second.
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	// Login to your account 
	driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();
	WebElement userNameBox = driver.findElement(By.xpath("//input[@name='_txtUserName']"));
	userNameBox.sendKeys("PrimeT");
	WebElement passWordBox = driver.findElement(By.xpath("//input[@name='_txtPassword']"));
	passWordBox.sendKeys("12345");
	WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
	loginBtn.click();
	Thread.sleep(1000);
    // Locate 'My Account' dropdown and click on it
    WebElement myAccountDropdown = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
    myAccountDropdown.click();
    Thread.sleep(2000);
    // Save all the options in the dropdown to a list of WebElements
    List<WebElement> dropdownOptions = driver.findElements(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a/b"));
    // Click on 'My profile' using a for loop
    for (WebElement option : dropdownOptions) {
        if (option.getText().equals("legend")) {
            option.click();
            break;
        }
    }
    // Locate 'User Name' and get the value attribute
    WebElement userNameElement = driver.findElement(By.name("fld_username"));
    String actualUserName =  userNameElement.getText();
    // Expected user name (replace with your actual user name)
    String expectedUserName = "fld_username";
    // Verify if the user name matches
    if (actualUserName.equals(expectedUserName)) {
        System.out.println("User name verification passed.");
    } else {
        System.out.println("User name verification failed.");
    }
	
}
}
