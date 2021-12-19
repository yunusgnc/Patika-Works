package AsalSayi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        System.out.print("Bir Sayi Giriniz : ");
        sayi1 = scanner.nextInt();
        int sayac = 0;

        for (int i = 2; i <= sayi1; i++) {
            int asal = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = 1;
                    break;
                }
            }
            if (asal == 0) {
                System.out.print(i + " ");
                sayac++;
            }
        }
    }
}
