package iosSimTests.util;


import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

import iosSimTests.util.Reporting;

public class TestListener extends RunListener {
	
	Reporting report=new Reporting();
	
	public void testRunFinished(Result result) {
		report.gernateReport();
		report.zipReports();
	}

}
