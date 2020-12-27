package expediapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class departureSearch_page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@class='uitk-card-link']")
	WebElement departure_price;
	

	@FindBy(xpath ="//*[text()=\"Continue\"]" )
	WebElement continueButton;
	
	public  departureSearch_page(WebDriver driver){
			this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void departure_price() {
		departure_price.click();
	}
	
	public void continueButton() throws InterruptedException {
		Thread.sleep(3000);
		continueButton.click();
	}








}


