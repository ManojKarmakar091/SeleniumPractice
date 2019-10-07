package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
@Test

public void loginTest(){
	
	System.out.println("login Test");
	
	
}

@Test(dependsOnMethods="loginTest")

public void HomePageTest(){
	
	System.out.println("Home Page Test");
}

public void SearchPageTest(){
	
	System.out.println("Search Page Test");
}

}
