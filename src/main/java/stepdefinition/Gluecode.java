package stepdefinition;

import Testbase.InitilizeWebdrivers;
import Testbase.Testarguments;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import pages.Home;
import utility.ResourceHelper;

public class Gluecode {
    Home page;
    WebDriver driver;
    InitilizeWebdrivers init;

@Before
public void setUp(){
    init=new InitilizeWebdrivers();
    init.getBrowser("chrome");
    page=new Home(driver);

}

    @Given("^I go to the page$")
    public void iGoToThePage() throws Throwable {

      page.login();

    }
}
