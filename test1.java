//package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	

	public static void main(String[] args) {
		
		WebDriver driver;
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		

		//1. set property
		//2. object chromedriver
		//3. send url
		//4. identify the page (web element)
		//5. send keys
		
		driver = new ChromeDriver(); 

		driver.get("http://localhost:3000/login");
		
		WebElement user_id = driver.findElement(By.name("username"));
		
		user_id.sendKeys("purvikagore@gmail.com");
		
//		user_id.sendKeys("");

		
		WebElement pass = driver.findElement(By.name("password"));
		
		pass.sendKeys("admin@123");
//		pass.sendKeys("");

		
		WebElement next_but = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/form/button"));
		
		next_but.click();
		
			
//		driver.close();
		
		
	}

}
