package driverConfig;

import org.openqa.selenium.WebDriver;

public class ThreadLocalDriverManager {

    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        threadLocalDriver.set(driver);
    }

    public static void quitThreadLocalDriver() {
        if (threadLocalDriver.get() != null) {
            threadLocalDriver.get().quit();
        }
    }
}

