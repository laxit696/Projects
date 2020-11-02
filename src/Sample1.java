import org.testng.annotations.Test;

public class Sample1 {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("Operating Browser");
    }

    @Test(priority = 3)
    void login()
    {
        System.out.println("This is login test");
    }

    @Test(priority = 2,enabled = false)
    void teardown()
    {
        System.out.println("Closing the browser");
    }
}
