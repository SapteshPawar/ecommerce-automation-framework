package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import listeners.TestListener;
import pages.LoginPage;

@Listeners(TestListener.class)
public class FailureTest extends BaseTest {

    @Test
    public void forceFailureForScreenshot() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        // ❌ Intentionally failing assertion
        Assert.assertTrue(false, "Forcing failure to capture screenshot");
    }
}