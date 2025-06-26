package testTestNG;

import org.testng.annotations.Test;

public class SmokeSanityWithPriority {

	// Smoke test with highest priority (lowest number)
	@Test(priority = -10)
	public void smokeTest() {
		System.out.println("✅ Running Smoke Test");

		// Simulating a failure
		throw new RuntimeException("❌ Smoke test failed");
	}

	// Sanity test should run only if smoke test passes
	@Test(priority = -5, dependsOnMethods = "smokeTest")
	public void sanityTest() {
		System.out.println("✅ Running Sanity Test");
	}

	// Other test with normal priority
	@Test(priority = 0)
	public void loginTest() {
		System.out.println("✅ Running Login Test");
	}

	// Another test with higher priority number
	@Test(priority = 5)
	public void logoutTest() {
		System.out.println("✅ Running Logout Test");
	}
}


//theory explanation of smoke and sanitary

//After deploying an e-commerce site, testers do Smoke Testing to check if login, search, and checkout work.
//If login fails, the build is rejected immediately — no further testing is done.
//Later, a bug in the coupon code is fixed, so testers do a Sanity Test just to check if the coupon works now.
//They don’t test everything again — only the part related to the fix.
