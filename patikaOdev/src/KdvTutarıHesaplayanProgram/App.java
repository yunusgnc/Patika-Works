package KdvTutarıHesaplayanProgram;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int anaPara;

        double kdvTutarı;

        System.out.print("Ana Para Giriniz : ");
        anaPara = inp.nextInt();

        if (anaPara == 0) {
            kdvTutarı = 1.18;
        } else if (anaPara == 1000) {
            kdvTutarı = 1.18;
        } else if (anaPara > 1000) {
            kdvTutarı = 0.8;
        } else {
            System.out.print("KDV tutarını Giriniz : ");
            kdvTutarı = inp.nextDouble();
        }

        System.out.println("KDV'siz Fiyat =" + anaPara);
        System.out.println("KDV'li Fiyat = " + anaPara * kdvTutarı);
        System.out.println("KDV tutarı =" + kdvTutarı);

    }

}
