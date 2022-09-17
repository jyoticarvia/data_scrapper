import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DevbhoomiDwarkaHomeStay {

    @Test
    public void devbhoomidwarkahomesty1 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-kirtikumar-chandrakant-dave/b.jpg\"]")).click();
    }


    @Test
    public void devbhoomidwarkahomestay2 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/accomodation/homestay/kishorbhai-kakubhai-davda/b.jpg\"]")).click();
    }
}
