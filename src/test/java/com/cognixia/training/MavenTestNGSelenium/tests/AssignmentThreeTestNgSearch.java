package com.cognixia.training.MavenTestNGSelenium.tests;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cognixia.training.MavenTestNGSelenium.common.ReadFromExcel;

public class AssignmentThreeTestNgSearch  extends TestNGBase{

	@Test (dataProvider = "getDataFromExcel")
	public void myTest(String searchstring, String expectedstring) {
		String searchstrings = searchstring;
		searchbox.sendKeys(searchstrings);
		searchbox.submit();
		Assert.assertEquals(driver.getTitle(), expectedstring);

	}
	
	@DataProvider
	public Object[][] getDataFromExcel() throws IOException {
		return ReadFromExcel.readExcelData("resource/Google.xlsx");
	}
}