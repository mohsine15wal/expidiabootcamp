package expediapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expidia_home_page {
	 
	public WebDriver driver;
	
			
	
			@FindBy(xpath="(//*[text()=\"Flights\"])[3]")
			WebElement	filght_Button;
			
			
			
			@FindBy(xpath = "(//button[@type='button'])[12]") 
			WebElement aroundTrip_Button;
			
			//@FindBy(xpath = "//span[normalize-space()='Roundtrip']") 
			//WebElement aroundTrip_Button;
			
			
			@FindBy(xpath = " //input[@id='location-field-leg1-origin'] ")
					WebElement departure;
			
			// driver.findElement(By.xpath(" //input[@id='location-field-leg1-origin'] ")).sendKeys("washigton dc");
			@FindBy(xpath = " //input[@id='location-field-leg1-origin'] ")
			WebElement departure_sen;
		
			@FindBy(xpath = "//*[text()='Washington (WAS - All Airports)']")
			WebElement departure_link;
			
			//strong[normalize-space()='Washington (WAS - All Airports)']
			
			@FindBy(xpath = "//button[@aria-label='Going to']")
			WebElement destination;
			
			@FindBy(xpath = "//button[@aria-label='Going to']")
			WebElement destination_sen;
						
			
			
			@FindBy(xpath = "//strong[contains(text(),'New York (NYC - All Airports)')]")
			WebElement destination_Link;
			
			@FindBy(xpath = "//*[text()=\"Search\"]")
			WebElement search_Button;
			
			public  Expidia_home_page(WebDriver driver){
				
				this.driver=driver;
				
			PageFactory.initElements(driver, this);
			
				}
			
	public void filght_Button(){
		filght_Button.click();
	}
	public void aroundTrip_Button() {
		aroundTrip_Button.click();
	}

	public void departure() {
		departure.click();
	}
		
	public void departure_sen() {
		departure_sen.sendKeys("washington DC");
		
	}
	
	public void departure_link()  {
	
		departure_link.click();
		
	}
	public void destination () {
	
		destination.click();
	}
	public void destination_sen() {
		destination_sen.sendKeys(" New york ");
	}
	
	public void destination_link() {
		destination_Link.click();
	}
	public void search_Button() {
		search_Button.click();
	}
	
	
	
	
}
