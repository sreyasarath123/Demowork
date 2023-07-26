package Packagedr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add {
	WebDriver driver;
	By add=By.name("s");
	By addbu=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[2]/div/div[6]/form/button/span");
public Add(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
public void searching(String val) throws InterruptedException
{
	Thread.sleep(2000);
	WebElement ab=driver.findElement(add);
	ab.sendKeys(val);
}
public void addcart()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(addbu).click();
}
}


