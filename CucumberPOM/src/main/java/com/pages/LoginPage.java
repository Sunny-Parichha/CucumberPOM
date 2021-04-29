package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    //1. By Locators
    private By emailId = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By forgotPwdLink = By.linkText("Forgot your password?");

    //2. Constructor of the page class
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //3. page actions: features of the page
    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean isForgotPwdLinkExist(){
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

    public void enterUsername(String username){
        driver.findElement(emailId).sendKeys(username);
    }

    public void enterPassword(String passwrd){
        driver.findElement(password).sendKeys(passwrd);
    }

    public void clickOnLogin(){
        driver.findElement(signInButton).click();
    }
}
