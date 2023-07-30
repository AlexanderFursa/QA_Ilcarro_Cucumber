package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ilCarro.pages.BasePage.driver;

public class LoginSteps {

  @And(" User clicks on Log in link")
  public void click_on_Login_link() {
    new HomePage(driver).clickOnLoginLink();
  }

  @And("User enters valid data")
  public void enter_valid_data() {
    new LoginPage(driver).enterData("nvc@gmail.com", "Oli12345$");

  }

  @And("User clicks on Yalla button")
  public void clicks_on_Yalla_button() {
    new LoginPage(driver).clickOnYallaButton();

  }

  @And("User verifies  Log in message")
  public void verfies_Login_Message() {
    new LoginPage(driver).clickOnLoginMessage();
  }
  @And("User enters valid data email and wrong password")
  public void enters_valid_data_email_and_wrong_password(DataTable table){
    new LoginPage(driver).enterWrongData(table);
  }
  @Then("User verifies  error")
  public  void verify_error(){
    new LoginPage(driver).getError();
    return this;
  }
  @FindBy(xpath = "//h2[.='\"Login or Password incorrect\"']")
  WebElement error;

  public LoginPage getError(){
    assert  isElementDisplayed(error);
    return this;
  }
}
