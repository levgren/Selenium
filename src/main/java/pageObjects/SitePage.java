package pageObjects;

import io.qameta.allure.Allure;

public class SitePage extends AbstractPage {

    public String getTextFromTitle(){
        return driver.getTitle();
    }

}
