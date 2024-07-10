package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DataTableTests extends BaseTest {
    private final By SORTABLE_DATA_TABLES = By.xpath(String.format(PRECISE_TEXT_XPATH, "Sortable Data Tables"));
    private final By DUE_ElEMENTS_LOCATOR = By.xpath("//*[@id=\"table1\"]//td[4]");
    private final double EXPECTED_DUE_SUM = 251.00;
    private final double EXPECTED_DUE_SUM_COMPARE = 260.00;
    private final String CURRENCY_NUM_REGEX = "[^\\d.]";

    @Test
    public void dataTableTest() {
        driver.findElement(SORTABLE_DATA_TABLES).click();
        List<WebElement>DueList=driver.findElements(DUE_ElEMENTS_LOCATOR);
        double actual_due_sum=0.0;

        for (WebElement element:DueList){
            String dueText_element=element.getText();
            actual_due_sum+=Double.parseDouble(dueText_element.replaceAll(CURRENCY_NUM_REGEX,""));

        }
         Assert.assertEquals(actual_due_sum,EXPECTED_DUE_SUM,"Sum is not correct");
        System.out.println(actual_due_sum);
        // Assert.assertEquals(actual_due_sum,EXPECTED_DUE_SUM_COMPARE,"Sum is not correct"); // will fail

    }
}