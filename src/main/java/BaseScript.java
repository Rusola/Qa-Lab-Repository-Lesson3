import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseScript {

    public static EventFiringWebDriver getDriver(String brouser) {
        switch (brouser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
                EventFiringWebDriver driver=new EventFiringWebDriver(new ChromeDriver());
                driver.register(new EventHandler());
                return driver;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver 2");
                EventFiringWebDriver driverF=new EventFiringWebDriver(new FirefoxDriver());
                driverF.register(new EventHandler());
                return driverF;
            case "safari": EventFiringWebDriver driverS=new EventFiringWebDriver(new SafariDriver());
                driverS.register(new EventHandler());
                return driverS;
            default:System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
                EventFiringWebDriver driverD=new EventFiringWebDriver(new ChromeDriver());
                driverD.register(new EventHandler());
                return driverD;
        }

//    public static EventFiringWebDriver getConfigDriver(){
//        WebDriver driver=getDriver();
//        EventFiringWebDriver webDriver=new EventFiringWebDriver(driver);
//        webDriver.register(new EventHandler());
//        return webDriver;
//    }

    }
}



