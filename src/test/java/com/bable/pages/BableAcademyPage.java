package com.bable.pages;

import com.bable.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BableAcademyPage extends HomePage{

    public BableAcademyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
