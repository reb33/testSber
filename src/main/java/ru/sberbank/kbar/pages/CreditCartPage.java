package ru.sberbank.kbar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sberbank.kbar.utils.Utils;

import static org.junit.Assert.fail;

/**
 * Created by Костя on 05.10.2015.
 */
public class CreditCartPage extends AbstractPageObject{

    @FindBy(linkText = "Добавить к сравнению")
    public WebElement button_addToCompare;

    @FindBy(css = "div.toggleCard.removeCard > a")
    public WebElement button_removeFromCompare;

    @FindBy(css = "button.sbf_button")
    public WebElement button_compare;

    public void waitLoaded() throws Exception{



        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (Utils.isElementPresent(button_addToCompare)) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
    }


    @Override
    public boolean isLoaded() {
        return button_addToCompare.isDisplayed();
    }
}
