package testRuns;

 
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 

@CucumberOptions(
		
		features = "src/test/resources/features/page1/",
		glue = {"stepDefinations","hooks"},
		dryRun = false,
		monochrome = true
		)

public class Test_Run_All extends AbstractTestNGCucumberTests{
	
      @Override
      @DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
