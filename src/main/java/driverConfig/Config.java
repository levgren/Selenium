package driverConfig;

public class Config {

    private Config config;
    private String url;
    private String domain;
    private String browser;
    private String searchedWord;

    public String getUrl() {
        return url;
    }

    public String getDomain() {
        return domain;
    }

    public String getBrowser() {
        return browser;
    }

    public String getDetectedText() {
        return searchedWord;
    }

    public Config getSettings() {
        return config;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setSearchedWord(String searchedWord) {
        this.searchedWord = searchedWord;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
