import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.*;

import org.junit.runner.RunWith;
import steps.ScenarioSteps;

@RunWith(SerenityRunner.class)
public class CheckCards extends BaseTest{

  @Steps
  ScenarioSteps scenarioSteps;

  @Test
  public void testCheacCards() throws Exception {

//    Actions actions = new Actions(driver);
//    driver.findElement(By.xpath("//a[@class='no-link']/span[.='Выбрать карту']")).click();
//    driver.findElement(By.linkText("Кредитные карты")).click();
//    actions.moveToElement(mainPage.text_chouse_cart).click().
//            moveToElement(mainPage.link_creditCarts).click().build().perform();
//    driver.findElement(By.xpath("(//a[contains(text(),'Кредитные карты')])[2]")).click();



    scenarioSteps.goToKreditCardsPage();
    scenarioSteps.choiseKreditCards(2);
    scenarioSteps.goToComparePage();
    scenarioSteps.assertTextFirstCardInterest("25,9%.* - 33,9%");
    scenarioSteps.assertTextLasttCardInterest("25,9%.* - 33,9%");
    scenarioSteps.goToHomePage();


  }




}
