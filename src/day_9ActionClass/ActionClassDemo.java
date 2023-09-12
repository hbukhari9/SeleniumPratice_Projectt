package day_9ActionClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassDemo {

	
	public static void main(String[] args) {
		
		//actionsClassDemo1();
		//etsyActivity();
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Actions actions = new Actions(driver);
		//Navigate to Etsy.com
        driver.get("https://www.etsy.com");
        // Hover over "Jewelry & Accessories"
        WebElement jewelryAccessories = driver.findElement(By.xpath("//*[@id=\"catnav-primary-link-10855\"]"));
		actions.moveToElement(jewelryAccessories).perform();
		
		
        // Mouseover on "Bags & Purses"
        WebElement bagsPurses = driver.findElement(By.xpath("//*[@id=\"side-nav-category-link-10865\"]"));
        actions.moveToElement(bagsPurses).click().perform();
        
        // Mouseover to "Shoulder Bags"
        WebElement shoulderBags = driver.findElement(By.xpath("///*[@id=\"catnav-l4-10869\"]"));
        actions.moveToElement(shoulderBags).click().perform();
        
        // Verify you are on the Shoulder bags page
        String expectedTitle = "Shoulder Bags ";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("You are on the Shoulder Bags page.");
        } else {
            System.out.println("You are not on the Shoulder Bags page.");{
            }
        }
	}
      /*  public static void actionsClassDemo1() {
    		
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		
    		Actions action = new Actions(driver);
    		
    		// got to http://practice.primetech-apps.com/practice/drag-and-drop
    		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
    		// drag the text to empty box
    		
    		WebElement sourceTextElement = driver.findElement(By.id("text"));
    		WebElement sourceTextAreaElement = driver.findElement(By.id("textarea"));
    		WebElement sourceNumberElement = driver.findElement(By.id("Number"));
    		
    	
    		WebElement targetBoxElement = driver.findElement(By.id("dropzone"));
    		
    		// remember: whenever you use actions function, you need to finish the function with perform() function.
    		
    		// .perform() - can be used alone when there is only one actions functions used.
    		// .build().perform() - is for more than one chained actions functions.
    		action.dragAndDrop(sourceTextElement, targetBoxElement).build().perform();
    		action.dragAndDrop(sourceTextAreaElement, targetBoxElement).build().perform();
    		action.dragAndDrop(sourceNumberElement, targetBoxElement).build().perform();
    		*/
    		
    	
	
        public static  void etsyActivity() {
    		//Test case: 
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    		
    		Actions act = new Actions(driver);
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    		
    			//go to Etsy.com
    		driver.get("https://etsy.com");
    			//Hover Over on Jewelry & Accessories
    		WebElement JA = driver.findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
    		act.moveToElement(JA).build().perform();
    		
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]")));
    			//Mouseover on Bags & Purses
    		WebElement BP = driver.findElement(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]"));
    		System.out.println(BP.isDisplayed()); // isDisplayed method only cares about the element visibility on the UI.
    		act.moveToElement(BP).build().perform();
    		
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shoulder Bags")));
    			//Mouseover to Shoulder Bags
    		WebElement ShoulderBags = driver.findElement(By.linkText("Shoulder Bags"));
    		act.moveToElement(ShoulderBags).build().perform();
    		
    			//Click on the shoulder bags
    		ShoulderBags.click();
    		
    			//Verify you are on the Shoulder bags page
    		if (driver.getTitle().contains("Shoulder Bags")) {
    			System.out.println("We are on the shoulder bags page");
    		}else {
    			System.out.println("We are Not on the shoulder bags page");{
    				
    			}}
    			}

	
		
	}
    		
    	

