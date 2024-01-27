package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class LoginTest extends Base {
    WebDriver driver;
    @Test(priority = 1)
    public void InvalidLogin() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));


        driver.close();
    }
    @Test(priority = 2)
    public void ValidLogin() throws IOException {


        driver.close();
    }

}
