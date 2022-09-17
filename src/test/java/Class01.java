import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Class01 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_02");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\OKAN YAMAN\\IdeaProjects\\AppiumInstallation\\etsy.apk");
       // new AndroidDriver(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        URL url = new URL("http:localhost:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);

        Thread.sleep(5000L);
    }
}
