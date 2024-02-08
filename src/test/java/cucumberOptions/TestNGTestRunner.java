package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features"
,glue="stepDefinitions"
,dryRun=false
,plugin= {"pretty"
		,"html:target/Output.html"
		,"json:target/Output.json"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		,"rerun:target/failed_testCases.txt"}
,monochrome=true
,tags="@OffersPage or @PlaceOrder")

public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
