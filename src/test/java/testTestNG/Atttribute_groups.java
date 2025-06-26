package testTestNG;

import org.testng.annotations.Test;

//configure a group in xml => learngroups
//include will run all the included Groups
//exclude will remaining all the test cases

//include and exclude la orey group name kodutha eduhuvumey odathu actually
//include always have a high preferences 
public class Atttribute_groups {
	
	@Test(groups = {"regression"})
	public void signup() {
		System.out.println("signup");
	}
	
	
	@Test(groups = {"sanitary"})
	public void login() {
		System.out.println("login");
	}
	
	
	@Test(groups = {"smoke"})
	public void searchProduct() {
		System.out.println("Search product");
	}
	
	public void addtocart() {
		System.out.println("Add to cart");
	}
	
	@Test(groups = {"smoke"})
	public void researchProduct() {
		System.out.println(" re Search product");
	}
}
