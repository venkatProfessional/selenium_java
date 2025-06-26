package learnAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
//default behaviour of testNG
//learnAnnotations.TestNGFflow
//beforeSuite0 ms
//beforeTest12 ms
//beforeClass21 ms
//beforeMethod29 ms
//MyTest30 ms
//afterMethod37 ms
//afterClass38 ms
//afterTest40 ms
//afterSuite
// 10 vaati @test potalumn before method after method exeute aagum
//before calss kum before method kum nadula run aagum

public class TestNGFflow {
  @Test
  public void MyTest1() {
	  System.out.println("Mytest1");
  }
  
  @Test
  public void MyTest2() {
	  System.out.println("Mytest2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}


//when have 2 @test annotation
//beforeSuite0 ms
//beforeTest11 ms
//beforeClass22 ms
//beforeMethod29 ms
//MyTest130 ms
//afterMethod38 ms
//beforeMethod39 ms
//MyTest240 ms
//afterMethod42 ms
//afterClass42 ms
//afterTest44 ms
//afterSuite