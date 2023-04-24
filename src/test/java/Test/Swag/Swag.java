package Test.Swag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");  
		driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        driver.findElement(By.xpath(".//div[@class='login_logo']")).equals("Swag Labs");
       //Login
        driver.findElement(By.xpath(".//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5);
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath(".//input[@id='login-button']")).click();
        
        //Verify Dashboard
        
        driver.findElement(By.xpath(".//div[@class='app_logo']")).equals("Swag Labs");
        //Add Sauce Labs Bike Light product to cart
        
        driver.findElement(By.xpath(".//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
        //Navigate to cart item 
        driver.findElement(By.xpath(".//span[@class='shopping_cart_badge']")).click();
        Thread.sleep(5);
        
        // Need to vereify the product 
        
        // Checkou the product 
        
        driver.findElement(By.xpath(".//button[@id='checkout']")).click();
        
        Thread.sleep(5);
        
        // Checkout: Your Information

        driver.findElement(By.xpath(".//input[@id='first-name']")).sendKeys("BSR");
        driver.findElement(By.xpath(".//input[@id='last-name']")).sendKeys("K");
        driver.findElement(By.xpath(".//input[@id='postal-code']")).sendKeys("500032");
        Thread.sleep(5);
        driver.findElement(By.xpath(".//input[@id='continue']")).click();
        
        // Checkout: Overview
        driver.findElement(By.xpath(".//button[@id='finish']")).click();
        // Confirming 
        driver.findElement(By.xpath(".//button[@id='back-to-products']")).click();
        Thread.sleep(5);
                      
        driver.close();
        
        
        
        
        
        

	}

}
