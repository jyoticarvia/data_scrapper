import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DahodHomeStay {
    @Test
    public void testdahod () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mrs-urvashidevi-jaydipsinh-maharaul-ms-ambika-kumari/b.jpg\"]")).click();
    }
}
