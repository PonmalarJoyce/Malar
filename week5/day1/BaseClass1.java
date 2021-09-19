package week5.day1;

import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	
	 @BeforeMethod
	  public void beforeMethod1() {
		  
		  System.out.println("Before Method1");
	  }

	 @BeforeMethod
	  public void beforeMethod2() {
		  
		  System.out.println("Before Method2");
	  }

}
