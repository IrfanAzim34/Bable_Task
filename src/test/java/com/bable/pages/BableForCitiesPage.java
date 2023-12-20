package com.bable.pages;

import com.bable.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BableForCitiesPage extends HomePage{

    public BableForCitiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void allContentsDisplayed(){
        List<WebElement> allContents = new ArrayList<>();
        allContents.addAll(this.headerContents);
        allContents.addAll(this.mainContents);
        for (WebElement content : allContents) {
            Assert.assertTrue(content.isDisplayed());
        }
    }

    @FindBy(xpath = "//body/div[@class='nd-frame ']/div")
    public List<WebElement> headerContents;

    @FindBy(xpath = "//body/div[@class='content']/div")
    public List<WebElement> mainContents;

}
