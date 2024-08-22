// sugumar
package tesing;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Invocaioncount {
	@Test(invocationCount = 3,invocationTimeOut = 20000)
    public  void findelement() {
                 System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://www.google.com/");
 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cricket",Keys.ENTER);
 List<WebElement>cricket= driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
int size=cricket.size();
System.out.println("Total No. of Cricket is = "+size);
driver.quit();
    }

}
