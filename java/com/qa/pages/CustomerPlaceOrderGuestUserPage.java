package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;

public class CustomerPlaceOrderGuestUserPage {
	@SuppressWarnings("rawtypes")
    public AndroidDriver driver;	

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    private WebElement shoppingCartBtn;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")
    private WebElement checkoutBtn;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    private WebElement checkoutGuistBtn;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    private WebElement firstNameField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    private WebElement lastNameField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    private WebElement emailField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")
    private WebElement selectCountryBtn;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    private WebElement selectBangladdesh;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")
    private WebElement stateBtn;
    
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    private WebElement selectState;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")
    private WebElement companyField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCity")
    private WebElement cityField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    private WebElement stressAddressField1;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2")
    private WebElement stressAddressField2;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    private WebElement zipCodeField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etPhone")
    private WebElement numberField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFax")
    private WebElement faxField;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    private WebElement continueBtn;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[4]")
    private WebElement nextDayAitBtnBtn;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    private WebElement continueBtn2;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[4]")
    private WebElement checkMoneyOrderBtn;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    private WebElement continueBtn3;
    
    @FindBy(className = "android.widget.Button")
    private WebElement continueBtn4;
    
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    private WebElement nextBtn;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private WebElement ordersuccessHeading;
    
    
   
    
    @SuppressWarnings("rawtypes")
    public CustomerPlaceOrderGuestUserPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  
    public void CustomerPlaceOrderGuestUserWithAllMendatoryField(String firstNameText, String lastNameText, String emailText, String companyNameText, String cityNameText, String address1Text, 
    		String address2Text, String zipText, String numberText, String faxText) throws InterruptedException {
    	shoppingCartBtn.click();
        Thread.sleep(5000);
        Thread.sleep(2000);
        checkoutBtn.click();
        Thread.sleep(2000);
        checkoutGuistBtn.click();
        Thread.sleep(5000);
        firstNameField.sendKeys(firstNameText);
        Thread.sleep(2000);
        lastNameField.sendKeys(lastNameText);
        Thread.sleep(2000);
        emailField.sendKeys(emailText);
        Thread.sleep(2000);
        selectCountryBtn.click();
        Thread.sleep(5000);
        selectBangladdesh.click();
        Thread.sleep(5000);
        stateBtn.click();
        Thread.sleep(5000);
        selectState.click();
        Thread.sleep(2000);
        companyField.sendKeys(companyNameText);
        Thread.sleep(2000);
        cityField.sendKeys(cityNameText);
        Thread.sleep(2000);
        stressAddressField1.sendKeys(address1Text);
        Thread.sleep(2000);
        stressAddressField2.sendKeys(address2Text);
        Thread.sleep(2000);
        zipCodeField.sendKeys(zipText);
        Thread.sleep(2000);
        numberField.sendKeys(numberText);
        Thread.sleep(2000);
        faxField.sendKeys(faxText);
        Thread.sleep(2000);
        continueBtn.click();
        Thread.sleep(5000);
        nextDayAitBtnBtn.click();
        Thread.sleep(5000);
        continueBtn2.click();
        Thread.sleep(5000);
        checkMoneyOrderBtn.click();
        Thread.sleep(2000);
        continueBtn3.click();
        Thread.sleep(5000);
        continueBtn4.click();
  
        Thread.sleep(5000);
    }
    public String retrieveOrderSuccessPageHeading() {
        return ordersuccessHeading.getText();
    }
}
