package Hesap_Makinasi;

public class Test {

    public static void main(String[] args) {
        System.out.println(Carpma.carpma(3, 5));

        Toplama top = new Toplama();    // Toplama classindan object olusturuyoruz
        top.toplama(24,25);         // Toplama classinin metodunu cagiriyoruz.


       System.out.println("Bölme.bolme(42,6) = " + Bölme.bolme(42, 6));
 
    }
}
