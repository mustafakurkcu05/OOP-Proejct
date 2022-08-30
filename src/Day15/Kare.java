package Day15;

public class Kare {

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    // double kenar;   (bu halleri korumaya alınmamış hali)
    private double kenar;


   /* public double alanHesapla(){    (bu halleri korumaya alınmamış hali)
        return kenar*kenar; } */
    public double alanHesapla(){
        return kenar*kenar;
    }

   /* public double cevreHesapla(){   (bu halleri korumaya alınmamış hali)
        return 4*kenar; } */
    public double cevreHesapla(){
        return 4*kenar;

        /* korumaya almak için kenar üzeinden fare ile sag tıklayıp generate basıp
         ordan getter and setter tıklıyoruz */
    }

}
