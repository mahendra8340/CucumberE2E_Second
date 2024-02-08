package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="@target/failed_testCases.txt"
,glue="stepDefinitions"
,dryRun=false
,plugin= {"pretty"
		,"html:target/Output.html"
		,"json:target/Output.json"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
,monochrome=true
)

public class FailedTestNGTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
