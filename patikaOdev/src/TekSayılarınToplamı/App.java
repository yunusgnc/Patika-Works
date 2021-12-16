package TekSayılarınToplamı;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int toplam = 0, sayi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        sayi = inp.nextInt();
        for (int i = 0; i <sayi; i++) {
            if (sayi % 2 == 0) {
                if (i % 2 == 0 && i % 4 == 0) {
                    toplam += i;
                }
            } else {
                System.out.println("Bu Sayı Tek bir sayıdır !");
                break;
            }
        }
        System.out.println(toplam);

    }
}
