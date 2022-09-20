import gt.ScrapData;
import gt.csv.*;
import gt.csv.formatter.GujratTourismDataFormatter;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    class AhmedabadHomeStay {

    @Test
    void  testgujrathomestay() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");

       int total =  driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div[10]/div/div[2]/div")).size();
        List<WebElement> totalCards = driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div[10]/div/div[2]/div"));

        ArrayList<ScrapData> homestays = new ArrayList<>();
        for (WebElement webElement: totalCards) {
            webElement.click();
            var res = fetchBusinessDetails(driver);
            homestays.add(res);
            driver.navigate().back();
        }
        ScrapDataCsv.createCsv(homestays, new GujratTourismDataFormatter());

        System.out.println("Data fetched for: "+ homestays.size()+"/"+totalCards.size());
        System.out.println("Data fetched for: "+ homestays.size()+"/"+totalCards.size());
    }

    private ScrapData fetchBusinessDetails(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Map<String, Object> params = new HashMap<>();
        WebElement infoContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div/div[1]")));
        List<WebElement> infoContainerElements = infoContainer.findElements(By.tagName("p"));
        try {
            String title = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[1]/div/h1")).getText();
            params.put("title", title);
            WebElement addressElement = infoContainerElements.get(0);
            String address = addressElement.getText();
            params.put("address", address.split(":")[1]);
            WebElement contactElement = infoContainerElements.get(1);
            String[] contacts = contactElement.getText().split("\n");
            for (String contact: contacts) {
                String[] pair = contact.split(":");
                params.put(pair[0], pair[1]);
            }
        } catch (ArrayIndexOutOfBoundsException aox) {
            System.out.println("Error: "+ aox.getMessage());
        }
       // driver.close();
        ScrapData scrapData = new ScrapData();
        scrapData.setParams(params);
        return scrapData;
    }
   }

