package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import ru.sberbank.kbar.pages.ComparePage;
import ru.sberbank.kbar.pages.CreditCartPage;
import ru.sberbank.kbar.pages.MainHeader;
import ru.sberbank.kbar.pages.MainPage;

import java.util.logging.Logger;

/**
 * Created by Konstantin on 08.10.2015.
 */
public class ScenarioSteps {

    MainPage mainPage;
    CreditCartPage creditCartPage;
    ComparePage comparePage;
    MainHeader mainHeader;

    @Step("Открыть главную странмцу")
    public void openMain(){
        mainPage.open();
    }

    @Step("Проверка главной страницы")
    public void checkMainPage(){
        Assert.assertTrue("Главная страница не загрузилась", mainPage.isLoaded());
    }

    @Step("Переход на страницу 'Кредитные карты'")
    public void goToKreditCardsPage() throws Exception {

        mainPage.text_chouse_cart.click();
        mainPage.link_creditCarts.click();

    }

    @Step("Проверка перехода на страницу кредитных карт")
    public void checkKreditCardsPage() throws Exception {
        creditCartPage.waitLoaded();
        Assert.assertTrue("Страница кредитных карт не загрузилась", creditCartPage.isLoaded());
    }

    @Step("Выбор {0} кредитных карт")
    public void choiseKreditCards(int x){
        creditCartPage.button_addToCompare.click();
        creditCartPage.button_removeFromCompare.click();
        creditCartPage.button_addToCompare.click();
        creditCartPage.button_addToCompare.click();
    }

    @Step("Переход на страницу сравнения карт")
    public void goToComparePage(){
        creditCartPage.button_compare.click();

    }

    @Step("Проверка перехода на страницу сравнения карт")
    public void checkComparePage(){
        Assert.assertTrue("Страница сравнения карт не загрузилась", comparePage.isLoaded());
    }

    @Step("Проверка прецентов первой кредитной карты на странице сравнения текст '{1}'")
    public void assertTextFirstCardInterest(String text){

        Assert.assertTrue("Не "+text,  comparePage.text_firstCardInterest.getText().matches(text));

    }

    @Step("Проверка прецентов последней кредитной карты на странице сравнения текст '{1}'")
    public void assertTextLasttCardInterest(String text){
        Assert.assertTrue("Не "+text,  comparePage.text_lastCardInterest.getText().matches(text));
    }

    @Step("Переход на домашнюю страницу")
    public void goToHomePage(){
        mainHeader.imgLink_toHome.click();
    }
}
