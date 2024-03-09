package common;

import driver.DriverFactory;
import pages.DemoQAElementsPage;

public class PageManager {
    public DemoQAElementsPage elementsPage;

    public PageManager(){
        DriverFactory.initDriver();
        elementsPage = PageFactory.buildElementsPage();
    }


}
