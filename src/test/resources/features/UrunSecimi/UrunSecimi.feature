@one
Feature: Giriş, Butik Kontrol, Ürün Seçimi, Çıkış

  Scenario Outline: Trendyol sitesinde butik kontrolleri ve sepete ürün eklenmesi
    Given Kullanıcı, Trendyol anasayfasını açar
    Then Çıkan reklam kapatılır
    And Kullanıcı, Trendyol <Başlık> ve <GirişYap> bilgisini görür
    Then Giriş yap butonuna basar
    When <Kullanıcı> ve <Şifre> ile sisteme giriş yapar
    Then KADIN tabına basar
    And Butik imajları kontrol eder
    Then ERKEK tabına basar
    And Butik imajları kontrol eder
    Then ÇOCUK tabına basar
    And Butik imajları kontrol eder
    Then AYAKKABI & ÇANTA tabına basar
    And Butik imajları kontrol eder
    Then SAAT & AKSESUAR tabına basar
    And Butik imajları kontrol eder
    Then KOZMETİK tabına basar
    And Butik imajları kontrol eder
    Then EV & YAŞAM tabına basar
    And Butik imajları kontrol eder
    Then ELEKTRONİK tabına basar
    And Butik imajları kontrol eder
    Then SÜPERMARKET tabına basar
    And Butik imajları kontrol eder
    Then Rastgele bir butik seçer
    And Ürün görsellerini kontrol eder
    Then Herhangi bir ürünün detayına gider
    And Ürünü sepete ekler
    And Kullanıcı, çıkış yapar

    Examples:
      | Kullanıcı | Şifre | Başlık | GirişYap |
      | USER      | PWD   | TITLE  | SIGNIN   |