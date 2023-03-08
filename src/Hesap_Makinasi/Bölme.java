package Hesap_Makinasi;

public class Bölme {

    public static double bolme(double sayi1, double sayi2){

        double result;
        if (sayi2 == 0){
            throw new IllegalArgumentException("Yanlis Giris");
        }else
            result = (sayi1/sayi2);
        return result;
    }

    }
