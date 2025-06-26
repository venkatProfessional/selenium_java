package testTestNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttruibutes2 {
	
//	if enabled false it is not able to run 
//	@Test(description = "this is used to login ")
	@Test(enabled = false,description = "this is used to login ")
	public void signup() {
		System.out.println("please signup");
	}
	
	
	@Test
	public void login() {
		System.out.println("please login");
		throw new NoSuchElementException();
	}
	
	
//	ithu skip agiruchu enna ithu login naa depend panni iruku
//	,alwaysRun = true Total tests run: 3, Passes: 1, Failures: 1, Skips: 1
//	ipa alwyas run truw nu kudutha adha skip pannathu
//	Total tests run: 3, Passes: 2, Failures: 1, Skips: 0
	@Test(dependsOnMethods = "testTestNG.LearnAttruibutes2.login")
	public void searchProduct() {
		System.out.println("search product");
	}
	
}
