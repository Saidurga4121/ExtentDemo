package Sample;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class Regression 
{
	@BeforeMethod(groups= {"Regression"})
	public void setUp()
	{
		System.out.println("iam Regression");
	}

	
}
