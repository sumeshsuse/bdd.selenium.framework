package manager;

import org.openqa.selenium.WebDriver;
import pageobject.LoginPageObject;

public class Pagemanager {

    public WebDriver driver;
    public LoginPageObject loginPageObject;

    public Pagemanager(WebDriver driver){
       this.driver = driver;
    }

    public LoginPageObject getLoginPageObject(){
        return (loginPageObject == null) ? loginPageObject = new LoginPageObject(driver) : loginPageObject;
    }
}
