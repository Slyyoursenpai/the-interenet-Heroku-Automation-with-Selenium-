package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropTest extends BaseTest {
    private final static By LINK = By.xpath("//a[@href='/drag_and_drop']");
    private final static By COLUMN_A = By.id("column-a");
    private final static By COLUMN_B = By.id("column-b");
    private final static String COLUMN_TEXT = "A";

    @Test
    public void dragDropTest() {
        WebElement dragLink = driver.findElement(LINK);
        dragLink.click();

        WebElement columnA = driver.findElement(COLUMN_A);
        WebElement columnB = driver.findElement(COLUMN_B);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(columnA, columnB).perform();

        String columnCheck = columnB.getText();
        Assert.assertTrue(columnCheck.contains(COLUMN_TEXT), "Column B is not replaced with A");
    }
}
