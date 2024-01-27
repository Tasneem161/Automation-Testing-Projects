package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageobjects.Register;
import resources.Base;

import java.io.IOException;

public class RegisterTest extends Base {
    WebDriver driver;
    @Test
    public void validSignUp() throws IOException {

        driver = intializerDriver();
        driver.get(prop.getProperty("url"));

        Register register = new Register(driver);
        register.registerDropdown().click();

        Register Teacher = new Register(driver);
        Teacher.teacher().click();

        Register Email = new Register(driver);
        Email.Email().click();

        Register EnterEmail = new Register(driver);
        EnterEmail.EnterEmail().sendKeys(prop.getProperty("Email"));

        Register FirstName = new Register(driver);
        FirstName.FirstName().sendKeys(prop.getProperty("FirstName"));

        Register LastName = new Register(driver);
        LastName.LastName().sendKeys(prop.getProperty("LastName"));

        Register CreatePassword = new Register(driver);
        CreatePassword.CreatePassword().sendKeys(prop.getProperty("password"));

        Register Continue = new Register(driver);
        Continue.Continue().click();





    }


}
