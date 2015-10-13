import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.sberbank.kbar.utils.Utils;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by ����� on 03.10.2015.
 */
public class BaseTest{

    @Managed(driver = "firefox")
    WebDriver driver;

    private String baseUrl;
    private boolean acceptNextAlert = true;
    StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
        System.out.println("Before go");
        baseUrl = "http://www.sberbank.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


}
