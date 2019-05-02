package pageObjects;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends AbstractPage{

    private By searchInput = By.name("q");

    public MainPage goTo(String address){
        driver.get(address);
        return this;
    }

    public SearchResultPage showResults(String searchedWord) {
        driver.findElement(searchInput).sendKeys(searchedWord);
        Allure.addAttachment("Search input","Search input 'automation' is done");
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
        Allure.addAttachment("Press enter","The button 'Enter' is pressed");

        return new SearchResultPage();
    }

}

