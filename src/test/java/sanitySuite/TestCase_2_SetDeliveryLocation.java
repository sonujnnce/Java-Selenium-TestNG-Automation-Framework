package sanitySuite;

import org.testng.annotations.Test;

import base.TestBase;
import pages.Swiggy_locations_search_page;


public class TestCase_2_SetDeliveryLocation extends TestBase{

    Swiggy_locations_search_page obj_swiggy_search;


    @Test (priority=2, description = "Search Location in swiggy")
    public void search_location() {

        log.info("Get input string from properties file and put it into the search box.");
        obj_swiggy_search = new Swiggy_locations_search_page (driver);
        obj_swiggy_search.search_by_first_option(data.getProperty("TestCase_1.searchString_1"));

        log.info("Assert actual searched location with expected location in first place from properties file.");
        assertStrings(obj_swiggy_search.get_first_option(),data.getProperty("TestCase_1.assertString_1"));
        obj_swiggy_search.wait(10);
    }

    @Test (priority=3, description = "Click on Indiranagar search location")
    public void click_first_search_option() {

        log.info("Click on Indiranagar search location");
        obj_swiggy_search.click_on_first_search_option();

    }

}
