package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pomcommon.Log;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class Home {

    WebDriver driver;
    public Home(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(){
        Log.info("==============="+Thread.currentThread().getStackTrace()[1].getMethodName()+"====================");
        LOGGER.info("In login method");

    }
}
