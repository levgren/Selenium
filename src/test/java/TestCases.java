import org.junit.jupiter.api.Test;

public class TestCases extends BaseTest {

    @Test
    public void one(){
        mainPage.goTo(url)
                .showResults(searchedWord)
                .openFirstLink()
                .getTextFromTitle();
    }

    @Test
    public void two(){
        mainPage.goTo(url)
                .showResults(searchedWord)
                .verifyDomainOnSearchResultPage(domain, 5);
    }
}
