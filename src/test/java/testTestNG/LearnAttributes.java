package testTestNG;

import org.testng.annotations.Test;

//annotations always run with a ASCII values
// it will run based on the priority
//@test is annotaion
//priority is an attribute
//- value will runs first 
// if no priority is given it takes priority as 0 
//if no priority is given for two tests it will taken as an AsCII order 

public class LearnAttributes {
	
	@Test(priority = 2)
	public void signup() {
		System.out.println("Signup");
	}
	
	@Test(priority = 1)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("Search product");
	}
	
	@Test(priority = 4)
	public void addtocart() {
		System.out.println("add to cart");
	}
	
	@Test(priority = -5)
	public void placeorder() {
		System.out.println("placeorder");
	}
}
