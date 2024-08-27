package common;

public class BaseTest {
    protected void createDriver(String browser, boolean report, boolean headless) {
        System.out.println("Browser: " + browser);
        System.out.println("Report: " + report);
        System.out.println("Headless: " + headless);
    }

    protected void closeDriver(String browser) {
        System.out.println("Closed browser: " + browser);
    }
}