package com.bable.pages;

import com.bable.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

}
