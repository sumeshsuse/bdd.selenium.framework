package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

   public WebDriver driver;

    public LoginPageObject(WebDriver driver){
      this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void launchURL(){
        System.out.println("Launching the page!" );
        driver.get("https://www.wix.com/features/crm");
    }
}
