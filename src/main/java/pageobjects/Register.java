package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    WebDriver driver;

    public Register(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id=\"top-header-container\"]/nav/div/div[3]/a[4]")
    WebElement registerDropdown;
    @FindBy(xpath = "//*[@id=\"app-shell-root\"]/div/main/div[2]/div[3]/section[2]/div/div/div[1]/div[2]/button[2]")
    WebElement teacher;




    @FindBy(xpath = "//*[@id=\"app-shell-root\"]/div/main/div[2]/div[3]/section[2]/div/div/div[2]/div[2]/div[5]/button")
    WebElement Email;

    @FindBy(xpath = "//*[@id=\"uid-labeled-text-field-1-wb-id-field\"]")
    WebElement EnterEmail;

    @FindBy(xpath = "//*[@id=\"uid-labeled-text-field-2-wb-id-field\"]")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"uid-labeled-text-field-3-wb-id-field\"]")
    WebElement LastName;

    @FindBy(xpath = "//*[@id=\"uid-labeled-text-field-4-wb-id-field\"]")
    WebElement CreatePassword;

    @FindBy(xpath = "//*[@id=\"app-shell-root\"]/div/main/div[2]/div[3]/section[2]/div/nav/button[2]")
    WebElement Continue;



    public WebElement registerDropdown(){
        return registerDropdown;
    }
    public WebElement teacher(){
        return teacher;
    }


    public WebElement Email(){
        return Email;
    }

    public WebElement EnterEmail(){
        return EnterEmail;
    }


    public WebElement FirstName(){
        return FirstName;
    }

    public WebElement LastName(){
        return LastName;
    }

    public WebElement CreatePassword(){
        return CreatePassword;
    }

    public WebElement Continue(){
        return Continue;
    }
}
