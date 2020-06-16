package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import io.restassured.RestAssured;
import restassuredFramework.utils.ExtentReportListner;
@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner {
	
	@BeforeClass
	public void basetest() {
		
	//System.out.println(Fileandenv.envAndFile().get("serverUrl"));	
		//test.log(LogStatus.INFO, "test has been startyed....");
		//test.log(LogStatus.PASS, "test has been pass");
		
		RestAssured.baseURI="http://localhost:3000/";
				
				
				
				
				//"http://localhost:3000";
		
	}
	

}
