package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends MyMethods {

    public Locators() {

        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "input#headlessui-combobox-input-\\3a Rq9lla\\3a")
    private WebElement From;

    @FindBy(css = "input#headlessui-combobox-input-\\3a Rqhlla\\3a")
    private WebElement To;

    @FindBy(css = "main > div.mt-24.max-w-5xl.w-full.justify-center.items-center.text-sm.lg\\3a flex")
    private WebElement NoFlight;

    @FindBy(css = "div > p")
    private WebElement flightCountMessage;

    public WebElement getWebElement(String elementName) {
        if ("From".equals(elementName)) {
            return this.From;
        } else if ("To".equals(elementName)) {
            return this.To;
        } else if ("NoFlight".equals(elementName)) {
            return this.NoFlight;
        } else if ("flightCountMessage".equals(elementName)) {
            return this.flightCountMessage;
        }else {
            return null;
    }


    }

}
