
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.ScenarioSteps;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by Konstantin on 10.10.2015.
 */

public class StoriesDefs{

    @Managed(uniqueSession = true, driver="firefox")
    WebDriver driver;
    private String baseUrl="http://www.sberbank.ru/";

    @Steps
    ScenarioSteps scenarioSteps;

    @Before
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
        System.out.println("Before go");
        baseUrl = "http://www.sberbank.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Given("^На главной странице$")
    public void on_main_page() throws Throwable {
//        driver.get(baseUrl);
        scenarioSteps.openMain();
        scenarioSteps.checkMainPage();
//        throw new PendingException();

    }


    @When("^Перейти на экран Кредитные карты$")
    public void go_to_credit_cards() throws Throwable {
        scenarioSteps.goToKreditCardsPage();
//        throw new PendingException();
    }

    @Then("^Проверка перехода на экран Кредитные карты$")
    public void check_page_credits_cards() throws Throwable {
        scenarioSteps.checkKreditCardsPage();
//        throw new PendingException();
    }

    @When("^Выбрать (\\d+) кредитные карты$")
    public void choise_credit_card(int arg1) throws Throwable {
        scenarioSteps.choiseKreditCards(arg1);
//        throw new PendingException();
    }


    @When("^Перейти на экран Сравнение карт$")
    public void go_to_compare_cards() throws Throwable {
        scenarioSteps.goToComparePage();
//        throw new PendingException();
    }

    @Then("^Проверка перехода на экран Сравнения карт$")
    public void check_page_compare_cards() throws Throwable {
        scenarioSteps.checkComparePage();
//        throw new PendingException();
    }

    @Then("^Проверка процентов первой карты \"(.*)\"$")
    public void check_procents_first_card(String arg1) throws Throwable {

        scenarioSteps.assertTextFirstCardInterest(arg1);
//        throw new PendingException();
    }

    @Then("^Проверка процентов последней карты \"(.*)\"$")
    public void check_procents_last_card(String arg1) throws Throwable {
        scenarioSteps.assertTextLasttCardInterest(arg1);
//        throw new PendingException();
    }

    @When("^Переход на домашнюю страницу$")
    public void go_to_home_page() throws Throwable {
        scenarioSteps.goToHomePage();
//        throw new PendingException();
    }

    @Then("^Проверка перехода на домашнюю страницу$")
    public void check_page_home() throws Throwable {
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
