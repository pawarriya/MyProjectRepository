package seleniumdemo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALert {
	public static void main(String[] args) {
	
	String browser ="Chrome";
	
	WebDriver driver = null;
	if( browser.equalsIgnoreCase("Chrome"))	{
	
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE\\chromedriver-win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		
	}else if (browser.equalsIgnoreCase("Edge")){
		
		System.setProperty("webdriver.edge.driver", "D:\\SOFTWARE\\edgedriver_win32\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}else if(browser.equalsIgnoreCase("ie")){
		
		System.setProperty("webdriver.ie.driver", "D:\\SOFTWARE\\IEDriverServer_Win32_3.141.59\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}
	
		driver.get("https://omayo.blogspot.com/");
		String Url1 = driver.getCurrentUrl();
		System.out.println("Following URl is opened: "+Url1);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='dropdown']")).click();

		
		driver.findElement(By.id("alert1")).click();
		
		//--------------- Alert ---------------------------------------- 
		Alert alert = driver.switchTo().alert();
		String Al = alert.getText();
		
		System.out.println("Alert text is: " +Al);
		//driver.switchTo().alert().accept();
		String option = "Dismissalert";
		 if(option.equalsIgnoreCase("Acceptalert")) {
		 
			 
				driver.switchTo().alert().accept(); 
				System.out.println("Option Accept is selected");
			 
			 
		 }else {
				driver.switchTo().alert().dismiss(); 
				System.out.println("Option Dismiss is selected");


		 }
		 
		/* driver.manage().timeouts().implicitlyWait(3,TimeUnit.DAYS);
		 
		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 WebElement Exwait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))); */
		 
		WebElement dropdown = driver.findElement(By.id("drop1"));
		 Select select  = new Select(dropdown);
		 select.selectByVisibleText("doc 1");
		
		 WebElement multiselector = driver.findElement(By.id("multiselect1"));
				 
				 Select multiselect = new Select(multiselector);
				 
				 multiselect.selectByVisibleText("Volvo");
				 multiselect.selectByVisibleText("Audi");
				 multiselect.selectByVisibleText("Swift");

				 multiselect.deselectByVisibleText("Volvo");

		// System.out.println("Selected option is: " +dropdown);
		 

	}

}
