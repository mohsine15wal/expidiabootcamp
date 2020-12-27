package expediapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class returningSearch_page {
	public WebDriver driver;
	
	@FindBy(xpath = "(//*[@data-test-id='select-link'])[2]")
	WebElement retuning_price;
	
	@FindBy(xpath = "//*[text()=\"Continue\"]" )
	WebElement continueButton2;
	
	@FindBy(xpath= " //*[text()=\\\"No Thanks\\\"]")
	WebElement thanks_button;
	
	 //*[text()=\"No Thanks\"]
			
	 public  returningSearch_page(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
		
		}

	 public void retuning_price() throws InterruptedException {
		Thread.sleep(3000);
		 retuning_price.click();
	 }
	 public void continueButton2() throws InterruptedException {
		 Thread.sleep(3000);
		 continueButton2.click();
	 }
	 
	 public void thanks_button() throws InterruptedException {
		 Thread.sleep(3000);
		 thanks_button.click();
	 }
	 
	 
	 
	 
	 
	 
}
