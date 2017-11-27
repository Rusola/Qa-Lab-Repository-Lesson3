import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

public class DashboardPage {
    private EventFiringWebDriver driver;
    private  WebDriverWait wait;

    public DashboardPage(EventFiringWebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,30);
    }

    public By catalog=By.linkText("Каталог");
    public By categories=By.cssSelector("#subtab-AdminCategories>a");
    public By addButtun=By.cssSelector("#page-header-desc-category-new_category > i");
    public By newCategoryField=By.id("name_1");
    public By saveButton=By.className("process-icon-save");
    public By message=By.cssSelector("#content > div:nth-child(4) > div");
    public By filterField=By.name("categoryFilter_name");
    public By locatorSearchButton=By.id("submitFilterButtoncategory");
    public By locatorCheck=By.cssSelector("#tr_2_15_2 > td:nth-child(3)");

    public void login () throws InterruptedException {
        driver.get(Properties.DEFAULT_BASE_ADMIN_URL);
        WebDriverWait wait =new WebDriverWait(driver, 10);
        wait.until((WebDriver d)->d.findElement(Properties.locatorLogin));
//        wait =new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Properties.locatorLogin));
        driver.findElement(Properties.locatorLogin).sendKeys(Properties.ADMIN_LOGIN);
        driver.findElement(Properties.locatorPass).sendKeys(Properties.ADMIN_PASSWORD);
        driver.findElement(Properties.locatorSubmit).click();
    }
    public void hoverOverCatalog(){
        WebElement thisCatalog=driver.findElement(catalog);
        Actions actions=new Actions(driver);
        actions.moveToElement(thisCatalog).build().perform();
    }
    public void clickOnCategories(){
        WebDriverWait wait =new WebDriverWait(driver, 10);
        wait.until((WebDriver d)->d.findElement(categories));
        driver.findElement(categories).click();
    }
    public void clickOnAddButton(){
        driver.findElement(addButtun).click();
    }
    public void fillNewCatField(){
        driver.findElement(newCategoryField).sendKeys(Properties.NEW_CATEGORY);
    }
    public void waitForContentLoad(By element) {
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void clickOnSaveButton() {
        driver.findElement(saveButton).click();
    }
    public void assertMessage() {
        WebElement confirmationMessage=driver.findElement(message);
        Assert.that(confirmationMessage.isDisplayed(),"Confirmation message is not displayed");
        String messageWord=confirmationMessage.getAttribute("innerText");
        if(messageWord.equalsIgnoreCase("× Создано")){
            System.out.println("Confirmation message is correct");
        } else{
                System.out.println("Confirmation message is not correct");
            }
        }

        public void checkSorting(){
        driver.findElement(filterField).sendKeys(Properties.NEW_CATEGORY);
        driver.findElement(locatorSearchButton).click();

        WebElement checkSpot=driver.findElement(locatorCheck);
        String check=checkSpot.getAttribute("innerText");
        Assert.that(check.equalsIgnoreCase(Properties.NEW_CATEGORY),"отфильтровано не верно");
        }
}
