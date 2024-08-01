package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\psjey\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\features\\fblogin.feature",
glue="org.step")
public class steprunnerclass {
	public static void main(String[] args) {
		
	}

}
