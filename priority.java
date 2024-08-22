//depends on method
package tesing;
import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class priority {
	@Test
	public void signin() {
		System.out.println("sign in");
	}
	
	@Test (dependsOnMethods ="signin") 
	public void login() {
		System.out.println("log in");
	}
	
	@Test (dependsOnMethods ="login")
	public void searchproduct() {
		System.out.println("search product");
	}
	
@Test( dependsOnMethods ="searchproduct" )
	public void addtocart() {
		System.out.println("add to cart");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods ="addtocart")
	public void logout() {
		System.out.println("log out");
	}
	

}
