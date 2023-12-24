package Utilities;

import Pages.Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyMethods {

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(60));


    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        element.click();

    }

    public boolean verifyContainsText(WebElement element, String message) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, message));
        String actualText = element.getText().toLowerCase();
        String expectedTextLower = message.toLowerCase();
        boolean containsText = actualText.contains(expectedTextLower);

        Assert.assertTrue(containsText, "Element text: '" + actualText + "' Görülmesi gereken mesajı içermiyor: '" + expectedTextLower + "'");

        return containsText;
    }

    public void dropDownMenuSelect(WebElement element, int index) {
        clickMethod(element);
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);

    }

    public int getFlightCount(Locators locators) {
        WebElement flightCountMessage = locators.getWebElement("flightCountMessage");
        String message = flightCountMessage.getText();
        String[] parts = message.split(" ");
        String countString = parts[1];
        return Integer.parseInt(countString);
    }



}
