package pageObjects;

import driverConfig.Driver;
import org.openqa.selenium.WebDriver;

abstract class AbstractPage {
    protected WebDriver driver = Driver.getInstance().getDriver();



}
