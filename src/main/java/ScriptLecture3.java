import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

import java.util.concurrent.TimeUnit;

public class ScriptLecture3 extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        EventFiringWebDriver driver = getDriver("safari");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        DashboardPage dashboardPage = new DashboardPage(driver);

        dashboardPage.login();
        dashboardPage.waitForContentLoad(dashboardPage.catalog);
        dashboardPage.hoverOverCatalog();
        dashboardPage.clickOnCategories();
        dashboardPage.waitForContentLoad(dashboardPage.addButtun);
        dashboardPage.clickOnAddButton();
        dashboardPage.fillNewCatField();
        dashboardPage.clickOnSaveButton();
        dashboardPage.assertMessage();
        dashboardPage.checkSorting();
        driver.quit();
    }

}
