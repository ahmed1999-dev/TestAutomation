package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Task {

    private WebDriver driver;

    @Test
    public void FirstTask() {
            /*
            #1 task
            Open Google Chrome
            Navigate to [https://duckduckgo.com/]
            Assert that the page title is [Google]
            Close Google Chrome
            */
        System.out.println("Test started");
        driver.get("https://duckduckgo.com/");
        // Assert that the title contains DuckDuckGo (more robust than exact match)
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google", "Title does not match!");
    }

    @Test
    public void SecondTask() {
            /*
            #2 task
            Open Google Chrome
            Navigate to [https://duckduckgo.com/]
            Assert that the page title is [DuckDuckGo]
            Close Google Chrome
            */

    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}

