import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GirSomnathHomeStay {
    @Test
    public void girSomnathHomeStay1 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-najabhai-karshanbhai-barad/b.jpg\"]")).click();

    }

    @Test
    public void girSomnathHomeStay2 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-bavachandbhai-bhurabhai-parmar/2.jpg\"]")).click();
    }

    @Test
    public void girSomnathHomeStay3 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mrs-kantaben-ratilalbhai-gadhesariya/b.jpg\"]")).click();
    }

    @Test
    public void girSomnathHomeStay4 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-rameshbhai-nathubhai-hadiya/b.jpg\"]")).click();
    }
    @Test
    public void girSomnathHomeStay5 () {
        WebDriver driver = new ChromeDriver();
        driver.get("");
    }
}
