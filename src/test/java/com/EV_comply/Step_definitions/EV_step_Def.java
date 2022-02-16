package com.EV_comply.Step_definitions;

import com.EV_comply.Page.BasePage;
import com.EV_comply.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class EV_step_Def extends BasePage {

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {

        Driver.get().get(url);
    }

    @Then("the user can see {string} is displayed on the page")
    public void the_user_can_see_is_displayed_on_the_page(String expected) {
        expected = "Simplifying\nyour EV Charger installations";

        Assert.assertEquals(expected, h1HeaderMessage.getText());

    }

    @Then("the user can see Register interest Button")
    public void the_user_can_see_Register_interest_Button() {
        Assert.assertTrue(registerInterest.isDisplayed());
    }

    @Then("the user can see Watch Our Intro video")
    public void the_user_can_see_Watch_Our_Intro_video() {
        Assert.assertTrue(watchOurIntro.isDisplayed());

    }

    @Then("the user can see following links")
    public void the_user_can_see_following_links(List<String> expectedOptions) {

        BasePage.footLinksDisplayValidator(expectedOptions);
    }

    @Then("the user should be the page and click {string}")
    public void the_user_should_be_the_page_and_click(String string) {
        loginBtn.click();

    }

    @Then("the user should verify that the page loads successfully")
    public void the_user_should_verify_that_the_page_loads_successfully() {

        String url = Driver.get().getCurrentUrl();
        String actual_Url = "https://app.ev-comply.com/auth/register#login";
        Assert.assertEquals(url, actual_Url);
    }

    @Then("the user can see the following mobile apps")
   public void the_user_can_see_the_following_mobile_apps(List<String> expectedApps) throws InterruptedException {


      Thread.sleep(2000);

      for (int i = 0; i < linkForMobileApps.size(); i++) {
          Assert.assertEquals(linkForMobileApps.get(i).getText(), expectedApps.get(i));
      }
   }

  @Then("the user can see following options")
 public void the_user_can_see_following_options(List<String>termConditions) {
      for (int i = 0; i < privacyTermsCookiesList.size(); i++) {
          Assert.assertEquals(privacyTermsCookiesList.get(i).getText(), termConditions.get(i));

      }
  }

}



