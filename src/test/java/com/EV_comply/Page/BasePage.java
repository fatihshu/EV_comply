package com.EV_comply.Page;

import com.EV_comply.Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {
    @FindBy(xpath = "//h1")
    public static WebElement h1HeaderMessage;

    @FindBy(xpath = "(//*[.='Register interest'])[1]")
    public static WebElement registerInterestBtn1;

    @FindBy(xpath = "//img[@data-target='#myModal']")
    public static WebElement watchOurIntro;

    @FindBy(className = "button-store")
    public static List<WebElement> linkForMobileApps;

    @FindBy(xpath = "(//a[@href='https://www.ev-comply.com'])[2]/../ul/li")
    public static List<WebElement> footLink2;

    @FindBy(xpath = "//div[@class='col']/a")
    public static List<WebElement> privacyTermsCookiesList;

    @FindBy(xpath = "//*[.='Login']")
    public static WebElement loginBtn;


    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
  public static void footLinksDisplay(List<String> footer){

        List<String>actualFootLinks=new ArrayList<>();
      actualFootLinks.add(Driver.get().findElements(footLink2).getText());



      Assert.assertTrue(actualFootLinks.contains(footer));
  }
}
