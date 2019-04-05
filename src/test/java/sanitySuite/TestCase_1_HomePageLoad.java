package sanitySuite;

import org.testng.annotations.Test;

import base.TestBase;


public class TestCase_1_HomePageLoad extends TestBase{


    @Test (priority=1, description = "Open Swiggy Home Page URL")
    public void open_url() {

        log.info("Open Swiggy Home Page URL.");
        driver.get(data.getProperty("base.url"));
    }

}
