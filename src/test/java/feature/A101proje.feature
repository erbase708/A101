@A101_Proje
Feature: A101 Website Test

  Scenario: Uçtan uca ödeme ekranına kadar Selenium’da
  java dili ile chrome browser kullanarak test otomasyonu yapmak.

    Given A101 resmi sitesine gidin
    And Giyim--> Aksesuar--> Kadın İç Giyim bölümüne gidin
    And Dizaltı Çorap bölümüne girin.
    And Siyah filtre seçin
    Then Açılan ürünün siyah olduğu doğrulayın.
    When Siyah bir çorap seçip,Sepete ekle butonuna tıklayın.
    And Sepeti Görüntüle butonuna tıklayın.
    And Sepeti Onayla butonuna tıklayın.
    And Telefon numarası girin.
    And Üye olmadan devam et butonuna tıklayın.
    And Email girin.
    And Devam et butonuna tıklayın.
    When Yeni adres oluştur tıklayın.
    And Adres sayfası doldurulur
    And Kargo seçeneği seçin ve onaylayın
    And Açılan ödeme ekranında siparişi tamamla butonuna tıklayın
    Then sonra ödeme ekranı geldiğini doğrulayın.