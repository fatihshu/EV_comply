package com.EV_comply.Step_definitions;

import com.EV_comply.Page.BasePage;
import com.EV_comply.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class EV_step_Def {


    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {

        Driver.get().get(url);
    }

        @Then("the user can see {string} is displayed on the page")
        public void the_user_can_see_is_displayed_on_the_page (String expected){
            expected = "Simplifying\nyour EV Charger installations";
            Assert.assertEquals(Driver.get().findElement(By.xpath("//h1")).getText(), expected);
        }


        @Then("the user can see Register interest Button")
        public void the_user_can_see_Register_interest_Button () {
            Assert.assertTrue(Driver.get().findElement(By.xpath("(//*[.='Register interest'])[1]")).isDisplayed());
        }

    @Then("the user can see Watch Our Intro video")
    public void the_user_can_see_Watch_Our_Intro_video() {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//img[@data-target='#myModal']")).isDisplayed());


    }

    @Then("the user can see following links")
        public void the_user_can_see_following_links(List<String>expectedOptions) {

        BasePage.footLinksDisplay(expectedOptions);
    }

    }





    //for (String footerLinks : optios) {
//                switch (footerLinks.toLowerCase()){
//                    case "about":
//                        Assert.assertTrue( Driver.get().findElement(By.xpath("(//a[@href='https://www.ev-comply.com'])[2]/../ul/li")).isDisplayed());
//                        break;
//
//
//                }
//
//            }
//
//        }