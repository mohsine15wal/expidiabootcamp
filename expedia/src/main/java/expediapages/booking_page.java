package expediapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class booking_page {
	
	public static WebDriver driver;
	
	public  booking_page(WebDriver driver){
		
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	
	}
	public void booking() throws InterruptedException {
		
		
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
		WebElement day=driver.findElement(By.id("date_of_birth_day[0]"));				
		Select da=new Select(day);
		da.selectByValue("04");
			
		Thread.sleep(3000);	
		WebElement year=driver.findElement(By.id("date_of_birth_year[0]"));
		Select ye= new Select(year);
		ye.selectByValue("1994");
				
		
		
	}
	

			
}
