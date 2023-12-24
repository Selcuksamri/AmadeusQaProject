package StepDefinitions;

import Pages.Locators;
import Utilities.MyMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test2_Steps {

    Locators locators = new Locators();
    MyMethods mymethods = new MyMethods();


    @When("\"From: Istanbul\", \"To: Los Angeles\" seçeneklerini seçersem")
    public void selectFlightOptions() {
        locators.clickMethod(locators.getWebElement("From"));
        locators.dropDownMenuSelect(locators.getWebElement("From"), 1);
        locators.clickMethod(locators.getWebElement("To"));
        locators.dropDownMenuSelect(locators.getWebElement("To"), 2);
    }

    @Then("\"Found X items\" yazısındaki X sayısı ile listelenen uçuş sayısının aynı olduğunu kontrol etmeliyim")
    public void verifyFlightCount() {
        int expectedCount = locators.getFlightCount(locators);
        int actualCount = mymethods.getFlightCount(locators);

        if (expectedCount == actualCount) {
            System.out.println("Test başarılı: Uçuş sayısı doğru bir şekilde listelenmiştir.");
        } else {
            System.out.println("Test başarısız: Uçuş sayısı hatalı bir şekilde listelenmiştir.");
        }
    }

}
