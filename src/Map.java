import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Map {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com/maps");
        //driver.manage().window().maximize();

       // Thread.sleep(2000);

       WebElement searchBox=  driver.findElement(By.id("searchbox"));
         searchBox.sendKeys("resturants near me");
         searchBox.submit();

       // WebElement search=  driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]"));
       // search.sendKeys("Dentist near me");

    }
}
