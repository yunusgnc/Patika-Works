package UcakBileti;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mesafe, yas, toplamTutar, yolculukTipi;
        double normalTutar, yasIndirimi;
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();
        System.out.print("Yaş Giriniz : ");
        yas = inp.nextInt();
        System.out.print("Yolculuk Tipi Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = inp.nextInt();
        normalTutar = (mesafe * 0.10);
        yasIndirimi = normalTutar * 0.10;
        double indirimliTutar = normalTutar - yasIndirimi;
        double gidisDonus = indirimliTutar * 0.20;

        if (yas < 12) {
            normalTutar /= 2;
            System.out.println("Toplam tutar : " + normalTutar);

        } else if (yas > 12 || yas < 24) {
            normalTutar *= 0.10;
            System.out.println("Toplam tutar : " + normalTutar);
        } else if (yas > 65) {
            normalTutar *= 0.30;
            System.out.println("Toplam tutar : " + normalTutar);

        } else {
            switch (yolculukTipi) {
                case 1:
                    System.out.println("Toplam tutar : " + normalTutar);
                    break;
                case 2:
                    Double total = normalTutar * 0.20;
                    System.out.println("Toplam Tutar : " + total);
                    break;
                default:
                    System.out.println("Hatalı veri Girişi");
            }
        }

    }
}
