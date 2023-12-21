package com.bable.pages;

import com.bable.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BableForNetworksPage extends HomePage{

    public BableForNetworksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
