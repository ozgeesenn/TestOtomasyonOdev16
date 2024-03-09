package common;

import pages.DemoQAElementsPage;

public class PageFactory {

    public static DemoQAElementsPage buildElementsPage(){
        return new DemoQAElementsPage("/");
    }

}
