package ReviewClass;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertDemoRecape {

	public static void main(String[] args) {
		alert_testcase3();
	}
	public static void alert_testcase3() {
		//Test case 3
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		
		//Click on the 'Prompt Alert' button and type PrimeTech
		String input = "Helil";
		driver.findElement(By.id("prompt")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
		handle.sendKeys(input);
		
		//Then accept the Alert. Verify that a greeting message displays as
		//"Hello <your input>! How are you today?".
		
		handle.accept();
		
		//wait the message visibility
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));
		String actualMessage = driver.findElement(By.id("demo")).getText();
		
		String expectedMessage = "Hello "+ input +"! How are you today?";
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Greeting match, Test Pass.");
		}else {
			System.out.println("Greeting does not match, Test Fail.");{
			
			}
		}
	}
		
	public static void alert_testcase4() {
		//Test case 4
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		
		//Click on the 'Prompt Alert' button and type PrimeTech. 
		String input = "Helil";
		driver.findElement(By.id("prompt")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		// switch to the alert
		Alert handle = driver.switchTo().alert();
		handle.sendKeys(input);
		
		//Then dismiss the Alert. 
		handle.dismiss();
		
		//Verify that "User cancelled the prompt." text displays.
		//wait the message visibility
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));
		String actualMessage = driver.findElement(By.id("demo")).getText();
		
		String expectedMessage = "User cancelled the prompt.";
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Cancelled Message match, Test Pass.");
		}else {
			System.out.println("Cancelled Message does not match, Test Fail.");
		}
			
		
	}
}