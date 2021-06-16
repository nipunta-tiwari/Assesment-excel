package com.cognixia.training.MavenTestNGSelenium;
import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cognixia.training.MavenTestNGSelenium.common.Base1;
public class ScreenshotExample extends Base1 {

	public static void main(String[] args) throws IOException {
		openBrowser("Firefox");
		driver.get("https://flipkart.com");
		File f;
	  f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("/Screenshots/fitbit.jpg"));
}


	}


