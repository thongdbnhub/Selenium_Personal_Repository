package testCase;

import common.BaseTest;
import common.Constant;

public class TestCase extends BaseTest {
    public void Login(String browser, boolean report, boolean headless) {
        System.out.println("TEST CASE LOGIN");
        beginTestCase(browser, report, headless);
        System.out.println("Step 1: Navigate to Login page");
        System.out.println("Step 2: Enter correct Email");
        System.out.println("Step 3: Enter correct Password");
        System.out.println("Step 4: Click Login button");
        System.out.println("Step 5: Verify that logging in application successfully");
        endTestCase(browser);
    }

    public void Add_Category(String browser, boolean report, boolean headless) {
        System.out.println("TEST CASE ADD CATEGORY");
        beginTestCase(browser, report, headless);
        System.out.println("Step 1: Navigate to Add New Category page");
        System.out.println("Step 2: Enter valid data to all fields");
        System.out.println("Step 3: Click Save button");
        System.out.println("Step 4: Verify that added category is displayed");
        endTestCase(browser);
    }

    private void beginTestCase(String browser, boolean report, boolean headless) {
        System.out.println("Test Case Information:");
        createDriver(browser, report, headless);
    }

    private void endTestCase(String browser) {
        closeDriver(browser);
    }
}