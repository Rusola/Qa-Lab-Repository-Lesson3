import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.EventListener;

public class EventHandler implements WebDriverEventListener{

    public void beforeAlertAccept(WebDriver webDriver) {

    }

    public void afterAlertAccept(WebDriver webDriver) {

    }

    public void afterAlertDismiss(WebDriver webDriver) {

    }

    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Open URL "+s);

    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("URL "+s+"is successfully opened");

    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {

    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Search for element: "+by.toString());

    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Element "+webElement.getText()+ "is found successfully");

    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Click on element: "+webElement.getTagName()+" "+ webElement.getAttribute("name")+webElement.getAttribute("innerText"));

    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Element is successfully clicked");

    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void beforeScript(String s, WebDriver webDriver) {

    }

    public void afterScript(String s, WebDriver webDriver) {

    }

    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}
