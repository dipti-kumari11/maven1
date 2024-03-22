
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;			
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;			

public class Priority_In_testNG {		
    WebDriver driver;			
    @BeforeTest
    public void beforeTest() {	
        // Set the system property for ChromeDriver before creating its instance
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipti\\Downloads\\chromedriver-win64 (5).exe"); 
        // Create an instance of ChromeDriver
        driver= new ChromeDriver(); 
    }
    
	    // Method 1: Open Brower say Firefox			
	    @Test		
	    public void openBrowser() {				
	        driver = new FirefoxDriver();				
	    }		

	    // Method 2: Launch Google.com			
	    @Test		
	    public void launchGoogle() {				
	        driver.get("http://www.google.co.in");						
	    }		
        
	    // Method 3: Perform a search using "Facebook"			
	    @Test		
	    public void peformSeachAndClick1stLink() {				
	        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");								
	    }		

	    // Method 4: Verify Google search page title.			
	    @Test		
	    public void FaceBookPageTitleVerification() throws Exception {				
	        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
	        Thread.sleep(3000);		
	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
	    }	
	    @AfterTest
	    public void afterTest() {
	        // Quit the WebDriver instance after the test
	        driver.quit();			
	    }
	}