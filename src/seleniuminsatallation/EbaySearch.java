package seleniuminsatallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EbaySearch {
    public static void main(String[] args) {
        // Set the path for ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to eBay website
        driver.get("https://www.ebay.com");
        // Find the search box and type "coffee mug"
        WebElement searchBox = driver.findElement(By.name("_nkw"));
        searchBox.sendKeys("coffee mug");
        // Find the search button and click on it
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        // Close the browser
        driver.quit();
    }
}