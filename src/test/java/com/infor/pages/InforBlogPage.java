package com.infor.pages;

import com.infor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InforBlogPage {

    public InforBlogPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[@class=\"heading--2\"]/..//span")
    public List<WebElement> blogDatesList;

    public String lastBlogDateGetText(){

        for (int i = 0; i < blogDatesList.size(); i++) {
            return blogDatesList.get(0).getText();
        }

        return null;
    }

}
