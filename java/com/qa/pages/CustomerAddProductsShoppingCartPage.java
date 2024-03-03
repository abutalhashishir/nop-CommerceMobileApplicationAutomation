package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class CustomerAddProductsShoppingCartPage {
    
    @SuppressWarnings("rawtypes")
    public AndroidDriver driver;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    private WebElement readaAcceptBtn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"NopStation Cart\"]")
    private WebElement categoriesBtn;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[4]")
    private WebElement electronicsBtn;
    
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement mattressBedroomProductDetailsBtn;
    
    @FindBy(xpath = "//*[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnPlus']")
    private WebElement increaseProductBtn;
    
    @FindBy(xpath = "//*[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart']")
    private WebElement addToCartBtn;
    
    @FindBy(xpath = "//*[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/counterText']")
    private WebElement addToCartSuccessHeading;
    
    @SuppressWarnings("rawtypes")
    public CustomerAddProductsShoppingCartPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  
    public void CustomerAddProductsShoppingCartWithMendatoryField() throws InterruptedException {
        readaAcceptBtn.click();
        Thread.sleep(5000);
        categoriesBtn.click();
        Thread.sleep(5000);
        electronicsBtn.click();
        Thread.sleep(5000);
        
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(mattressBedroomProductDetailsBtn));
        element2.click();
        
        // Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(increaseProductBtn));
        
        element.click();
        Thread.sleep(5000);
        addToCartBtn.click();   
        Thread.sleep(5000);
    }
    public String retrieveAddToCartSuccessPageHeading() {
        return addToCartSuccessHeading.getText();
    }
   
}
