import org.testng.annotations.Test;

public class Group {
    @Test(groups = {"unit"})
    void printintro() {
        System.out.println("this is matrix college testng project");
    }

    @Test(groups = {"sanity"})
    void setup() {
        System.out.println("this is matrix college setup");
    }

    @Test(groups = {"Regression"})
    void done() {
        System.out.println("this is matrix college homepage");
    }

    @Test(groups = {"sanity"})
    void login() {
        System.out.println("this is matrix college login page");
    }

    @Test(groups = {"Regression"})
    void openlea() {
        System.out.println("this is matrix college lea");
    }

    @Test(groups = {"unit"})
    void openmio() {
        System.out.println("this is matrix college mio");
    }

    @Test(groups = {"sanity"})
    void teardown() {
        System.out.println("this is teardown ");
    }
}
