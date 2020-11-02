import org.testng.annotations.Test;

public class F1 {
    @Test
    void setup()
    {
        System.out.println("Operating Browser");
    }

    @Test
    void login()
    {
        System.out.println("This is login test");
    }

    @Test
    void teardown()
    {
        System.out.println("Closing the browser");
    }
}
