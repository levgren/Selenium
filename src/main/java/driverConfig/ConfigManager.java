package driverConfig;

import okhttp3.internal.http2.Settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    protected static String url;
    protected static String searchedWord;
    protected static String domain;

    private Config config;

    private static ConfigManager configInstance = new ConfigManager();

    private ConfigManager() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.setProperty("browser", properties.getProperty("browser"));
        url = properties.getProperty("url");
        searchedWord = properties.getProperty("searchedWord");
        domain = properties.getProperty("domain");
    }

    public static ConfigManager getConfigInstance(){
        return configInstance;
    }

    public Config getConfig(){
        return config;
    }
}
