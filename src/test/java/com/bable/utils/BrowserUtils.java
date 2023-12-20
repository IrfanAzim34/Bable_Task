package com.bable.utils;

import org.junit.Assert;

public class BrowserUtils {

    public static void verifyTitle(String webTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(webTitle));
    }

}
