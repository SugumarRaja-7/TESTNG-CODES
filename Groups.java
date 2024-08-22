// sugumar
package tesing;
import org.testng.annotations.Test;

public class Groups {
	@Test(groups = {"smoke"})
	public void signin() {
		System.out.println("sign in");
	}
	
	@Test (groups = {"r"}) 
	public void login() {
		System.out.println("log in");
	}
	
	@Test (groups = {"sanity"})
	public void searchproduct() {
		System.out.println("search product");
	}
	
@Test(groups = {"smoke"})
	public void addtocart() {
		System.out.println("add to cart");
		
	}
	
	@Test(groups = {"r"})
	public void logout() {
		System.out.println("log out");
	}

}
