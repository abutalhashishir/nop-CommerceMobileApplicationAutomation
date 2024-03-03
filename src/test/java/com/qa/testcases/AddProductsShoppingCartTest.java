package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.CustomerAddProductsShoppingCartPage;
import com.qa.pages.CustomerPlaceOrderGuestUserPage;

import io.appium.java_client.android.AndroidDriver;

public class AddProductsShoppingCartTest extends Base{
	
	@SuppressWarnings("rawtypes")
	public AndroidDriver driver;

	
	public AddProductsShoppingCartTest() {
		super();
	}
	
	@BeforeClass
	public void initialize() throws InterruptedException {
		driver = initializeDriver();
        Thread.sleep(10000);		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void CustomerAddProductsShoppingCartTest() throws InterruptedException {
		CustomerAddProductsShoppingCartPage customerAddProductsShoppingCartPage = new CustomerAddProductsShoppingCartPage(driver);
		customerAddProductsShoppingCartPage.CustomerAddProductsShoppingCartWithMendatoryField();
		Thread.sleep(5000);
		Assert.assertTrue(customerAddProductsShoppingCartPage.retrieveAddToCartSuccessPageHeading().
				contains(dataProp.getProperty("addToCartSuccessHeadingMessage")), "Add to Cart Product is not displayed");

    }
	@Test(priority = 2, dependsOnMethods = "CustomerAddProductsShoppingCartTest")
    public void CustomerPlaceOrderUsingGuestUserTest() throws InterruptedException {
		CustomerPlaceOrderGuestUserPage customerPlaceOrderGuestUserPage = new CustomerPlaceOrderGuestUserPage(driver);
		customerPlaceOrderGuestUserPage.CustomerPlaceOrderGuestUserWithAllMendatoryField(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"),
				dataProp.getProperty("email"), dataProp.getProperty("companyName"), dataProp.getProperty("cityName"),
				dataProp.getProperty("address1"), dataProp.getProperty("address2"), dataProp.getProperty("zipText"),
				dataProp.getProperty("number"), dataProp.getProperty("fax"));
        Thread.sleep(5000);
        Assert.assertTrue(customerPlaceOrderGuestUserPage.retrieveOrderSuccessPageHeading().
        		contains(dataProp.getProperty("orderSuccessHeadingMessage")), "order success is not displayed");
    }    
}