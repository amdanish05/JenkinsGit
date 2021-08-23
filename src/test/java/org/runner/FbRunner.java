package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.ReportGeneartionsss;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//resources//fb.feature"},glue= {"org.stepdef"},monochrome=true,snippets=SnippetType.CAMELCASE,
plugin= {"pretty",
		
		"json:C:\\Users\\ELCOT\\eclipse-workspace\\CucumberGit\\target\\Prabhu\\p.json"})

public class FbRunner {
	
	
	
		
		@AfterClass
		public static void afterclass() {
			ReportGeneartionsss.generateJvmReport("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\CucumberGit\\\\target\\\\Prabhu\\\\p.json");
		}
	}

