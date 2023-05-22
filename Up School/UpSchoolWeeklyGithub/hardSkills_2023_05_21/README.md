# Up-School-Weekly
21.05.2023


Ali, yerel bir kütüphanenin işlerini daha verimli hale getirmek için bir kütüphane yönetim sistemi geliştirmek istiyor.
Bu sistem, kütüphane çalışanlarının kitapları kolayca takip edebilmesini, ödünç verme işlemlerini yönetebilmesini ve
kitap stoklarını güncel tutabilmesini sağlayacak. Ayrıca, oluşan hataları loglama dosyasına kaydederek hataları takip edebilmek istiyor.

Proje Özellikleri:

Kitap Sınıfı: Her kitabın bir adı, yazarı, yayınevi ve yayım yılı gibi özellikleri olmalı. Bu sınıf, kitapları temsil edecek ve verileri saklamak için kullanılacak.

Kütüphane Sınıfı: Bu sınıf, kitapların eklenmesi, silinmesi ve güncellenmesi gibi işlemleri gerçekleştirecek. Ayrıca kütüphanede bulunan kitapları listeleme,
ödünç alma ve iade etme gibi işlemleri de yapabilecek.

Ödünç Alma Sınıfı: Kullanıcıların kitap ödünç alma ve iade etme işlemlerini yönetecek. Bu sınıf, ödünç alınan kitapların süresini takip etmeli ve süre
dolan kitaplar için uyarılar göndermeli.

Kullanıcı Sınıfı: Kütüphaneyi kullanan kullanıcıları temsil edecek. Kullanıcılar, kitap ödünç alabilir, iade edebilir ve kütüphane kataloğunu görüntüleyebilir.

Exception Sınıfları: Hatalı durumları yönetmek için kendi exception sınıflarınızı oluşturun. Örneğin, "KitapBulunamadiHatasi", "KutuphaneDoluHatasi",
"KullaniciKitapSiniriAsildiHatasi" gibi hatalar oluşturulabilir.

Loglama Sınıfı: Oluşan hataları kaydetmek için bir loglama sınıfı oluşturun. Bu sınıf, hataları bir log dosyasına yazacak ve loglama işlemini gerçekleştirecektir.