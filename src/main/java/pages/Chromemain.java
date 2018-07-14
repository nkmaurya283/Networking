package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Chromemain extends MobileBaseChrome{


    public static void main(String args[])throws MalformedURLException {

        AndroidDriver<AndroidElement> driver=capabilities();
        driver.get("https://google.com");
        System.out.println("");
        System.out.println();
    }
}
