package com.bable.pages;

import com.bable.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void moveToAboutBable(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(this.aboutBableDropdown).perform();
    }

    public void moveToServices(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(this.servicesDropDown).perform();
    }

    public void allContentsDisplayed(){
        List<WebElement> allContents = new ArrayList<>();
        allContents.addAll(this.headerContents);
        allContents.addAll(this.mainContents);
        for (WebElement content : allContents) {
            Assert.assertTrue(content.isDisplayed());
        }
    }

    @FindBy(xpath = "(//div[@class='dd-top-link'])[1]")
    public WebElement aboutBableDropdown;

    @FindBy(xpath = "(//div[@class='dd-top-link'])[2]")
    public WebElement servicesDropDown;

    @FindBy(xpath = "//a[.='Accept']")
    public WebElement privacyNoticeAccept;

    @FindBy(xpath = "//span[.='About Us']")
    public WebElement aboutUsBtn;

    @FindBy(xpath = "//span[.='BABLE Events']")
    public WebElement bableEventsBtn;
    @FindBy(xpath = "//span[.='Newsroom']")
    public WebElement newsRoomBtn;

    @FindBy(xpath = "//span[.='CIVINET Iberia']")
    public WebElement civinetIberiaBtn;

    @FindBy(xpath = "//li//span[.='Log in']")
    public WebElement logInHomePageBtn;

    @FindBy(xpath = "//span[.='BABLE For Cities']/../..")
    public WebElement bableForCitiesBtn;

    @FindBy(xpath = "//span[.='BABLE For Companies']/../..")
    public WebElement bableForCompaniesBtn;

    @FindBy(xpath = "//span[.='BABLE For Networks']/../..")
    public WebElement bableForNetworksBtn;

    @FindBy(xpath = "//span[.='BABLE Academy']/../..")
    public WebElement bableForAcademyBtn;

    @FindBy(xpath = "//body/div[@class='nd-frame ']/div")
    public List<WebElement> headerContents;

    @FindBy(xpath = "//body/div[@class='content']/div")
    public List<WebElement> mainContents;

    @FindBy(xpath = "//i[@class='fas fa-search action-button']")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@class='search-bar']//input")
    public WebElement homePageSearchBar;

}
