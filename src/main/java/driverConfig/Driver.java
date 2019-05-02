package driverConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

//    private static Driver instance = new Driver();
//
//    private Driver(){
//    }
//
//    public static Driver getInstance(){
//        return instance;
//    }
//
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
//        @Override
//        protected WebDriver initialValue() {
//            return new ChromeDriver();
//        }
//    };
//
//    public WebDriver getDriver(){
//        return driver.get();
//    }
//
//    public static void remooveDriver(){
//        driver.get().quit();
//        driver.remove();
//    }


    private static WebDriver driver = null;

    private Driver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            ThreadLocalDriverManager.setWebDriver(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public static Driver getInstance() {
        return new Driver();
    }

    public WebDriver getDriver() {
        return ThreadLocalDriverManager.getDriver();
    }


//        Config config = new Config();
//        if (config.getBrowser().toLowerCase().contains("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        if (config.getBrowser().toLowerCase().contains("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        }

    }


