import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/asmitakakshapati/Downloads/geckodriver");
        WebDriver driver=new org.openqa.selenium.firefox.FirefoxDriver();
        driver.get("https:www.google.com/maps");

        WebElement search= driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]"));
        search.sendKeys("resturants near me");
        search.submit();
        driver.findElement(By.xpath("//*[@id=\"searchbox-searchbutton\"]")).click();

        WebElement price= driver.findElement(By.xpath("//*[@id=\"action-menu\"]"));
        price.click();
    }
}
