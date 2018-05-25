package pages;

import Testbase.Testarguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pomcommon.Log;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class Home {
    @FindBy(xpath = ".//*[@id='email']")
     private WebElement emailid;
    @FindBy(xpath = ".//*[@id='pass']")
    private WebElement emaiPass;

    WebDriver driver;
    public Home(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(){
        Log.info("==============="+Thread.currentThread().getStackTrace()[1].getMethodName()+"====================");
        LOGGER.info("In login method");
        String URL=Testarguments.getUrl();
        //driver.get(URL);
    }
    public void enterUserID(){
        Log.info("==============="+Thread.currentThread().getStackTrace()[1].getMethodName()+"====================");
        LOGGER.info("On the page");
        String id=Testarguments.getUserId();
        //WebElement ele=driver.findElement(By.xpath());
        emailid.sendKeys(id);

    }
    public void enterUserPass(){
        Log.info("==============="+Thread.currentThread().getStackTrace()[1].getMethodName()+"====================");
        LOGGER.info("On the page");
        String pass=Testarguments.getPassword();
        //WebElement ele=driver.findElement(By.xpath("emaiPass"));
        emaiPass.sendKeys(pass);
    }
}
