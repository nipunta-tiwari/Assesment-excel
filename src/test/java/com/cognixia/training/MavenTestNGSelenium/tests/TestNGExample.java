package com.cognixia.training.MavenTestNGSelenium.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
@Test
	public void testFirst() {
System.out.println("Inside test first: ");
	}
@BeforeTest 
public void setup() {
	System.out.println("Inside setup");
}
@AfterTest
public void teardown() {
	System.out.println("Inside teardown");
}
@Test
public void testsecond() {
	System.out.println("Inside testsecond");
}
}
