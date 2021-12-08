package HesapMakinası;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double sayi1, sayi2;
        int secim;
        Scanner inp = new Scanner(System.in);
        System.out.println("Hesap Makinası Programına Hoşgeldiniz :) ");
        System.out.print("Sayı 1 :");
        sayi1 = inp.nextDouble();
        System.out.print("Sayı 2 : ");
        sayi2 = inp.nextDouble();
        System.out.println(" Toplama : 1 \n Çıkarma : 2 \n Çarpma : 3 \n Bölme : 4 \n");
        System.out.print("Seçiminizi Seçiniz : ");
        secim = inp.nextInt();

        switch (secim) {
            case 1:
                System.out.println(sayi1 + sayi2);
                break;
            case 2:
                System.out.println(sayi1 - sayi2);
                break;
            case 3:
                System.out.println(sayi1 * sayi2);
                break;
            case 4:
                System.out.println(sayi1 / sayi2);
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
        }

    }
}
