package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

    public AndroidDriver<MobileElement> driver;
    public String appiumServer = "127.0.0.1";
    public int appiumPort = 4723;
    URL appiumURL = null;
    public Properties prop;
    public Properties dataProp;

    public Base() {
        prop = new Properties();
        File propFile = new File(System.getProperty("user.dir") + "\\java\\com\\qa\\config\\config.properties");

        dataProp = new Properties();
        File dataPropFile = new File(System.getProperty("user.dir") + "\\java\\com\\qa\\TestData\\OR.properties");

        try {
            FileInputStream dataFis = new FileInputStream(dataPropFile);
            dataProp.load(dataFis);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(propFile);
            prop.load(fis);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public AndroidDriver<MobileElement> initializeDriver() {
        try {
            appiumURL = new URL("http://" + appiumServer + ":" + appiumPort + "/wd/hub");
            this.driver = new AndroidDriver<MobileElement>(appiumURL, setAppCapabilitiesAndroid());
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

    public DesiredCapabilities setAppCapabilitiesAndroid() {
    	DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 11");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        cap.setCapability("adbExecTimeout", 30000);
        cap.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
        cap.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");	

        return cap;
    }
    public String takeScreenShotPath(String testCaseName, AndroidDriver<MobileElement> mobileDriver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) mobileDriver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        // Create the "screenshots" directory if it doesn't exist
        String screenshotsDir = System.getProperty("user.dir") + "/screenshots/";
        new File(screenshotsDir).mkdirs();
        
        String destinationFile = screenshotsDir + testCaseName + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
    }

}
