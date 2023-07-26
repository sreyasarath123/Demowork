package Packagedr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regi {
	WebDriver driver;
	By login=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By create=By.xpath("//*[@id=\"customer_login\"]/div[2]/div[1]/button");
	By name=By.xpath("//*[@id=\"FirstName\"]");
	By last=By.xpath("//*[@id=\"LastName\"]");
	By mail=By.xpath("//*[@id=\"Email\"]");
	By psw=By.xpath("//*[@id=\"CreatePassword\"]");
	By sub=By.xpath("//*[@id=\"create_customer\"]/div/div/div[2]/ul/li[3]/div/input");



public Regi(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
public void clicking()
{
	driver.findElement(login).click();
}
public void reg()
{
	driver.findElement(create).click();
}
public void settingvalue(String nam,String lname,String email,String pass)
{
	driver.findElement(name).sendKeys(nam);
	driver.findElement(last).sendKeys(lname);
	driver.findElement(mail).sendKeys(email);
	driver.findElement(psw).sendKeys(pass);
}
public void submitting()
{
	driver.findElement(sub).click();
}
}


