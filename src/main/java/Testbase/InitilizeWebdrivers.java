package Testbase;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import pages.Home;
import pomcommon.Log;
import utility.ResourceHelper;


public class InitilizeWebdrivers {
    WebDriver driver;
    public InitilizeWebdrivers(WebDriver driver){
        this.driver=driver;
    }

    public  WebDriver getBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
             DesiredCapabilities cap=DesiredCapabilities.chrome();
             cap.setCapability("marionette",true);
            ChromeOptions op=new ChromeOptions();
            //op.setHeadless(true);

             System.setProperty("webdriver.chrome.driver",ResourceHelper.getResourcePath("drivers/chromedriver.exe"));
             driver=new ChromeDriver();
             String url=Testarguments.getUrl();
             driver.get(url);

        }
        return driver ;
    }
}







