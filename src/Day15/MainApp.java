package Day15;

public class MainApp {
    public static void main(String[] args) {
    Araba araba1=new Araba();
    araba1.marka="Audi";
    araba1.yas=5;
    araba1.silindirHacmi=1.8;


    Araba araba2 =new Araba();
    araba2.marka="Volvo";
    araba2.yas=10;
    araba2.silindirHacmi=2.5;

    araba1.bilgileriGoster();
    araba2.bilgileriGoster();


    Kare k1=new Kare();
     // k1.kenar=8;  // korumaya almadan once yazdıgımız
        k1.setKenar(7);
    double d1=k1.alanHesapla();

        System.out.println("Alan=" +d1);
        System.out.println("Cevre=" +k1.cevreHesapla());



        Dog dog1=new Dog("Kangal", "XL", 5, "Beyaz");






    }
}
