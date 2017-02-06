package iosSimTests.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.io.Zip;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Reporting {
	
	public void gernateReport()
	{
		File reportOutputDirectory = new File("reports/formatted");
		List<String> jsonFiles = new ArrayList<String>();
		String buildNumber = "1";
		String projectName = "iOS Simulator Tests";
		boolean runWithJenkins = false;
		boolean parallelTesting = false;
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		//jsonFiles.add("reports/json/result1.json");
		jsonFiles.add("reports/json/result.json");
		// optional configuration
		configuration.setParallelTesting(parallelTesting);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform Name", "iOS");
		configuration.addClassifications("Platform Version", "9.0");
		configuration.addClassifications("Device Name", "iPhone 6 Simulator");
		
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		@SuppressWarnings("unused")
		Reportable result = reportBuilder.generateReports();
		
	}
	
	public void zipReports()
	{
		Zip zip = new Zip();
        try {
        	if(new File("reports.zip").exists())
        	new File("reports.zip").delete();
            zip.zip(new File("reports/html/result.html"), new File("reports.zip"));
        } catch (IOException e) {
            e.printStackTrace();
}
	}

}
