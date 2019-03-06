package retryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter =0;
	int countLimit = 3;
	public boolean retry(ITestResult result) {
	    if(counter < countLimit){
	    	counter++;
	    	return true;
	    }
		return false;
	}

}
