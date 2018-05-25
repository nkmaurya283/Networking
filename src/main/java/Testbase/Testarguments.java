package Testbase;

import org.openqa.selenium.WebDriver;

public class Testarguments {
    static final String URL="https://facebook.com";
    static final String USER_ID="8208409681";
    static final String USER_PASS="guddu@123456";


    public static String getUrl(){

        return URL;
    }
    public static String getPassword(){

        return USER_PASS;
    }
    public static String getUserId(){

        return USER_ID;
    }
}
