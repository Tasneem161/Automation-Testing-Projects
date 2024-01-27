package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobjects.Register;
import pageobjects.Search;
import resources.Base;

import java.io.IOException;

public class SearchTest extends Base {
    WebDriver driver;
    @Test
    public void Search() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));


        driver.close();

    }
}
