package Kuvvet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int limit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz.\t:");
        limit = scanner.nextInt();

        System.out.println(limit + "\tsayisina kadar olan 4 un kuvvetleri");
        for (int i = 0; i <= limit; i++) {
            if (Math.pow(4, i) <= limit) {
                System.out.println("4^" + i + "=" + Math.pow(4, i));
            }
        }

        System.out.println(limit + "\tsayisina kadar olan 5 in kuvvetleri");
        for (int i = 0; i <= limit; i++) {
            if (Math.pow(5, i) <= limit) {
                System.out.println("5^" + i + "=" + Math.pow(5, i));
            }
        }

    }
}
