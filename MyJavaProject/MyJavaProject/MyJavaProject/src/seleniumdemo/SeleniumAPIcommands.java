package seleniumdemo;

import java.util.Iterator;
import java.util.Set;
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

public class SeleniumAPIcommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "D:\\SOFTWARE\\edgedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
			
			
		}else if(browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "D:\\SOFTWARE\\IEDriverServer_Win32_3.141.59\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		
}
	
		 driver.get("https://omayo.blogspot.com/"); //Mainwindow
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
		
		
		driver.findElement(By.linkText("Open a popup window")).click();  //Child Window will opened
		driver.getWindowHandles();
	
		driver.findElement(By.linkText("Blogger")).click(); //Another Window
		driver.getWindowHandles();

		Thread.sleep(1000);
		//Getwindowhandle functions 
		Set<String> window1 = driver.getWindowHandles();
		Iterator<String> itr = window1.iterator();
		
		while(itr.hasNext()) {
			
		String Mainwindow = itr.next();
			
		String Childwindow = itr.next();
		
		String AnotherBW  = itr.next();
		
		
			//String W = itr.next();
			//itr.next();

			//driver.switchTo().window(hs);
			//System.out.println("Title of Window is: "+Mainwindow);
					
			driver.switchTo().window(Childwindow);
			Thread.sleep(1000);
			String childwindow1 =driver.findElement(By.xpath("//h3[normalize-space ()='New Window']")).getText();
			System.out.println("-------------------------------------------- ");

			System.out.println("First child window is: "+childwindow1);
			driver.close();
			
			driver.switchTo().window(AnotherBW);
			String childwindow2 =driver.findElement(By.xpath("//h2[normalize-space()='Publish your passions, your way']")).getText();
			System.out.println("Second Child  is: "+childwindow2);
			driver.close();

			
			driver.switchTo().window(Mainwindow).getCurrentUrl();
			System.out.println("-------------------------------------------- ");
			System.out.println("Current working on" +url1); 
			driver.navigate().refresh();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			Thread.sleep(1000);
			
			driver.findElement(By.id("alert1")).click();
			Alert alert = driver.switchTo().alert();
			String text = driver.switchTo().alert().getText();
			System.out.println("-------------------------------------------- ");
			System.out.println("Alert text is: " +text);
			
			String Alerts = "acceptAlert";
			if (Alerts.equalsIgnoreCase("acceptAlert")) {
				
				driver.switchTo().alert().accept();
				System.out.println("Alert is accepted");
				
			}else if (Alerts.equalsIgnoreCase("DismissAlert")){
				
				driver.switchTo().alert().dismiss();
				System.out.println("Alert if Dismissed");
			}
		
			
			WebElement selection = driver.findElement(By.id("drop1"));
			Select select = new Select(selection);
			select.selectByVisibleText("doc 1");
			select.selectByIndex(0);
			System.out.println("-------------------------------------------- ");
			
			WebElement multi = driver.findElement(By.id("multiselect1"));
			Select multiselection = new Select(multi);
			multiselection.selectByVisibleText("Volvo");
			multiselection.selectByVisibleText("Hyundai");
			multiselection.selectByVisibleText("Swift");
			multiselection.deselectByVisibleText("Hyundai");
			multiselection.selectByVisibleText("Audi");
			
			//WebDriverWait wait = new WebDriverWait(driver, 5);
			//WebElement explicit = wait.until(ExpectedConditions.visibilityOfElementLocated("")))
			
			String Last = driver.findElement(By.xpath("//div[@class='widget-content']/ol/li[last()]")).getText();
			System.out.println("Current Order list is uptil: " +Last );
			//div[@class='widget-content']/ol/li[last()]
			String five = driver.findElement(By.xpath("//div[@class='widget-content']/ol/li[position()=5]")).getText();
			System.out.println("Position selected for Order list is : " +five );

		
			//Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@class='dropdown']")).click();
			 
			 driver.findElement(By.linkText("Facebook")).click();
			 
			// https://tutorialsninja.com/demo/index.php?route=product/search
			//*[@class='input-group-btn']/child::button OR //*[@id='search']/descendant::button
			//*[@id='top-links']/descendant::a[last()]
			//*[@id='top-links']/ancestor::*[@id='top']  ---Ancestor
		
			
		}
		
		
		
				
	
		
		
		
		
		
		
	}

}
