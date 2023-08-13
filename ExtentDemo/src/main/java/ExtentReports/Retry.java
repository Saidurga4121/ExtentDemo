package ExtentReports;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
	int count=0;
	// maxiumum number of times u r asking a testcase to run 
	int maxRetry=2;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(count<maxRetry)
		{
			count++;
			return true;
		}
		return false;
	}
	
	
}
