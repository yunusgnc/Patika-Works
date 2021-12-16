package BurcProgramı;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int km;
        int age;
        int travelType;
        double perKmPrice = 0.10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac km ucacaksiniz?\t:");
        km = scanner.nextInt();
        System.out.print("Kac yasindasiniz?\t:");
        age = scanner.nextInt();
        System.out.println("Tek bilet icin 1'e basin, Gidis Donus icin 2'ye basin.\t");
        travelType = scanner.nextInt();
        int result = checkValues(km, age, travelType);

        if (result != 1) {
            System.out.println("Yeniden deneyin.");
        } else {
            double normalTutar = km * perKmPrice;
            System.out.println("Normal Tutar\t:" + normalTutar);
            if (age < 12) {
                normalTutar = normalTutar - (normalTutar * 0.50);
                System.out.println("12'den kucuk indirimli fiyat\t:" + normalTutar);
            } else if (age <= 24) {
                normalTutar = normalTutar - (normalTutar * 0.10);
                System.out.println("12 ile 24 yas arasi  indirimli fiyat\t:" + normalTutar);
            } else if (age >= 65) {
                normalTutar = normalTutar - (normalTutar * 0.30);
                System.out.println("65 yas ustu indirimli fiyat\t:" + normalTutar);
            } else {
                System.out.println("Yas indirimi yapilamadi.");
            }

            if (travelType == 2) {
                normalTutar = normalTutar - (normalTutar * 0.20);
                normalTutar *= 2;
                System.out.println("Gidis donus indirimli fiyat\t:" + normalTutar);
            }
        }

    }

    public static int checkValues(int km, int age, int travelType) {
        if (km < 0) {
            System.out.println("Hatali Deger Girdiniz.");
            return 0;
        }
        if (age < 0) {
            System.out.println("Hatali Deger Girdiniz.");
            return 0;
        }
        if (travelType <= 0 || travelType >= 3) {
            System.out.println("Hatali Deger Girdiniz.");
            return 0;
        }
        return 1;
    }
}
