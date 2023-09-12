package seleniuminsatallation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Indeed {

	public static void main(String[] args) {
		
		 // Set the system property to the path of your ChromeDriver
        System.setProperty("webdriver.chrome.driver","/Users/fareehahamzah/Desktop/selenium server/chromedriver_mac64/chromedriver");
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        try {
            // Step 1: Go to indeed.com
            driver.get("https://www.indeed.com");
            // Step 2: Get the current URL and store it in a variable called homeURL
            String homeURL = driver.getCurrentUrl();
            // Step 3: Get the website title and store it in a variable homeTitle
            String homeTitle = driver.getTitle();
            // Step 4: Find the input field for WHAT and type "SDET"
            WebElement whatInput = driver.findElement(By.name("q"));
            whatInput.sendKeys("SDET");
            // Step 5: Find the Search button and click on it
            WebElement searchButton = driver.findElement(By.className("icl-WhatWhere-button"));
            searchButton.click();
            // Step 6: Get the current URL and store it as a variable searchURL
            String searchURL = driver.getCurrentUrl();
            // Step 7: Get the website title and store it in a variable searchTitle
            String searchTitle = driver.getTitle();
            // Step 8: Verify that searchURL does not equal to homeURL and contains the search criteria
            boolean searchURLContainsCriteria = searchURL.contains("SDET");
            boolean searchURLNotEqualHomeURL = !searchURL.equals(homeURL);
            // Step 9: Verify that searchTitle does not equal to homeTitle and has the search criteria
            boolean searchTitleContainsCriteria = searchTitle.contains("SDET");
            boolean searchTitleNotEqualHomeTitle = !searchTitle.equals(homeTitle);
            // Step 10: Get Text of the JobsInLocation field, store it in a variable, then verify if it's equal to your search criteria.
            WebElement jobsInLocationField = driver.findElement(By.id("where"));
            String jobsInLocationText = jobsInLocationField.getText();
            boolean jobsInLocationEqualsSearchCriteria = jobsInLocationText.contains("SDET");
            // Printing the verification results
            System.out.println("searchURLContainsCriteria: " + searchURLContainsCriteria);
            System.out.println("searchURLNotEqualHomeURL: " + searchURLNotEqualHomeURL);
            System.out.println("searchTitleContainsCriteria: " + searchTitleContainsCriteria);
            System.out.println("searchTitleNotEqualHomeTitle: " + searchTitleNotEqualHomeTitle);
            System.out.println("jobsInLocationEqualsSearchCriteria: " + jobsInLocationEqualsSearchCriteria);
        } finally {
            // Close the browser window
            driver.quit();
        }
    
	}
}
	


