import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangHomeStay {
    @Test
    public void testhomestay1 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-adil-salimbhai-noorani/b.jpg\"]")).click();
    }

    @Test
    public void danghomestay2 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-ranjitbhai-gulabbhai-patel/b.jpg\"]")).click();

    }

    @Test
    public void danghomestay3 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-jitendrakumar-ishwarlal-gandhi/b.jpg\"]")).click();
    }

    @Test
    public void danghomestay4 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mrs-muniraben-salimbhai-noorani/b.jpg\"]")).click();
    }

    @Test
    public void danghomestay5 () {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-piyushkumar-ramjibhai-patel/b.jpg\"]")).click();
    }

    @Test
    public void danghomestay6 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mr-pareshkumar-ramjibhai-patel/b.jpg\"]")).click();
    }

    @Test
    public void danghomestay7 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mrs-sunandaben-tukarambhai-kardile/b.jpg\"]")).click();
    }
}
