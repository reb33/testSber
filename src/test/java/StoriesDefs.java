
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import steps.ScenarioSteps;

import static org.junit.Assert.fail;

/**
 * Created by Konstantin on 10.10.2015.
 */

public class StoriesDefs{

//    @Managed(uniqueSession = true, driver="IEXPLORER")
//    WebDriver driver;
//    private String baseUrl="http://www.sberbank.ru/";

    @Steps
    ScenarioSteps scenarioSteps;

    @Given("^На главной странице$")
    public void На_главной_странице() throws Throwable {
//        driver.get(baseUrl);
        scenarioSteps.openMain();
        scenarioSteps.checkMainPage();
//        throw new PendingException();

    }


    @When("^Перейти на экран Кредитные карты$")
    public void Перейти_на_экран_Кредитные_карты() throws Throwable {
        scenarioSteps.goToKreditCardsPage();
//        throw new PendingException();
    }

    @Then("^Проверка перехода на экран Кредитные карты$")
    public void Проверка_перехода_на_экран_Кредитные_карты() throws Throwable {
        scenarioSteps.checkKreditCardsPage();
//        throw new PendingException();
    }

    @When("^Выбрать (\\d+) кредитные карты$")
    public void Выбрать_кредитные_карты(int arg1) throws Throwable {
        scenarioSteps.choiseKreditCards(arg1);
//        throw new PendingException();
    }


    @When("^Перейти на экран Сравнение карт$")
    public void Перейти_на_экран_Сравнение_карт() throws Throwable {
        scenarioSteps.goToComparePage();
//        throw new PendingException();
    }

    @Then("^Проверка перехода на экран Сравнения карт$")
    public void Проверка_перехода_на_экран_Сравнения_карт() throws Throwable {
        scenarioSteps.checkComparePage();
//        throw new PendingException();
    }

    @Then("^Проверка процентов первой карты \"(.*)\"$")
    public void Проверка_процентов_первой_карты(String arg1) throws Throwable {

        scenarioSteps.assertTextFirstCardInterest(arg1);
//        throw new PendingException();
    }

    @Then("^Проверка процентов последней карты \"(.*)\"$")
    public void Проверка_процентов_последней_карты(String arg1) throws Throwable {
        scenarioSteps.assertTextLasttCardInterest(arg1);
//        throw new PendingException();
    }

    @When("^Переход на домашнюю страницу$")
    public void Переход_на_домашнюю_страницу() throws Throwable {
        scenarioSteps.goToHomePage();
//        throw new PendingException();
    }

    @Then("^Проверка перехода на домашнюю страницу$")
    public void Проверка_перехода_на_домашнюю_страницу() throws Throwable {
        scenarioSteps.checkMainPage();
//        throw new PendingException();
    }

//    @After
//    public void tearDown() throws Exception {
//        System.out.println("After go");
//        driver.close();
////        String verificationErrorString = verificationErrors.toString();
////        if (!"".equals(verificationErrorString)) {
////            fail(verificationErrorString);
////        }
//    }
}
