package testTestNG;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

//annotations always run with a ASCII values
// it will run based on the priority
//@test is annotaion
//priority is an attribute
//- value will runs first 
// if no priority is given it takes priority as 0 
//if no priority is given for two tests it will taken as an AsCII order 

//even if priority is 1 
//test Ng always gaves the first proprity to depends on method
// depends on method vanthu priority a supress pannidum 

public class LearnAttributes {
	
	@Test(priority = 2)
	public void signup() {
		System.out.println("Signup");
	}
	
//	depnends on method naa ithu nadatha aparam than ithu nadakanum nu sollanum
	@Test(priority = 1,dependsOnMethods = "signup")
	public void login() {
		System.out.println("login");
	}
	
//	what if the dependend method fail we need to throw an error
//	Skips: 1 it skips when it dependent on other
	
	@Test(priority = 3,dependsOnMethods = "login")
	public void searchProduct() {
		

		System.out.println("Search product");
		throw new RuntimeErrorException(null);
	}
	
	@Test(priority = 4,dependsOnMethods = "searchProduct")
	public void addtocart() {
		System.out.println("add to cart");
	}
	
	@Test(priority = -5)
	public void placeorder() {
		System.out.println("placeorder");
	}
}
