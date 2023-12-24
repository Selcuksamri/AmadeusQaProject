package StepDefinitions;

import Pages.Locators;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class Test1_Steps {

    Locators locators = new Locators();

    @Given("Ben uçuş rezervasyon sayfasındayım")
    public void NaviToWeb() {
        BaseDriver.getDriver().get("https://flights-app.pages.dev/");
    }

    @When("From ve To giriş alanlarına aynı değeri girersem")
    public void EnterData(String To,String From) {

        locators.clickMethod(locators.getWebElement("To"));
        locators.dropDownMenuSelect(locators.getWebElement("To"), 1);
        locators.clickMethod(locators.getWebElement("From"));
        locators.dropDownMenuSelect(locators.getWebElement("From"),1);



    }

    @Then("Aynı değerin her iki alanına da girilemediğini belirten bir hata mesajı görmeliyim")
    public void verificationProgress() {
        WebElement toElement = locators.getWebElement("To");
        WebElement fromElement = locators.getWebElement("From");

        String toText = toElement.getText();
        String fromText = fromElement.getText();

        WebElement noFlightElement = locators.getWebElement("NoFlight");

        if (!locators.verifyContainsText(noFlightElement, "Malesef aynı şehir içinde uçuş seyahati gerçekleştiremezsiniz")) {
            System.out.println("Test başarısız: Aynı şehir içinde uçuş seyahati gerçekleştiremezsiniz mesajı görülemedi.");
        }



        }
    }

