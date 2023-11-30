package com.infor.step_definitions;

import com.infor.pages.InforBlogPage;
import com.infor.pages.InforHomePage;
import com.infor.pages.InforPartnersPage;
import com.infor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class InforStepDefinitions {

    InforHomePage inforHomePage = new InforHomePage();
    Actions actions = new Actions(Driver.getDriver());
    InforPartnersPage inforPartnersPage = new InforPartnersPage();
    InforBlogPage inforBlogPage = new InforBlogPage();



    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://www.infor.com/");
        Driver.getDriver().manage().window().maximize();

    }

    @When("user clicks product partners on Partners section")
    public void user_clicks_product_partners_on_partners_section() {
        actions.moveToElement(inforHomePage.topMenuPartnersSection).perform();
        inforHomePage.topMenuPartnersSectionProductPartnersButton.click();

    }

    @When("user clicks Read the blog button")
    public void user_clicks_read_the_blog_button() {

        inforPartnersPage.ReadTheBlogButton.click();
    }


    @Then("user should see that last blog is published on {string}")
    public void userShouldSeeThatLastBlogIsPublishedOn(String expectedDate) {

        String actualDate = inforBlogPage.lastBlogDateGetText();
        Assert.assertEquals(expectedDate,actualDate);


        System.out.println("expectedDate = " + expectedDate);
        System.out.println("actualDate = " + actualDate);

    }
}
