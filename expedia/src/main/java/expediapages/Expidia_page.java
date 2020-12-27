package expediapages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Expidia_page {
	 static WebDriver driver;
	
	 public static void main(String[] args) throws Exception {
	
		 int i=1;
		
		// String dir= System.getProperty("user. dir") ;
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohsi\\eclipse-workspace\\expedia\\drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		 driver.get("https://www.expedia.com/");
		
		 driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//ul[@id='uitk-tabs-button-container']/li[2]/a/span")).click();
		 driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		
		 driver.findElement(By.xpath(" //input[@id='location-field-leg1-origin'] ")).sendKeys("washigton dc");
		 
		
	 	driver.findElement(By.xpath(" //strong[contains(text(),'Washington (DCA - Ronald Reagan Washington Nationa')]")).click();
			
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")).sendKeys("New york");
		
		driver.findElement(By.xpath("//strong[contains(text(),'New York (NYC - All Airports)')]")).click();
		
		//driver.findElement(By.id("d1-btn")).click();
//	    driver.findElement(By.xpath("(//button[@type='button'])[50]")).click();
//	    driver.findElement(By.xpath("(//button[@type='button'])[65]")).click();
	 
//	    driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[3]/button/span")).click();
	
		 driver.findElement(By.xpath("//*[text()=\"Search\"]")).click();
		 
		 //page search
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@class='uitk-card-link']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();	
		 Thread.sleep(3000);
		
		 String parent =driver.getWindowHandle();
		 System.out.println("parent window ID is " + parent);
		 
		 driver.findElement(By.xpath("//*[text()=\"No Thanks\"]")).click();
		
		Set <String> allwindows= driver.getWindowHandles();
		
		int count = allwindows.size();
		
	System.out.println("Total windows "+ count);
	
	for(String child:allwindows) {
		if(!parent.equalsIgnoreCase(child)) {
			
			driver.switchTo().window(child);
		 driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		
			 // driver.findElement(By.xpath("//button[text()=\"Check out\"]")).click();
				
			 driver.findElement(By.id("firstname[0]")).sendKeys("mohsine");
			 driver.findElement(By.id("middlename[0]")).sendKeys("m");
			 driver.findElement(By.id("lastname[0]")).sendKeys("momo");
			
			
			WebElement countrycode=driver.findElement(By.id("country_code[0]"));
			Select ob=new Select(countrycode);
			ob.selectByVisibleText("United States of America +1");
				
			 driver.findElement(By.id("phone-number[0]")).sendKeys("222-222-2222");	
			 
			 Thread.sleep(3000);	
			WebElement male=driver.findElement(By.id(("gender_male[0]")));
					
				male.click();
				
			WebElement month= driver.findElement(By.id("date_of_birth_month0"));
			Select ob1= new Select(month);	
			ob1.selectByValue("06");
			
			Thread.sleep(3000);	
			WebElement day=driver.findElement(By.id("date_of_birth_day[0]"));					Select da=new Select(day);
			da.selectByValue("04");
				
			Thread.sleep(3000);	
			WebElement year=driver.findElement(By.id("date_of_birth_year[0]"));
			Select ye= new Select(year);
			ye.selectByValue("1994");
					
		
					
			
					 }
	}
		
	//driver.switchTo().window(parent);
	
	
	 }
	
	
	
	
}