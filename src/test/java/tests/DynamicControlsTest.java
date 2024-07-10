package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;
public class DynamicControlsTest extends BaseTest {
    private final By DYNAMIC_CONTROL = By.xpath(String.format(PRECISE_TEXT_XPATH, "Dynamic Controls"));
    private final By ENABLE = By.xpath(String.format(PRECISE_TEXT_XPATH, "Enable"));
    private final By INPUT = By.xpath("//*[@id='input-example']//input");
    private final String RANDOM_TEXT = UUID.randomUUID().toString();

    private boolean isClickable(WebElement element){ /// checks if button is clickable
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));

        }
        catch (TimeoutException exception){
            return false;
        }
        return true;
    }

    @Test
    public void dynamicControlsTest() {
        driver.findElement(DYNAMIC_CONTROL).click(); // clicks link
        driver.findElement(ENABLE).click(); // clicks enable button

        WebElement inputField = driver.findElement(INPUT); /// selects input field
        Assert.assertTrue(isClickable(inputField),  "Element wasn't enabled"); // checks if input field is enabled/clickable

        inputField.sendKeys(RANDOM_TEXT); //inputs random values
        Assert.assertEquals(driver.findElement(INPUT).getAttribute("value"), RANDOM_TEXT, "Test is not displayed"); // checks if field contains value
    }

}