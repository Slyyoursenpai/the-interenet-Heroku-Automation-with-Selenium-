package tests;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {
    private final By BASIC_AUTH = By.xpath(String.format(PRECISE_TEXT_XPATH, "Basic Auth"));
    private final By SUCCESS_AUTH = By.xpath(String.format(PARTICULAR_TEXT_XPATH,
            "Congratulations! You must have the proper credentials"));

    @BeforeMethod
    public void basicAuth() {
        HasAuthentication authentication = (HasAuthentication) driver;
        authentication.register(() -> new UsernameAndPassword("admin", "admin"));
    }

    @Test
    public void basicAuthTest() throws InterruptedException {
        driver.findElement(BASIC_AUTH).click();

        // Adding a sleep to see the action
        Thread.sleep(2000); // 2 seconds

        Assert.assertTrue(driver.findElement(SUCCESS_AUTH).isDisplayed(), "Message is not displayed");

        // Adding a sleep to see the result
        Thread.sleep(2000); // 2 seconds
    }
}
