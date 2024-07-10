package tests;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

public class FileUploadTest extends BaseTest {
    private final String FILE_NAME = "test.txt";
    private final String FILE_PATH = RELATIVE_RESOURCE_PATH + FILE_NAME;
    private final By FILE_UPLOAD = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Upload"));
    private final By CHOOSE_FILE = By.id("file-upload");
    private final By FILE_SUBMIT = By.id("file-submit");
    private final By UPLOADED_FILE = By.id("uploaded-files");
    private final int WAIT = 15;
    @Test
    public void fileUploadTest() {
        driver.findElement(FILE_UPLOAD).click();
        File fileToUpload = new File(FILE_PATH);
        driver.findElement(CHOOSE_FILE).sendKeys(fileToUpload.getAbsolutePath());
        driver.findElement(FILE_SUBMIT).click();
        // Wait for the file upload process to complete and UI updates to reflect
        await().atMost(20, SECONDS).until(() -> true); // Waits for 20 seconds

        // Perform assertions to verify the file upload
        Assert.assertEquals(driver.findElement(UPLOADED_FILE).getText(), FILE_NAME, "File name is incorrect or missing");

        // Wait a bit more before the browser closes to manually check the window
        await().atMost(20, SECONDS).until(() -> true); // Waits for another 20 seconds

    }
}