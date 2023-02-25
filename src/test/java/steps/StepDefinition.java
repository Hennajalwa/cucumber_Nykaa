package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.NykaaPage;
import utils.*;

import java.util.HashMap;

public class StepDefinition {
    private WebDriver driver;
    Actions action;

    NykaaPage nykaaPage;
    String url;
    String url2;
    String url3;
    String url4;
    String url5;
    String url6;
    String currentWindow;
   HashMap<String, String> data;
    Scenario scenario;
    public StepDefinition(BrowserManager browserManager){
        this.driver =browserManager.getDriver();
    }
    @Before(order = 1)
    public void before(Scenario scenario)
    {
        this.scenario=scenario;
    }
    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);

    }
    @When("the user able to hover on  the makeup icon")
    public void the_user_able_to_hover_on_the_makeup_icon() throws InterruptedException {
        nykaaPage= new NykaaPage( driver);
        action =new Actions(driver);
        action.moveToElement(nykaaPage.getMakeupIcon()).build().perform();

    }
    @Then("the user should get the drop down page of makeup")
    public void the_user_should_get_the_drop_down_page_of_makeup() throws InterruptedException {
        WebElement makeup= nykaaPage.getMakeupIcon();
        Assert.assertTrue(makeup.isDisplayed());
    }
    @Then("the user able to click on the face icon")
    public void the_user_able_to_click_on_the_face_icon() throws InterruptedException {
        WebElement face= nykaaPage.getFaceIcon();
        Assert.assertTrue(face.isDisplayed());
       ClickUtils.click(driver,face);
    }


    @Then("the user able to click on the face primer icon")
    public void the_user_able_to_click_on_the_face_primer_icon() {
        WebElement facePrimer= nykaaPage.getFacePrimerIcon();
        ClickUtils.click(driver,facePrimer);
//    }
//    @Then("the user selects Name")
//    public void the_user_selects_name() {
//        WebElement name= nykaaPage.getName();
//        name.click();

    }
    @When("the user able to hover on Nykaa Fashion icon")
    public void the_user_able_to_hover_on_nykaa_fashion_icon() {
        nykaaPage= new NykaaPage( driver);
        action =new Actions(driver);
        action.moveToElement(nykaaPage.getNykaaFashion()).build().perform();
    }
    @Then("the user able to click on Indian wear on women icon")
    public void the_user_able_to_click_on_indian_wear_on_women_icon() {
        WebElement indianWear= nykaaPage.getIndianWear();
        Assert.assertTrue(indianWear.isDisplayed());
        ClickUtils.click(driver,indianWear);
    }

    @Then("the user able to click on saree")
    public void the_user_able_to_click_on_saree() throws InterruptedException {
        url3 = QaProps.getValue("url3");
        driver.getCurrentUrl();
        driver.get(url3);
        currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
        WebElement saree= nykaaPage.getSaree();
        ClickUtils.click(driver,saree);
    }
    @Then("the user able to visible with saree items")
    public void the_user_able_to_visible_with_saree_items() {

        System.out.println(" saree items");

    }
    @Then("the user able to click on recently added icon on whats new")
    public void the_user_able_to_click_on_recently_added_icon_on_whats_new() throws InterruptedException {
        WaitUtils.waitTillVisible(driver,nykaaPage.getRecentlyadded());
        WebElement recentlyAdded= nykaaPage.getRecentlyadded();
        Assert.assertTrue(recentlyAdded.isDisplayed());
        ClickUtils.click(driver,recentlyAdded);

    }

    @Then("the use able to hover on men icon")
    public void the_use_able_to_hover_on_men_icon() throws InterruptedException {
        url4 = QaProps.getValue("url4");
//        Thread.sleep(5000);
//        driver.getCurrentUrl();
        driver.get(url4);
//        currentWindow = driver.getWindowHandle();
//        driver.switchTo().window(currentWindow);
//        action.moveToElement(nykaaPage.getMen()).build().perform();

    }
    @Then("the user able to hover on What's New")
    public void the_user_able_to_hover_on_what_s_new() throws InterruptedException {

//        action.moveToElement(nykaaPage.getMen()).build().perform();
//        Thread.sleep(5000);
//        action.moveToElement(nykaaPage.getWhatsNew()).build().perform();
        nykaaPage= new NykaaPage( driver);
        action =new Actions(driver);
        action.moveToElement(nykaaPage.getMen()).build().perform();
        WaitUtils.waitTillVisible(driver,nykaaPage.getWhatsNew());
        action.moveToElement(nykaaPage.getWhatsNew()).build().perform();
    }
    @Then("the user able to click on Decor in Home")
    public void the_user_able_to_click_on_decor_in_home() throws InterruptedException {
        WaitUtils.waitTillVisible(driver,nykaaPage.getDecor());
        WebElement decor= nykaaPage.getDecor();
        Assert.assertTrue(decor.isDisplayed());
        ClickUtils.click(driver,decor);

    }

    @And("the user search Homesake on search bar")
    public void theUserSearchHomesakeOnSearchBar() throws InterruptedException {
        data = TestDataReader.getData(scenario.getName());
        url5= QaProps.getValue("url5");
        driver.get(url5);
        nykaaPage= new NykaaPage( driver);
        nykaaPage.getSearchbar().sendKeys(data.get("Typevalue"));
        nykaaPage.getSearchbar().sendKeys(Keys.ENTER);
    }
    @Then("the user able to click on puma in top brands")
    public void the_user_able_to_click_on_puma_in_top_brands() throws InterruptedException {
        WaitUtils.waitTillVisible(driver,nykaaPage.getPuma());
        WebElement puma = nykaaPage.getPuma();
        Assert.assertTrue(puma.isDisplayed());
        ClickUtils.click(driver, puma);
    }
    @Then("the user search xhy on search bar")
    public void the_user_search_xhy_on_search_bar() throws InterruptedException {
        data = TestDataReader.getData(scenario.getName());
        url6= QaProps.getValue("url6");
        driver.get(url6);
        nykaaPage= new NykaaPage( driver);
        nykaaPage.getSearchbar().sendKeys(data.get("Typevalue"));
        nykaaPage.getSearchbar().sendKeys(Keys.ENTER);
    }


    @When("the user enters item name as {string}")
    public void theUserEntersItemNameAs(String arg0) throws InterruptedException {
        nykaaPage= new NykaaPage( driver);
        WaitUtils.waitTillVisible(driver,nykaaPage.getNykaaSearch());
//        nykaaPage= new NykaaPage( driver);
        WebElement b=nykaaPage.getNykaaSearch();
         b.sendKeys(arg0);
         b.sendKeys(Keys.ENTER);
    }

    @Then("the user get the searched items")
    public void theUserGetTheSearchedItems() {

    }
}
