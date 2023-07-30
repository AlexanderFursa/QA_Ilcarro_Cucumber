package com.ilCarro.pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
  public HomePage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css="h1")
  WebElement title;

  public  HomePage isHomePageTitlePresent(){
    assert  isElementDisplayed(title);
    return this;
  }


  @FindBy(xpath = "//a[.=' Log in ']")
WebElement loginLink;
  public void clickOnLoginLink() {
  }
  public LoginPage clickOnLogin(){
    return new LoginPage(driver);
  }
}
