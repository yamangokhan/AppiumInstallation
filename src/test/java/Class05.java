import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Class05 {

    @Test
    public void class03() throws InterruptedException, MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_02");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\OKAN YAMAN\\IdeaProjects\\AppiumInstallation\\Calculator.apk");
        //desiredCapabilities.setCapability("appPackage", "com.android.vending");
        //desiredCapabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(5000);

        driver.findElementById("com.google.android.calculator:id/digit_1").click();
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementById("com.google.android.calculator:id/op_mul").click();
        driver.findElementById("com.google.android.calculator:id/digit_3").click();


        int expectedData = 45;
        int actualData = Integer.parseInt(driver.findElementById("com.google.android.calculator:id/result_preview").getText());
        System.out.println("yazılı text nedir? " + actualData);
        Assert.assertEquals(actualData, expectedData);

        ////////2ND WAY TO SOLVE \\\\\\\\\\\\\\\
        AndroidElement num0 = driver.findElementById("com.google.android.calculator:id/digit_0");
        AndroidElement num1 = driver.findElementById("com.google.android.calculator:id/digit_1");
        AndroidElement num2 = driver.findElementById("com.google.android.calculator:id/digit_2");
        AndroidElement num3 = driver.findElementById("com.google.android.calculator:id/digit_3");
        AndroidElement num4 = driver.findElementById("com.google.android.calculator:id/digit_4");
        AndroidElement num5 = driver.findElementById("com.google.android.calculator:id/digit_5");
        AndroidElement num6 = driver.findElementById("com.google.android.calculator:id/digit_6");
        AndroidElement num7 = driver.findElementById("com.google.android.calculator:id/digit_7");
        AndroidElement num8 = driver.findElementById("com.google.android.calculator:id/digit_8");
        AndroidElement num9 = driver.findElementById("com.google.android.calculator:id/digit_9");

        AndroidElement carpmaIslemi = driver.findElementByAccessibilityId("multiply");
        AndroidElement cıkarmaIslemi = driver.findElementByAccessibilityId("minus");
        AndroidElement toplaIslemi = driver.findElementByAccessibilityId("plus");
        AndroidElement bolmeIslemi = driver.findElementByAccessibilityId("divide");
        AndroidElement esittir = driver.findElementByAccessibilityId("equals");

        num1.click();
        num5.click();
        carpmaIslemi.click();
        num3.click();
        esittir.click();
        Thread.sleep(2000);

        String expectedNumber= driver.findElementById("com.google.android.calculator:id/result_preview").getText();
        String actualNumber = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualNumber,expectedNumber);


    }
}
