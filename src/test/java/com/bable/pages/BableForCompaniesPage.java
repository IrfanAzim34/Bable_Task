package com.bable.pages;

import com.bable.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BableForCompaniesPage extends HomePage{

    public BableForCompaniesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
