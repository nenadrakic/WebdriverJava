package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){

        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Java\\JavaProjects\\webdriver_java\\resources\\chromedriver.exe");

        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
