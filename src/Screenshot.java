import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Users/asmitakakshapati/Desktop/screenshot1/google.png"));
    }
}
