package CitizensAdvice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchPage extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

@Test
    public void userIsOnGoogleSearchPage(){
    browserSelector.selectBrowser();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Citizens Advice");
        driver.findElement(By.xpath("//center/input[contains(@value,'Google Search')]")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();

    try {
        Thread.sleep(3);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//     driver.quit();
    }

}
