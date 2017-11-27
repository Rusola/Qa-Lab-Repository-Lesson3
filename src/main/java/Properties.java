import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Properties {
    public static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    public static final String ADMIN_LOGIN = "webinar.test@gmail.com";
    public static final String ADMIN_PASSWORD = "Xcg7299bnSmMuRLp9ITw";

    public static EventFiringWebDriver driver;
    public static By locatorLogin=By.id("email");
    public static By locatorPass=By.name("passwd");
    public static By locatorSubmit=By.name("submitLogin");

    public static final String NEW_CATEGORY="пальто";


}
