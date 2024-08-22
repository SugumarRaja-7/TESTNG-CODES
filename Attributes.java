// sugumar
//Attributes
package tesing;
import org.testng.annotations.Test;
public class Attributes {
	@Test(enabled = false)
	public void signin() {
		System.out.println("sign in");
	}
	
	@Test(description = "log in success")
	public void login() {
		System.out.println("log in");
		throw new RuntimeException("log in Failed");
	}
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void addtocart() {
		System.out.println("add to cart");
		
	}
	
	
	
	
	
	
	
}
