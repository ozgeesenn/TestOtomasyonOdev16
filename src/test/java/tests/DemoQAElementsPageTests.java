package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQAElementsPageTests extends BaseTest{

    @BeforeMethod
    public void before(){

        pageManager.elementsPage.open();
    }

    @Test
    public void clickMeButtonQATest(){

        pageManager.elementsPage.clickMeButtonsQA();
    }

    @Test
    public void webTablesQATest()
    {
        pageManager.elementsPage.webTablesQATest();

    }

}
