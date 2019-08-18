package RetryLogic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryAnalyzer implements IRetryAnalyzer{

	
	int counter = 0;
	int retryLimit = 3;
	
	
	
	public boolean retry(ITestResult result){
		if(counter < retryLimit){
			counter++;
			return true;
		}
		return false;
	}
	
	
	
}