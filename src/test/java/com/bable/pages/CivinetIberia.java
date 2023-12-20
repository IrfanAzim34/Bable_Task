package com.bable.pages;

import com.bable.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CivinetIberia extends HomePage{

    public CivinetIberia(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void allContentsDisplayed(){
        Assert.assertTrue(this.civinetIberiaHeaderText.isDisplayed());
        for (WebElement content : this.allOtherContents) {
            Assert.assertTrue(content.isDisplayed());
        }
    }

    @FindBy(xpath = "//div[@class=\"nd-header with-background-image\"]//div[@class='text']")
    public WebElement civinetIberiaHeaderText;

    @FindBy(xpath = "//body/div[@class='content']/div")
    public List<WebElement> allOtherContents;

}
