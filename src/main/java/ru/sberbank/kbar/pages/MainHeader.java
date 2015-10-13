package ru.sberbank.kbar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Костя on 06.10.2015.
 */
public class MainHeader extends AbstractPageObject{

    @FindBy(css = "img[alt='Sberbank']")
    public WebElement imgLink_toHome;


    @Override
    public boolean isLoaded() {
        return imgLink_toHome.isDisplayed();
    }
}
