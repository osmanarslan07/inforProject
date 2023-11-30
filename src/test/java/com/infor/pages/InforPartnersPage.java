package com.infor.pages;

import com.infor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InforPartnersPage {

    public InforPartnersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[14]/div[1]/div/div/div[3]/div/div/div/div/div[2]/div/a")
    public WebElement ReadTheBlogButton;



}
