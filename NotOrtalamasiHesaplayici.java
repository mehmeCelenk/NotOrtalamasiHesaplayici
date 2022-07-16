import java.util.Scanner;

public class NotOrtalamasiHesaplayici {
    public static void main(String[] args) {
       //Değişkenleri oluştur
        int mat,turk,tarih,fizik,kimya,muzik;

        //kullanıcıdan değer alma
        Scanner scan = new Scanner(System.in);

        System.out.println("Not ortalaması hesaplayıcıya hoşgeldiniz lütfen notlarınızı giriniz");

        System.out.print("Matematik notunuzu giriniz :");
        mat = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz :");
        turk = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz :");
        tarih = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz :");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kimya = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz :");
        muzik = scan.nextInt();


        int toplam = (mat+turk+tarih+fizik+kimya+muzik);
        double sonuc = toplam /6.0;
        System.out.println("Not ortalamanız :" + sonuc);
        String notOrtalamsi = sonuc >= 60 ? "Tebrikler Sınıfı geçtiniz": "Maalesef Sınıfta kaldınız";
        System.out.println(notOrtalamsi);

    }
}