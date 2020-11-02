import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.List;

public class Project2 {
    @Test
    public void openBrowser() throws Exception {
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/demo.html");

    }
    @Test
    public void testImages()throws Exception{
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/demo.html");


        File files = null;
        Integer counter=0;

        Thread.sleep(5000);
        List<WebElement> listImages=driver.findElements(By.tagName("img"));
        System.out.println("No. of Images: "+listImages.size());

        for(WebElement image:listImages)
        {
            if(image.isDisplayed())
            {
                counter++;
                String[] names = image.getAttribute("src").split("/");
                String name = names[names.length-1];
                System.out.println(name);
                URL myURL = new URL(image.getAttribute("src"));

            }
        }
        System.out.println("No. of total displable images: "+counter);
    }
    @Test
    public void testBtn() throws Exception{
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/demo.html");
        String url = "http://www.way2automation.com/demo.html";
        driver.get(url);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The number of Button is: " + links.size());
        driver.close();
    }

}
