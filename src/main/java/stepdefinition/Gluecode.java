package stepdefinition;

import Testbase.InitilizeWebdrivers;
import Testbase.Testarguments;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import pages.Home;
import pomcommon.Log;
import utility.ResourceHelper;

public class Gluecode {
    Home page;
    WebDriver driver;
    InitilizeWebdrivers init;
    WebDriver x;

@Before
public void setUp(){
    init=new InitilizeWebdrivers(driver);
    x= init.getBrowser("chrome");
    page=new Home(x);

}

    @Given("^I go to the page$")
    public void iGoToThePage() throws Throwable {

      page.login();

    }
    @Then("^I go login to the facebook page$")
    public void iGoLoginToTheFacebookPage() throws Throwable {
      page.enterUserID();
    }

    @Then("^I enter user pass$")
    public void iEnterUserPass() throws Throwable {
     page.enterUserPass();
    }
    @After
    public void tearDown(Scenario scenario){

    x.quit();

    }


}
