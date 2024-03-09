package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoQAElementsPage extends BasePage{

    //ODEV 1 ADIM 1

    public SelenideElement btnButtons = $(".collapse.element-list.show > .menu-list > li:nth-of-type(5) > .text");
    public SelenideElement btnclickMe = $("[class] [class='mt-4']:nth-child(4) .btn-primary");
    public SelenideElement textMessage= $("p#dynamicClickMessage");

    //ODEV 1 ADIM 2

    public SelenideElement btnWebTables= $(".show .btn-light:nth-of-type(4) .text");
    public SelenideElement btnAdd= $("button#addNewRecordButton");
    public SelenideElement firstName= $("input#firstName");
    public SelenideElement lastName=$("input#lastName");
    public SelenideElement email=$("input#userEmail");
    public SelenideElement age=$("input#age");
    public SelenideElement salary=$("input#salary");
    public SelenideElement department=$("input#department");
    public SelenideElement btnSubmit=$("button#submit");

    public DemoQAElementsPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickMeButtonsQA()
    {
        btnButtons.click();
        btnclickMe.click();
        System.out.println("Ekranda Gorulen Text Mesaji: "+ textMessage.getText());
    }

    public void webTablesQATest()
    {
        btnWebTables.click();
        btnAdd.click();

        firstName.sendKeys("Özge");
        lastName.sendKeys("Şen Kaya");
        email.sendKeys("ozgeesenn1995@gmail.com");
        age.sendKeys("29");
        salary.sendKeys("234556");
        department.sendKeys("QA Team");
        btnSubmit.click();

        findEntry("ozgeesenn1995@gmail.com");

        firstName.clear();
        firstName.sendKeys("Ezgi");

        lastName.clear();
        lastName.sendKeys("Çelik");

        btnSubmit.click();


    }

    public void findEntry(String text) {

        ElementsCollection tableElements = $$(".rt-table .rt-tbody [role='row'] .rt-td:nth-of-type(4)");


        for(int i=0; i< tableElements.size();i++){

            if (tableElements.get(i).getText().equalsIgnoreCase(text)){
                $("#edit-record-" + (i + 1)).click();
                break;
            }
        }
    }



}
