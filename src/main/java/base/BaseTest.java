package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite implementations like reports ");
    }

    @BeforeMethod
    public void aBeforeMethod() {
        System.out.println("ABefore method load values of android ");
    }

    @BeforeMethod
    public void bBeforeMethod() {
        System.out.println("BBefore method android launch");
    }

    @AfterMethod
    public void closeApp() {
        System.out.println("CLosing app");
    }

    @AfterSuite
    public void Suite() {
        System.out.println("After suite implementations like reports ");
    }


}
