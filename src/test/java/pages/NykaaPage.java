package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserManager;

public class NykaaPage {
    private WebDriver driver;

    public NykaaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class=\"MegaDropdownHeadingbox\"][1]")
    @Getter
    WebElement makeupIcon;

    @FindBy(xpath = "//a[text()='Face']")
    @Getter
    WebElement faceIcon;
    @FindBy(xpath = "\"//div[@class='css-ar51ef']\"")
    @Getter
    WebElement sortBy;
    @FindBy(xpath = "(//div[@class=\"control-box css-1ap0cm9\"])[2]")
    @Getter
    WebElement discount;
    @FindBy(xpath = "//a[@href=\"/makeup/face/face-primer/c/233?ptype=lst&id=233&root=nav_3&dir=desc&order=popularity\"]")
    @Getter
    WebElement facePrimerIcon;

    @FindBy(xpath = "//div[@class=\"control-box css-1ap0cm9\"][3]")
    @Getter
    WebElement Name;
    @FindBy(xpath = "//ul[@class=\"HeaderNav css-f7ogli\"][4]")
    @Getter
    WebElement NykaaFashion;
    @FindBy(xpath = "//a[@href=\"https://www.nykaafashion.com/women/indianwear/c/4\"]")
    @Getter
    WebElement IndianWear;

    //    @FindBy(xpath = "//a[@href=\"/women/c/6557?root=topnav_1\"]")
//    private WebElement  Women;
    @FindBy(xpath = "//div[@class=\"css-1ei6uu4\"]")
    @Getter
    WebElement Saree;
    @FindBy(xpath = "//a[@href=\"https://www.nykaafashion.com/recently-added/c/4878\"]")
    @Getter
    WebElement Recentlyadded;
    @FindBy(xpath = "//a[@href=\"/men/c/6823?root=topnav_1\"]")
    @Getter
    WebElement Men;
    @FindBy(xpath = "(//button[@class=\"css-1l1c5a0\"])[1]")
    @Getter
    WebElement WhatsNew;

    @FindBy(xpath = "//a[@href=\"https://www.nykaafashion.com/home/decor/c/8594\"]")
    @Getter
    WebElement decor;
    @FindBy(xpath = "//input[@placeholder=\"Search for products, styles, brands\"]")
    @Getter
    WebElement Searchbar;
    @FindBy(xpath = "(//a[text()='Puma'])[2]")
    @Getter
    WebElement puma;

    @FindBy(xpath = "//input[@placeholder=\"Search on Nykaa\"]")
    @Getter
    WebElement nykaaSearch;
}
//    public WebElement getNykaaSearch() {
//        return nykaaSearch;
//    }
//
//    public WebElement getPuma() {
//        return puma;
//    } //16

//    public WebElement getDecor() {
//        return decor;
//    }//14
//
//    public WebElement getSearchbar() {
//        return Searchbar;
//    }//15
//
//    public WebElement getNykaaFashion() {
//        return NykaaFashion;
//    } //7
//    public WebElement getIndianWear() {
//        return IndianWear;
//    } //8
//    public WebElement getWomen() {
//        return Women;
//    } //9
//    public WebElement getSaree() {
//        return Saree;
//
//    } //10
//    public WebElement getFacePrimerIcon() {
//        return facePrimerIcon;
//    } //5
//    public WebElement getName() {
//        return Name;
//    } //6
//    public WebElement getMakeupIcon() {
//        return makeupIcon;
//    } //1
//    public WebElement getFaceIcon() {
//        return faceIcon;
//    } //2
//    public WebElement getSortBy() {
//        return sortBy;
//    }  //3
//    public WebElement getDiscount() {
//        return discount;
//    } //4
//    public WebElement getRecentlyadded() {
//        return Recentlyadded;
//    }//11
//
//    public WebElement getMen() {
//        return Men;
//    }//12
//
//    public WebElement getWhatsNew() {
//        return WhatsNew;
//    }//13
//}