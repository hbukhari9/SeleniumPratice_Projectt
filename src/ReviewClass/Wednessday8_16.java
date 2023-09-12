package ReviewClass;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wednessday8_16 {

	public static void main(String[] args) throws InterruptedException {
			alertHandle();
		/*WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("btn-danger")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();*/
		
	}
	

	

public static  void alertHandle() {

//Create a new instance of the Chrome driver
WebDriver driver = new ChromeDriver();
// Open the URL
driver.get("https://testautomationpractice.blogspot.com");
// Locate the buttons
WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(), 'Alert')]"));

WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(), 'Confirm Box')]"));
WebElement promptButton = driver.findElement(By.xpath("//button[contains(text(), 'Prompt Box')]"));
// Click on the 'Alert' button
alertButton.click();
// Switch to the alert and get its text
Alert alert = driver.switchTo().alert();
String alertText = alert.getText();
// Accept the alert
alert.accept();
// Click on the 'Confirm Box' button
confirmButton.click();
// Dismiss the alert
alert.dismiss();
// Click on the 'Prompt Box' button
promptButton.click();
// Switch to the prompt alert, enter text, and accept
alert.sendKeys("hamzah");
alert.accept();
// Verify the entered text
WebElement enteredTextElement = driver.findElement(By.id("demo1"));
String enteredText = enteredTextElement.getText();
System.out.println("Entered text: " + enteredText);
}

//Click the button to display an alert box.
//Send text to the Alert with your name and title.
//Then accept the Alert. 
//Verify that the message displays as it should.

	
WebDriver driver = new ChromeDriver();		
driver.manage().window().maximize();

///		Go to "https://demo.automationtesting.in/Alerts.html"		
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Click on Alert with text box. 
WebElement alertWtext = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));
alertWtext.click();
driver.findElement(By.className("btn-info")).click();

Alert alt = driver.switchTo().alert();
Thread.sleep(2000);
alt.sendKeys("Hello, I am Sam");
Thread.sleep(2000);
System.out.println(alt.getText());
alt.accept();


public static void windowHandles () {
	
WebDriver driver = new FirefoxDriver();		
driver.manage().window().maximize();

driver.get("https://demo.automationtesting.in/Windows.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


String mainWindowId = driver.getWindowHandle();
System.out.println(mainWindowId);

WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
clickBtn.click();

Set <String> windowsIds = driver.getWindowHandles();

for (String str : windowsIds) {
if(!str.equals(mainWindowId)) {driver.switchTo().window(str);}
}

String newPageTxt = driver.findElement(By.className("fs-1")).getText();
System.out.println(newPageTxt);

driver.switchTo().window(mainWindowId);
String mainPagetxt = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText();
System.out.println(mainPagetxt);
}



}
}