package ru.sberbank.kbar.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Костя on 05.10.2015.
 */
@DefaultUrl("http://www.sberbank.ru/")
public class MainPage extends AbstractPageObject{

    @FindBy(xpath = "//a[@class='no-link']/span[.='Выбрать карту']")
    public WebElement text_chouse_cart;

    @FindBy(linkText = "Кредитные карты")
    public WebElement link_creditCarts;

    @FindBy(css = "img.current-image")
    public WebElement img_mainPage;

//    public MainPage(WebDriver driver){
//        super(driver);
//    }

    @Override
    public boolean isLoaded() {
        return img_mainPage.isDisplayed();
    }

//    public void open(){
//
//    }


}
