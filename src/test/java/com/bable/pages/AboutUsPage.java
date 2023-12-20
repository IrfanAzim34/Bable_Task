package com.bable.pages;

import com.bable.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AboutUsPage extends HomePage{

    public AboutUsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyAllContentsDisplayed(){
        for (WebElement content : this.contents) {
            Assert.assertTrue(content.isDisplayed());
        }
    }

    @FindBy(xpath = "//div[@class='nd-frame ']")
    public List<WebElement> contents;

}
