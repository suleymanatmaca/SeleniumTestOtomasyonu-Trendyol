# Trendyol
Trendyol Test Otomasyon Scriptleri
-Sisteme kayıtlı bir kullanıcı ile login olma
-Tablara tıklanıp yüklenmeyen butik imajlarını loglama
-Rastgele bir bıtiğe giderek görsellerin yüklenip yüklenmediğini kontrol etme
-Herhangi bir ürünün detayına gidildi
-Ürünü sepete ekleyip test tamamlandı
Ek notlar: • Testin çalışacağı tarayıcı parametrik olarak gönderildi (chrome, ff vb.)

Proje, geliştirme ortamı IntelliJ IDEA da Java programlama dili ile kodlanmıştır. Maven build aracı kullanılmıştır. BDD dili olarak Cucumber kullanılmıştır. Page Object pattern ve Screenplay pattern kullanılmıştır. İşler Model-Task-Question lara bölünmüştür. Kullanıcı adı şifre, aranacak kelime vb. parametreler json formatında saklanmıştır. Browser, URL ve Data bilgileri base.properties dosyasından çekilmektedir. Timeouts ve webdriver location bilgiler serenity.properties (default) dosyasından çekilmektedir. Feature kodları genel olarak steps altındaki klasörde giriş-çıkış ve ürün işlemi olarak farklı classlarda yazılmıştır.
