// sugumar
//Data provider in testNG By sugumar
package tesing;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testngUtil.DataUtil;

public class DataProvider{
	@org.testng.annotations.DataProvider
	public String[][] getdata() {
		String [][] data=new String[2][2];
		data[0][0]="sugumar3730@gmail.com";
		data[0][1]="sugumarstar";
		
		data[1][0]="sugumar0102@gmail.com";
		data[1][1]="sugumarstar";
		
		return data;

	}

@Test(dataProvider = "getdata")
public void login(String data[]) {
	System.err.println("email "+data[0]);
	System.out.println("pass"+data[1]);
	
	/*
	 * System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe"
	 * ); FirefoxDriver driver=new FirefoxDriver();
	 * driver.get("https://letcode.in/");
	 * driver.findElement(By.linkText("Log in")).click();
	 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	 * driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	 * System.out.println("Title is"+driver.getTitle());
	 * System.out.println("email is="+email+"_"+"pass is"+pass); driver.quit();
	 */
	 
}
	
}
