package Base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
        private WebDriver driver;
        protected HomePage homePage;

        @BeforeClass

        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            returnHome();

        }

        @BeforeMethod
        public void returnHome() {
            driver.get("http://automationpractice.com/index.php");
            homePage = new HomePage(driver);

        }

        @AfterClass
        public void tearDown() {
           driver.quit();
       }


        @AfterMethod
        public void takeScreenShots(ITestResult result) {
            if (ITestResult.FAILURE == result.getStatus()) {
                var camera = (TakesScreenshot) driver;
                File ScreenShot = camera.getScreenshotAs(OutputType.FILE);
                System.out.println("ScreenShotTaken: " + ScreenShot.getAbsolutePath());
                try {
                    Files.move(ScreenShot, new File("C:\\Users\\Hussein\\IdeaProjects\\Tast\\resources\\ScreenShots\\"+ result.getName() +".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }




    }

