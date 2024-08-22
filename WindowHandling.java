   package tesing;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;  

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	@Test
        public  void windowhandling() {
                System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://letcode.in/windows");
       String windowhandle= driver.getWindowHandle();
       System.out.println("First Window"+windowhandle);
        driver.findElement(By.id("home")).click();
        Set<String> windowHandles=driver.getWindowHandles();
        System.out.println(windowHandles);
        List<String> list=new ArrayList(windowHandles);
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(list.get(0));
        driver.close();
        Set<String> windowHandles2=driver.getWindowHandles();
        list.clear();
        list.addAll(windowHandles2);
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getCurrentUrl());
        driver.quit();

       
        }}
