import gt.ScrapData;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class KeralaHomeStay {
    @Test
    public void homeStay() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.keralatourism.org/homestay");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(9000);
        int total = driver.findElement(By.id("container12")).findElements(By.tagName("li")).size();
        List<WebElement> cards = driver.findElement(By.id("container12")).findElements(By.tagName("li"));
        for (WebElement webElement : cards) {
            webElement.click();
            driver.navigate().back();
        }
        System.out.println(total);
        driver.close();
    }}


