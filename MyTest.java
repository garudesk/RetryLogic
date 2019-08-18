//it is Retry logic = when any test case if fail tjen it will allow us to re-execute it any number of times//
//how to implement this logic = 
//1.create main class and under this we have number of methods....like in  our demo = "MyTest.java" file// 
//2.create one RetryAnalyser class utility like in our demo = "RetryAnalyser.java"//
//3.create one Transform interface for invoking this logic to all test cases like = "TransformerAnalyser.java"
//4.create one xml file to execute these all classes like = RetryAnalyser.xml
//All these files are available in the "RetryLogic" Package

package RetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
 
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(12, 15);
	}
	
	
	

}
