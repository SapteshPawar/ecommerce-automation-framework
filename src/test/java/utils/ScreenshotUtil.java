package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {

        // Create timestamp (so files don’t overwrite)
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Create screenshots folder if not exists
        File folder = new File("screenshots");
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Take screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        // File path
        String filePath = "screenshots/" + testName + "_" + timestamp + ".png";
        File dest = new File(filePath);

        try {
            FileUtils.copyFile(src, dest);
            System.out.println("📸 Screenshot saved: " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}