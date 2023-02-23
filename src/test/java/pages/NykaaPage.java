package pages;

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
    private WebElement makeupIcon;
    @FindBy(xpath = "//a[text()='Face']")
    private WebElement faceIcon;
    @FindBy(xpath = "\"//div[@class='css-ar51ef']\"")
    private WebElement sortBy;
    @FindBy(xpath = "(//div[@class=\"control-box css-1ap0cm9\"])[2]")
    private WebElement discount;
    @FindBy(xpath = "//a[@href=\"/makeup/face/face-primer/c/233?ptype=lst&id=233&root=nav_3&dir=desc&order=popularity\"]")
            private WebElement facePrimerIcon;

    @FindBy(xpath = "//div[@class=\"control-box css-1ap0cm9\"][3]")
            private WebElement Name;
    @FindBy(xpath = "//ul[@class=\"HeaderNav css-f7ogli\"][4]")
    private WebElement NykaaFashion ;
    @FindBy(xpath = "//a[@href=\"https://www.nykaafashion.com/women/indianwear/c/4\"]")
    private WebElement  IndianWear;

//    @FindBy(xpath = "//a[@href=\"/women/c/6557?root=topnav_1\"]")
//    private WebElement  Women;
    @FindBy(xpath = "//div[@class=\"css-1ei6uu4\"]")
    private WebElement  Saree;
    @FindBy(xpath = "//a[@href=\"https://www.nykaafashion.com/recently-added/c/4878\"]")
    private WebElement Recentlyadded;
    @FindBy(xpath = "//a[@href=\"/men/c/6823?root=topnav_1\"]")
    private WebElement  Men;
    @FindBy(xpath = "(//button[@class=\"css-1l1c5a0\"])[1]")
    private WebElement  WhatsNew;

    @FindBy(xpath = "//a[@href=\"https://www.nykaafashion.com/home/decor/c/8594\"]")
    private WebElement  decor;
    @FindBy(xpath = "//input[@placeholder=\"Search for products, styles, brands\"]")
    private WebElement  Searchbar;
    @FindBy(xpath = "(//a[text()='Puma'])[2]")
    private WebElement  puma;

    @FindBy(xpath = "//input[@placeholder=\"Search on Nykaa\"]")
    private WebElement  nykaaSearch;

    public WebElement getNykaaSearch() {
        return nykaaSearch;
    }

    public WebElement getPuma() {
        return puma;
    } //16

    public WebElement getDecor() {
        return decor;
    }//14

    public WebElement getSearchbar() {
        return Searchbar;
    }//15

    public WebElement getNykaaFashion() {
        return NykaaFashion;
    } //7
    public WebElement getIndianWear() {
        return IndianWear;
    } //8
//    public WebElement getWomen() {
//        return Women;
//    } //9
    public WebElement getSaree() {
        return Saree;

    } //10
    public WebElement getFacePrimerIcon() {
        return facePrimerIcon;
    } //5
    public WebElement getName() {
        return Name;
    } //6
    public WebElement getMakeupIcon() {
        return makeupIcon;
    } //1
    public WebElement getFaceIcon() {
        return faceIcon;
    } //2
    public WebElement getSortBy() {
        return sortBy;
    }  //3
    public WebElement getDiscount() {
        return discount;
    } //4
    public WebElement getRecentlyadded() {
        return Recentlyadded;
    }//11

    public WebElement getMen() {
        return Men;
    }//12

    public WebElement getWhatsNew() {
        return WhatsNew;
    }//13
}