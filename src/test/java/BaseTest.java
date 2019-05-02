
import driverConfig.Driver;
import driverConfig.ThreadLocalDriverManager;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.MainPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class BaseTest {
//   private Driver driver = Driver.getInstance();
//   protected Config config = ConfigManager.getConfigInstance().getConfig();
   protected MainPage mainPage = new MainPage();

   protected static String url;
   protected static String searchedWord;
   protected static String domain;

@BeforeClass
   public static void ConfigManager() throws Exception {
   FileInputStream fis;
   Properties properties = new Properties();
   try {
      fis = new FileInputStream("config.properties");
      properties.load(fis);
   } catch (IOException e) {
      throw new Exception("ERROR: properties fail doesn't exist!!!");
   }

      System.setProperty("browser", properties.getProperty("browser"));
      url = properties.getProperty("url");
      searchedWord = properties.getProperty("searchedWord");
      domain = properties.getProperty("domain");
   }

//   @BeforeMethod
//   public void setup(){
//      WebDriver driver = Driver.getInstance().getDriver();
//      driver.get(url);
//   }

   @AfterTest
   public void  tearDown(){
   ThreadLocalDriverManager.quitThreadLocalDriver();
   }
}
