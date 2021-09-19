package week5.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeafTapsTests extends BaseClass1 {
	
	 @Test
	  public void test1() {
		 
		  System.out.println("Test1");
		  
	  }
	 
	 @BeforeClass
	 public void beforeClass() {
		 
		  System.out.println("beforeClass");
		  
	  }

}
