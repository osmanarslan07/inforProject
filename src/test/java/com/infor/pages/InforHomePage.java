package com.infor.pages;

import com.infor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InforHomePage {

    public InforHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//li[@class='primary__item']//a[.='Partners']")
    public WebElement topMenuPartnersSection;

    @FindBy(xpath = "//div[@class='grid']//a[.='Product Partners']")
    public WebElement topMenuPartnersSectionProductPartnersButton;






}
