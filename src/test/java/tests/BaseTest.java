package tests;

import com.codeborne.selenide.Selenide;
import common.PageManager;
import driver.DriverFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class BaseTest {

    protected SoftAssert softAssert;
    protected PageManager pageManager;

    @BeforeClass
    public void setUp() {

        pageManager = new PageManager();
        softAssert = new SoftAssert();
    }
    @BeforeMethod
    public void openDriver() {
        Selenide.open();
    }

    @AfterMethod
    public void clearCookies() {
        DriverFactory.clearCookies();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.close();
    }
}