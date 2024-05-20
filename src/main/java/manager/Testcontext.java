package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcontext {

    public WebDriver driver;
    public Pagemanager pagemanager;

    public Testcontext(){
       Webdrivermanager webdrivermanager = new Webdrivermanager();
       pagemanager = new Pagemanager(webdrivermanager.initializeWebDriver());
    }

    public Pagemanager getPagemanager(){
        return pagemanager;
    }

}
