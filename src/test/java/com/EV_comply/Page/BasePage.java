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
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//h1")
    public static WebElement h1HeaderMessage;

    @FindBy(xpath = "//img[@data-target='#myModal']")
    public static WebElement watchOurIntro;

    @FindBy(xpath = "(//*[.='Register interest'])[1]")
    public static WebElement registerInterest;

    @FindBy(xpath = "(//a[@href='https://www.ev-comply.com'])[2]/../ul/li")
    public static List<WebElement> footLink2;

    @FindBy(xpath = "//div[@class='col']/a")
    public static List<WebElement> privacyTermsCookiesList;

    @FindBy(xpath = "//*[.='Login']")
    public static WebElement loginBtn;

    @FindBy(css = ".col-lg-5.col-md-4.d-block")
    public static List<WebElement> linkForMobileApps;



        public static void footLinksDisplayValidator(List<String> options) {
        try {
            for (String footerLinks : options) {
                switch (footerLinks) {
                    case "About":
                        assertEquals("About",footLink2.get(0).getText());
                        break;
                    case "Pods & Blogs":
                        assertEquals("Pods & Blogs",footLink2.get(1).getText());
                    case "Partners":
                        assertEquals("Partners",footLink2.get(2).getText());
                        break;
                    case "Testimonials":
                        assertEquals("Testimonials", footLink2.get(3).getText());
                        break;
                    case "EVC Network":
                        assertEquals("EVC Network", footLink2.get(4).getText());
                        break;
                    case "Careers":
                        assertEquals("Careers",footLink2.get(5).getText());;
                        break;
                    case "Sign-in":
                        assertEquals("Sign-in", footLink2.get(6).getText());
                        break;
                    case "Register interest":
                        assertEquals("Register interest", footLink2.get(7).getText());
                        break;
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }}
