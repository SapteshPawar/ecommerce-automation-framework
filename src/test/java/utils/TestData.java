package utils;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"}, // valid
                {"invalid_user", "wrong_pass"}     // invalid
        };
    }
}