package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Task {

    private WebDriver driver;

    /*
    #1 task
    Open Google Chrome
    Navigate to [https://duckduckgo.com/]
    Assert that the page title is [Google]
    Close Google Chrome
    */
    @Test
    public void FirstTask() {

        System.out.println("Test started");
        driver.get("https://duckduckgo.com/");
        // Assert that the title contains DuckDuckGo (more robust than exact match)
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google", "Title does not match!");
    }


            /*
                    #2
                    ________________ Basic ________________
                    Open Google Chrome
                    Navigate to [https://duckduckgo.com/]
                    Assert that the DuckDuckGo logo is displayed
                    Close Google Chrome
            */
    @Test
    public void SecondTask() {

         driver.get("https://duckduckgo.com/");
         By logoLocator = By.xpath("//div[contains(@class,'header_headerWrapDesktop__9M19L header_isResponsive__okaHv header_hasSearchbox__ttBRw')]//img");
         boolean IsLogoDisplayed  = driver.findElement(logoLocator).isDisplayed();
         Assert.assertTrue(IsLogoDisplayed, "DuckDuckGo logo is not displayed!");
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

