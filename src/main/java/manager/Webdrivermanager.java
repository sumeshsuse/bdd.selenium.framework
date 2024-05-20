package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdrivermanager {

    public WebDriver driver;

    public WebDriver initializeWebDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        return (driver == null) ? driver = new ChromeDriver(chromeOptions) : driver;
    }
}
