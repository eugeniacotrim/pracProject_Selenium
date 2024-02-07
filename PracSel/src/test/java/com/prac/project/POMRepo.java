package com.prac.project;

import org.openqa.selenium.By;

public class POMRepo {

	public static final String URL = "https://www.amazon.in/";
	public static final String iphone = "iphone 13";

	public static final By prodTypeDrpdwn = By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]");
	public static final By prodTypeElectronics = By.xpath("//option[@value=\"search-alias=electronics\"]");
	public static final By srchBar = By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	public static final By NthProd = By.xpath("(//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"])[10]");
	public static final By srchBttn = By.xpath("//input[@id=\"nav-search-submit-button\"]");
	
}
