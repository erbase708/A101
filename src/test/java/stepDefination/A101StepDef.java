package stepDefination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pagePackage.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

public class A101StepDef {

    private WebDriver driver;
    A101Page a101Page= new A101Page();



    @Given("A101 resmi sitesine gidin")
    public void a101_resmi_sitesine_gidin_https_www_a101_com_tr() {
        Driver.getDriver().get(ConfigReader.getProperty("a101_url"));
        a101Page.ÇerezKabulEt.click();
    }

    @Given("Giyim--> Aksesuar--> Kadın İç Giyim bölümüne gidin")
    public void giyim_aksesuar_kadın_i̇ç_giyim_bölümüne_gidin() {

        Driver.clickWithJS(a101Page.GiyimAksesuar);

        Driver.clickWithJS(a101Page.KadınİçGiyim);

    }
    @Given("Dizaltı Çorap bölümüne girin.")
    public void dizaltı_çorap_bölümüne_girin() {

        Driver.clickWithJS(a101Page.DizaltıÇorap);

    }

    @Given("Siyah filtre seçin")
    public void siyah_filtre_seçin() {
        Driver.clickWithJS(a101Page.Siyah);

    }
    @Then("Açılan ürünün siyah olduğu doğrulayın.")

    public void açılan_ürünün_siyah_olduğu_doğrulayın() throws InterruptedException {
       Thread.sleep(4000);
       String seçilenürünrenk = a101Page.Renk.getText();
       String beklenenürünrenk = "SİYAH";
       Assert.assertEquals(beklenenürünrenk,seçilenürünrenk);
    //    System.out.println(a101Page.Renk.getText());
      //  boolean isTrue = a101Page.Renk.getText().contains("Siyah");
       // Assert.assertTrue(isTrue);



    }
    @When("Siyah bir çorap seçip,Sepete ekle butonuna tıklayın.")
    public void siyah_bir_çorap_seçip_sepete_ekle_butonuna_tıklayın() {

        Driver.clickWithJS(a101Page.AdetEkle);
        Driver.clickWithJS((a101Page.SepeteEkle));

    }
    @When("Sepeti Görüntüle butonuna tıklayın.")
    public void sepeti_görüntüle_butonuna_tıklayın() {
        Driver.clickWithJS(a101Page.SepetiGörüntüle);

    }
    @When("Sepeti Onayla butonuna tıklayın.")
    public void sepeti_onayla_butonuna_tıklayın() {
        Driver.clickWithJS(a101Page.SepetiOnayla);

    }
    @When("Telefon numarası girin.")
    public void telefon_numarası_girin(){
        Driver.clickWithJS(a101Page.TelNoGirin);
        a101Page.TelNoGirin.sendKeys("05525895828");

    }
    @When("Üye olmadan devam et butonuna tıklayın.")
    public void üye_olmadan_devam_et_butonuna_tıklayın() {
        Driver.clickWithJS(a101Page.ÜyeOlmadanDevamEt);

    }
    @When("Email girin.")
    public void email_girin() {
        Driver.waitForVisibility(a101Page.Email,3);
        a101Page.Email.sendKeys("erbase@gmail.com");
        Driver.clickWithJS(a101Page.ÜyeOlmadanDevamEt);


    }
    @When("Devam et butonuna tıklayın.")
    public void devam_et_butonuna_tıklayın() throws InterruptedException {
        Driver.clickWithJS(a101Page.DevamEt);
       Thread.sleep(3000);

    }


    @When("Yeni adres oluştur tıklayın.")
    public void yeni_adres_oluştur_tıklayın() throws InterruptedException {
        Driver.clickWithJS(a101Page.YeniAdresOluştur);
        Thread.sleep(3000);

    }
    @When("Adres sayfası doldurulur")
    public void adres_sayfası_doldurulur() throws InterruptedException {
        Driver.clickWithJS(a101Page.AdresBaşlığı);
        a101Page.AdresBaşlığı.sendKeys("ev");
        a101Page.Ad.sendKeys("Emine");
        a101Page.Soyad.sendKeys("Keser");
        Driver.clickWithJS(a101Page.CepTel);
        a101Page.CepTel.sendKeys("05525585828");
        Select select1=new Select(a101Page.İl);
        select1.selectByValue("16");
        Thread.sleep(4000);
        Select select2=new Select(a101Page.İlçe);
        select2.selectByIndex(5);
        Thread.sleep(3000);
        Select select3=new Select(a101Page.Mahalle);
        select3.selectByIndex(4);
        Driver.clickWithJS(a101Page.Adres);
        Thread.sleep(3000);

        Faker faker=new Faker();
        a101Page.Adres.sendKeys(faker.address().fullAddress());
        Driver.clickWithJS(a101Page.Kaydet);



    }
    @When("Kargo seçeneği seçin ve onaylayın")
    public void kargo_seçeneği_seçin_ve_onaylayın() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(a101Page.MngKargo);
        Thread.sleep(3000);
        Driver.clickWithJS(a101Page.KaydetVeDevamEt);

    }
    @When("Açılan ödeme ekranında siparişi tamamla butonuna tıklayın")
    public void açılan_ödeme_ekranında_siparişi_tamamla_butonuna_tıklayın() {
        Driver.clickWithJS(a101Page.SiparişiTamamla);

    }
    @Then("sonra ödeme ekranı geldiğini doğrulayın.")
    public void sonra_ödeme_ekranı_geldiğini_doğrulayın() throws InterruptedException {

       Thread.sleep(2000);
       // Driver.waitForVisibility(a101Page.LütfenKartBilgileriniziYazın,3);
        String beklenenBaşlık = a101Page.LütfenKartBilgileriniziYazın.getText();
        String gerçekBaşlık = "Lütfen Kart bilgilerinizi yazın.";
        Assert.assertEquals(beklenenBaşlık, gerçekBaşlık);
         Driver.closeDriver();


    }
}
