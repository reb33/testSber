
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Konstantin on 10.10.2015.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features"//путь к функциям
//        ,format = {"json:target/integration_cucumber.json"}//средство разметки
//       , tags = {"@run"})//теги для включения(@)/исключения(@~
)
public class TestRunner {
}
