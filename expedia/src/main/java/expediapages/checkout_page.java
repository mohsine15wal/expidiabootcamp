package expediapages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_page {
	 
	 public static WebDriver driver;
	 
	
	 public  checkout_page(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
		
		}
	
	public void checkout() {
	int i=1;
		 
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
		}
	}
	}
}
			
		 
	 
	




