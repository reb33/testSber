package ru.sberbank.kbar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Костя on 05.10.2015.
 */
public class ComparePage extends AbstractPageObject{

    @FindBy(css = "tr[data-reactid='.s.1.0.1.$product_interest_rate'] td.first-card > div")
    public WebElement text_firstCardInterest;

    @FindBy(css = "tr[data-reactid='.s.1.0.1.$product_interest_rate'] td.last-card > div")
    public WebElement text_lastCardInterest;



    @Override
    public boolean isLoaded() {
        return find(By.cssSelector("div.card-comparison-wrapper")).getText().toUpperCase().contains("Сравнение кредитных карт".toUpperCase());
    }
}
