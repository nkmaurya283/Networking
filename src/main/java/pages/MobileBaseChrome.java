package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.ResourceHelper;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileBaseChrome {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Demo");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        System.setProperty("webdriver.chrome.driver","E:\\downloads\\Compressed\\Selenium jars\\chromedriver.exe");
        driver=new AndroidDriver<AndroidElement>(new URL("http://192.168.11.1:4723/wd/hub"),capabilities);
        return driver;
    }
}
