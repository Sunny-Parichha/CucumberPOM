package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSPage {

    private WebDriver driver;

    private By accountSections = By.cssSelector("div#center_column span");

    public AccountSPage(WebDriver driver){
        this.driver = driver;
    }

    public int getAccountsSectionCount(){

        return driver.findElements(accountSections).size()-1;
    }

    public List<String> getAccountsSectionList(){
        List<String> accountsList = new ArrayList<>();
        List<WebElement> accountsHeaderList = driver.findElements(accountSections);

        for (WebElement e : accountsHeaderList){
            String text = e.getText();
            System.out.println(text);
            accountsList.add(text);
        }

        return accountsList;
    }
}
