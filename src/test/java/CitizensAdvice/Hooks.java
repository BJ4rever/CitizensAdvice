package CitizensAdvice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("www.google.co.uk");
    }

    @AfterMethod
    public void closeBrowser(){

        driver.quit();
    }
}
