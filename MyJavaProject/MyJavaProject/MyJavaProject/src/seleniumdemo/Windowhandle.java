package seleniumdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Windowhandle {


		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = null;
			String browser = "Chrome";
			if(browser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE\\chromedriver-win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("edge")){
				System.setProperty("webdriver.edge.driver", "D:\\SOFTWARE\\edgedriver_win32\\msedgedriver.exe");
				driver = new EdgeDriver();
				
				
			}else if(browser.equalsIgnoreCase("ie")){
				
				System.setProperty("webdriver.ie.driver", "D:\\SOFTWARE\\IEDriverServer_Win32_3.141.59\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait globally for 10secs

				 driver.get("https://omayo.blogspot.com/"); //Mainwindow
				 driver.manage().window().maximize();
				 
				 driver.findElement(By.xpath("//div[@class='dropdown']")).click();
				 System.out.println("Dropdown is clicked");
				 
				
				 
				 Thread.sleep(3000); // we know it is 3sec wait
				 
				 
				 driver.findElement(By.linkText("Gmail")).click();
				
				 
				 
			
				 

				}
				
				
				
			
	}
	

 