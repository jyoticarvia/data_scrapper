import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


   public class AhmedabadHomeStay {

    @Test
    public void  testgujrathomestay() {
//        Map<String, String> scrapData = new HashMap<>();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");

       int total =  driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div[10]/div/div[2]/div")).size();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        for (int i=0; i<=total; i++) {


        }


       System.out.println(total);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement infoContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div/div[1]")));
//        List<WebElement> infoContainerElements = infoContainer.findElements(By.tagName("p"));
//        try {
//            String title = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[1]/div/h1")).getText();
//            scrapData.put("title", title);
//            WebElement addressElement = infoContainerElements.get(0);
//            String address = addressElement.getText();
//            scrapData.put("address", address.split(":")[1]);
//            WebElement contactElement = infoContainerElements.get(1);
//            String[] contacts = contactElement.getText().split("\n");
//            for (String contact: contacts) {
//                String[] pair = contact.split(":");
//                scrapData.put(pair[0], pair[1]);
//            }
//        } catch (ArrayIndexOutOfBoundsException aox) {
//            System.out.println("Error: "+ aox.getMessage());

//        }
//        scrapData.forEach((s, s2) -> System.out.println(s+": \t"+s2));
    }

       @Test
       public void ahmedabadhomestay (){

           WebDriver driver=new ChromeDriver();
           driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
           driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-sanjay-jayantilal-shah/b.jpg\"]")).click();

       }


       @Test
       public void homestay() {
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
           driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/accomodation/homestay/pankajbhai-vallabhbhai-patel/b.jpg\"]")).click();
       }

   }

