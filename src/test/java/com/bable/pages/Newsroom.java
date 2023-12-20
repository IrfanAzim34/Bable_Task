package com.bable.pages;

import com.bable.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Newsroom extends HomePage{

    public Newsroom() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void allContentsDisplayed(){
        Assert.assertTrue(this.newsRoomHeaderText.isDisplayed());
        for (WebElement content : this.allOtherContents) {
            Assert.assertTrue(content.isDisplayed());
        }
    }

    @FindBy(xpath = "//div[@class='nd-frame newsroom-bg-image']//div[@class='nd-rich-text']")
    public WebElement newsRoomHeaderText;

    @FindBy(xpath = "//body/div[@class='content']/div")
    public List<WebElement> allOtherContents;

}
