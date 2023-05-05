package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGlobalPage;
import utilities.Driver;

public class Base {

    WebDriver driver;
    TechGlobalPage techGlobalPage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        techGlobalPage = new TechGlobalPage(driver);

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
