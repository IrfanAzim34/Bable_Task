package com.bable.pages;

import com.bable.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBablePage extends HomePage{

    public MyBablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean dashboardPageIsOpened(){
        return this.openProfileBtn.isDisplayed();
    }

    public void logOut(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(this.profileAvatarBtn).perform();
        this.logOutBtn.click();
    }

    @FindBy(xpath = "//a[@class='actionButton bable-btn-sec-medium']")
    public WebElement openProfileBtn;

    @FindBy(xpath = "//li[@class='avatar']")
    public WebElement profileAvatarBtn;

    @FindBy(xpath = "//li[@class='avatar']//li[3]")
    public WebElement logOutBtn;

    @FindBy(xpath = "//div[@class='profile']")
    public WebElement myProfileArea;

    @FindBy(xpath = "//div[@class='newChat']/a")
    public WebElement openDashboardBtn;

    @FindBy(xpath = "//a[@class='bable-btn-text submit']")
    public WebElement editProfileBtn;

    @FindBy(xpath = "//section[@class='personalData']")
    public WebElement generalDataArea;

    @FindBy(xpath = "//div[@class='backwardButton']")
    public WebElement editPageBackwardBtn;

}
