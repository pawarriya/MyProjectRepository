package abstractmodifier;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demochrome {

	public static JavascriptExecutor js;
	public static void main(String[] args) throws InterruptedException {

		//Installed Maven reporsitoy ->created Library folder ->paste files and go to project ->properties Java Build path-> Library Classpath-> Add Jars all jars from Library -> Apply and close
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE\\chromedriver-win32\\chromedriver.exe" );
		
		//A blank browser is called
		WebDriver driver = new ChromeDriver();
		
		//---URL is called ---------- 
		driver.get("https://omayo.blogspot.com/");
		String Url1 = driver.getCurrentUrl();  //Print URL1
		System.out.println("Working on the URL: "+Url1);
		
		driver.manage().window().maximize(); //To maximize the window 
		//driver.manage().window().fullscreen();
		
		WebElement element= driver.findElement(By.id("but2"));
		 element.click();
		 //OR
		 //driver.findElement(By.id("but2")).click();
		 
		  driver.findElement(By.name("q")).sendKeys("Riya Pawar"); 	//Send the message
		  driver.findElement(By.className("classone")).sendKeys("Class");
		 
		  //driver.findElement(By.partialLinkText("onlytes")).getSize();
		 //driver.findElement(By.xpath("//input[@id='confirm']")).click(); 
		 //driver.findElement(By.cssSelector("#confirm")).click();

		 //Get Text printed 
		  String text = driver.findElement(By.id("pah")).getText();
		  System.out.println("Following is the selected text:" +text);
		  String title1 =  driver.getTitle();
		  System.out.println("Title of the Page is: "+title1); 		//Get URL printed 		
		  
			/*driver.findElement(By.linkText("onlytestingblog")).click();
			String Url2 = driver.getCurrentUrl();
			System.out.println("Clicked and redirected to URL: "+Url2); //Print URL2
			String title2 = driver.getTitle();
			System.out.println("Current Page title is : " +title2);
			driver.navigate().back()*/
			Thread.sleep(3000);
			scrollUp(driver);
		  
			String text1 = driver.findElement(By.id("textbox1")).getAttribute("value");
			System.out.println(text1);
			
			
			boolean isD = driver.findElement(By.id("but2")).isDisplayed();
			System.out.println("Button2 is displayed or not True/False:" +isD );
			
			boolean isE = driver.findElement(By.id("but1")).isEnabled();
			System.out.println("Button1 is displayed or not True/False:" +isE );
			
			boolean isS =driver.findElement(By.id("checkbox1")).isSelected();
			System.out.println("Checkbox is displayed or not True/False:" +isS );
			
			//String pg =driver.getPageSource();
			//System.out.println("Following is Page source \n" +pg);
			
			//UDEMY 
			driver.get("https://www.udemy.com/");
			String Url3 = driver.getCurrentUrl();  //Print URL1
			System.out.println("Working on the URL: "+Url3);
			
			driver.findElement(By.xpath("//span[normalize-space() ='Log in']")).click();
			
			driver.findElement(By.xpath("//input[@type='checkbox']")).click(); //need to check 
		
			
			
			//form-group--1
			//driver.close();
		  
		 	

	}

	private static void scrollUp(WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 40);");
		
	}

}
