package MukkemelSayi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.print("Bir Sayi Giriniz : ");
        sayi = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sum += i;
            }
        }
        if (sayi == sum) {
            System.out.println(sayi + " Mükemmel Sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel Sayi Değildir.");
        }

    }
}
