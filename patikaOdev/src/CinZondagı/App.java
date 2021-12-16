package CinZondagı;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dTarihi;
        System.out.print("Dogum Tarihinizi Giriniz : ");
        dTarihi = inp.nextInt();

        String[] animals = new String[] { "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun" };

        int kalan = dTarihi % 12;
        System.out.println(animals[kalan]);

    }
}
