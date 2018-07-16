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
        String URL=Testarguments.getUrl();
        //driver.get(URL);
    }
    public void enterUserID(){
        String id=Testarguments.getUserId();
        //WebElement ele=driver.findElement(By.xpath());
        emailid.sendKeys(id);

    }
    public void enterUserPass(){
        String pass=Testarguments.getPassword();
        //WebElement ele=driver.findElement(By.xpath("emaiPass"));
        emaiPass.sendKeys(pass);//
//
        //
        //nbzxcbmcxmcxmmnnbmbm
        //love
        //i  love the god nbamsbkb
//Navneet
         
        //
    }
}
