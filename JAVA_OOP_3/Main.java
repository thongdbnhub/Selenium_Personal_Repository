import common.Constant;
import testCase.TestCase;

public class Main {
    public static void main(String args[]) {
        Constant.browser = "Chrome";
        Constant.report = true;
        Constant.headless = false;

        TestCase tc = new TestCase();
        tc.Login(Constant.browser, Constant.report, Constant.headless);
        tc.Add_Category(Constant.browser, Constant.report, Constant.headless);
    }
}