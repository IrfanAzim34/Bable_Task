package com.bable.pages;

import com.bable.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BableForCitiesPage extends HomePage{

    public BableForCitiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
