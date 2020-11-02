import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AssertSample {
    @Test
    public void testNGAsserts() throws Exception {
        System.setProperty("webdriver.Firefox.driver", "/usr/local/Cellar/geckodriver/0.27.0/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass

        driver.get("https://opensource-demo.orangehrmlive.com/");
        String actualTitle = "OrangeHRM";
        org.testng.Assert.assertEquals(driver.getTitle(), actualTitle);
        Thread.sleep(2000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[4]/a/b")).click();
        driver.findElement(By.id("menu_time_Timesheets")).click();
        driver.findElement(By.id("menu_time_viewMyTimesheet")).click();
        //Test Condition 2: If page title didnt match with actualTitle then script throws an exception
        Thread.sleep(2000);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        actualTitle = "OrangeHRM";
        Thread.sleep(2000);
        //Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
        org.testng.Assert.assertEquals(driver.getTitle(), actualTitle);
    }
}
