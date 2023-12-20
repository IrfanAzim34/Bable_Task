package com.bable.pages;

import com.bable.utils.ConfigurationReader;
import com.bable.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends HomePage {

    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void logIn() {
        this.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        this.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        this.logInBtn.click();
    }

    public boolean logInPageIsDisplayed() {
        return (this.usernameBox.isDisplayed() &&
                this.passwordBox.isDisplayed() &&
                this.logInBtn.isDisplayed());
    }

    @FindBy(id = "2")
    public WebElement usernameBox;

    @FindBy(id = "3")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInBtn;


}
