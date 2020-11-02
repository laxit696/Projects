import org.testng.Assert;
import org.testng.annotations.Test;


public class Depend {
    @Test
    public void method1() {
        System.out.println("Method 1");
        Assert.fail();
    }

    @Test(dependsOnMethods = "method1", alwaysRun=true)
    public void method2() {
        System.out.println("Method 2");
    }


    @Test(dependsOnMethods = "method2", alwaysRun=true)
    public void method3() {
        System.out.println("Method 3");
    }

}
