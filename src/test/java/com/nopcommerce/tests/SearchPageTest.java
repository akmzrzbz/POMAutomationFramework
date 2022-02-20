package com.nopcommerce.tests;

import com.nopcommerce.base.BaseTest;
import com.nopcommerce.util.Constants;
//import org.apache.commons.math3.analysis.function.Constant;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
//@Listeners(value = com.nopcommerce.tests.TestNGListener.class)

public class SearchPageTest extends BaseTest {
    @BeforeMethod
    public void searchPageSetUp(){
        searchPage=homePage.doSearch(prop.getProperty("searchItem"));

    }

    @Test(priority = 1)
    public void verifySearchPageNameTest(){
        assertEquals(searchPage.getSearchPageName(), Constants.SEARCHPAGE_NAME);
    }

    @Test(priority = 2)
    public void verifyManufactureDropDownListTest(){
        Assert.assertTrue(searchPage.verifyManufactureDropdownList());
    }

    @Test(priority = 3)
    public void validateCategoryList(){
        Assert.assertEquals(searchPage.getCategoriesItem(),Constants.actualCategoryList());
       //Assert.assertEquals(searchPage.getCategoriesItem(),Constants.actualCategoryList());
   }




}
