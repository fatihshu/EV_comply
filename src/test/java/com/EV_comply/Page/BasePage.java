package com.EV_comply.Page;

import com.EV_comply.Utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//h1")
    public  WebElement h1HeaderMessage;

    @FindBy(xpath = "//img[@data-target='#myModal']")
    public WebElement watchOurIntro;

    @FindBy(xpath = "(//*[.='Register interest'])[1]")
    public  WebElement registerInterest;

    @FindBy(xpath = "//div[@class='col']/a")
    public List<WebElement> privacyTermsCookiesList;

    @FindBy(xpath = "//*[.='Login']")
    public  WebElement loginBtn;

    @FindBy(css = ".col-lg-5.col-md-4.d-block")
    public  List<WebElement> linkForMobileApps;


    @FindBy(xpath = "(//a[@href='https://www.ev-comply.com'])[2]/../ul/li")
    public  static List<WebElement> footLink2;


    public static List<String> footerLinksValidator() {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : footLink2) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

}
