import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Project {
    @Test
    public void openBrowser() throws Exception {
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/demo.html");

    }
    @Test
    public void checkTitle() throws Exception{
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/demo.html");
        String actualTitle = "Welcome";
        org.testng.Assert.assertEquals(driver.getTitle(), actualTitle);

    }
    @Test
    public void displayLogo() throws Exception{
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/demo.html");
        WebElement logo= driver.findElement(By.xpath("/html/body/section/header/div/div[1]/div/a/img"));
        org.testng.Assert.assertEquals(true, logo.isDisplayed());
        System.out.println("logo is displayed -Assert passed");



    }
}
