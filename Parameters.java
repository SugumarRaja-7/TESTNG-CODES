// sugumar
package tesing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Parameters {
	RemoteWebDriver driver;
	@org.testng.annotations.Parameters({"email","password","browser"})
    @Test
	public  void parameters(String email,String password, String browser) {
		switch (browser) {
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "chrome":
			driver=new ChromeDriver();
			break;
		default:
			break;
		}
	  
	
	   System.out.println(email+" "+password);
System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 driver.get("https://letcode.in/");
 driver.findElement(By.linkText("Log in")).click();
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
 driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
 System.out.println("Title is"+driver.getTitle());
 
	
}}
