import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Class03 {

    @Test
    public void class03() throws InterruptedException, MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_02");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\OKAN YAMAN\\IdeaProjects\\AppiumInstallation\\Gesture Tool_v1.3_apkpure.com.apk");
        //desiredCapabilities.setCapability("appPackage", "com.android.vending");
        //desiredCapabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(5000);

        driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();
        Thread.sleep(2000);
        driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").sendKeys("yaman");
        driver.findElementById("com.davemac327.gesture.tool:id/gestures_overlay").click();
        driver.findElementById("com.davemac327.gesture.tool:id/done").click();

        Thread.sleep(2000);

        String expectedText = "gokhan";
        String actualText = driver.findElementByXPath("//android.widget.TextView[@text=\"gokhan\"]").getText();
        Assert.assertEquals(actualText, expectedText);
        //driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();


    }
}
