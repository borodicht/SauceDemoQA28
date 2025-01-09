package tests;

public class Test extends BaseTest{



    @org.testng.annotations.Test
    public void test() {
        driver.get("http://prestashop.qatestlab.com.ua/en/");
    }
}
