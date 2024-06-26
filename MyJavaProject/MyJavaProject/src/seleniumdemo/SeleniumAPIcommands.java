package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAPIcommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		 driver.get("https://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		String url1 = driver.getCurrentUrl();
		System.out.println("Following is the URL: " +url1);
		
		String text1 =driver.findElement(By.id("pah")).getText();
		System.out.println("Following is the test: " +text1);
		
		driver.findElement(By.id("but2")).click();
		driver.findElement(By.id("ta1")).sendKeys("Hello");
		
		
		String title1 = driver.getTitle();
		System.out.println("Following is the page title: " +title1);
		
		String message = driver.findElement(By.id("rotb")).getAttribute("value");
		System.out.println("Following is the stored message: "+message);
		
		driver.close();
		
		
		
	}

}
