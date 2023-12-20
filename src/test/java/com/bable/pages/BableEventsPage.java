package com.bable.pages;

import com.bable.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BableEventsPage extends HomePage{

    public BableEventsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void searchHeaderDisplayed(){
        Assert.assertTrue(this.searchHeader.isDisplayed());
    }

    public void searchBoxAndBtnDisplayed(){
        Assert.assertTrue(this.searchBox.isDisplayed()&&this.searchBtn.isDisplayed());
    }

    @FindBy(xpath = "(//div[@class='tx-solr-search-form'])[2]//input")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='tx-solr-search-form'])[2]//button")
    public WebElement searchBtn;

    @FindBy(xpath = "//header[@class='search-header']")
    public WebElement searchHeader;

}
