package TersUcgen;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.print("Bir Sayi Giriniz : ");
        sayi = scanner.nextInt();

        for (int i = sayi; i >= 0; i--) {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
