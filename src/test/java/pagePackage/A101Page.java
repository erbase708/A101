package pagePackage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.JSUtils;

public class A101Page {


    public A101Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='closePopupPersona']")
    public WebElement Close;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement ÇerezKabulEt;

    @FindBy(xpath="(//a[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement GiyimAksesuar;

    @FindBy (xpath = "(//a[@href='/giyim-aksesuar/kadin-ic-giyim/'])[2]")
    public WebElement KadınİçGiyim;

    @FindBy (xpath = "//a[@title='Dizaltı Çorap']")
    public WebElement DizaltıÇorap;

    @FindBy(xpath = "//label[@for='attributes_integration_colourSİYAH']")
    public WebElement Siyah;

    @FindBy(xpath = "//span[.='SİYAH ']")
    public WebElement Renk;


   // @FindBy(xpath = "//span[text()=\"SİYAH\"]")
   //public WebElement Renk;

   // @FindBy(xpath = "//label[@class='selected-filters-item']")
    //public WebElement Renk;

    @FindBy(xpath ="//em[@class='icon-sepetekle']")
    public WebElement AdetEkle;

    @FindBy(xpath ="//button[@class='add-to-basket button green block with-icon js-add-basket']" )
    public WebElement SepeteEkle;

    @FindBy(xpath ="//a[@class='go-to-shop']" )
    public WebElement SepetiGörüntüle;

    @FindBy(xpath ="//a[@class='button green checkout-button block js-checkout-button']" )
    public WebElement SepetiOnayla;

    @FindBy(xpath = "//input[@id=\"phone\"]")
    public WebElement TelNoGirin;

    @FindBy(xpath = "//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement ÜyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement Email;

    @FindBy(xpath = "//button[@class=\"button block green\"]")
    public WebElement DevamEt;

    @FindBy(partialLinkText = "Yeni adres oluştur")
    public WebElement YeniAdresOluştur;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement AdresBaşlığı;

    @FindBy(xpath = "//input[@name=\"first_name\"]")
    public WebElement Ad;

    @FindBy(xpath = "//input[@name=\"last_name\"]")
    public WebElement Soyad;

    @FindBy(xpath = "//input[@class=\"js-phone-number\"]")
    public WebElement CepTel;

    @FindBy(xpath = "//select[@class=\"js-cities\"]")
    public WebElement İl;

    @FindBy(xpath = "//select[@class=\"js-township\"]")
    public WebElement İlçe;

    @FindBy(xpath = "//select[@class=\"js-district\"]")
    public WebElement Mahalle;

   // @FindBy(xpath = "//textarea[@class=\"js-address-textarea\"]")
   // public WebElement Adres;

      @FindBy(xpath = "//textarea[@name='line']")
       public WebElement Adres;

   // @FindBy(xpath = "//button[@class=\"button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button\"]")
   // public WebElement Kaydet;

    @FindBy(xpath = "(//button[@type=\"button\"])[6]")
    public WebElement Kaydet;

    @FindBy(xpath = "(//div[@class='radio'])[4]")
    public WebElement MngKargo;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement KaydetVeDevamEt;

    @FindBy(xpath = "//span[@class='order-complete']")
    public WebElement SiparişiTamamla;

  //  @FindBy(xpath = "(//span[@class='error'])[2]")
   // public  WebElement LütfenKartSeçin;

    @FindBy(xpath = "(//div[@class=\"title\"])[9]")
    public WebElement LütfenKartBilgileriniziYazın;


}
