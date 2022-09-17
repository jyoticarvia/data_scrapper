import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmreliHomeStay {
    @Test

    public void amerlihomestay (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/hoestay/mrs-pallaviben-mananbhai-kabaria/b.jpg\"]")).click();
    }
    @Test
    public void amerlithomestay1 (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/accomodation/homestay/hiteshkumar-kantilal-joshi/b.jpg\"]")).click();
    }

    @Test
    public  void amerlihomstay2 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/accomodation/homestay/hashmukhbhai-hardashbhai-vekariya/b.jpg\"]")).click();
    }

    @Test
    public  void amerlihomestay3 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gujarattourism.com/accommodation/homestay.html");
        driver.findElement(By.xpath("//img[@src=\"/content/dam/gujrattourism/images/accomodation/homestay/dilipkumar-balkrishnabhai-pandya/b.jpg\"]")).click();
    }
}
