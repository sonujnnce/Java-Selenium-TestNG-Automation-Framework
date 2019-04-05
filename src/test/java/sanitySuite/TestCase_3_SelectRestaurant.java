package sanitySuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Swiggy_Resto_Search_page;



public class TestCase_3_SelectRestaurant extends TestBase{

    Swiggy_Resto_Search_page obj_swiggy_resto;


    @Test (priority=4, description = "Click on Search and Search for Restaurant")
    public void search_restaurant() {

        log.info("Click on Search and Search for Restaurant.");
        obj_swiggy_resto = new Swiggy_Resto_Search_page (driver);
        obj_swiggy_resto.wait(4);
        obj_swiggy_resto.click_on_search_button();
        obj_swiggy_resto.wait(4);
        obj_swiggy_resto.search_by_restoName(data.getProperty("TestCase_3_searchStrinRestaurantg_1"));
        obj_swiggy_resto.pressEnter();
        obj_swiggy_resto.pressEnter();
        log.info("Assert actual searched location with expected location in first place from properties file.");
        obj_swiggy_resto.wait(4);
        assertStrings(obj_swiggy_resto.get_first_resto(),data.getProperty("TestCase_3_assertStrinRestaurantg_1"));
    }

    @Test (priority=5, description = "Click on restaurant searched for")
    public void click_searched_resto() {

        log.info("Click on restaurant searched for");
        obj_swiggy_resto.click_on_searched_resto();
        obj_swiggy_resto.wait(10);
    }

}
