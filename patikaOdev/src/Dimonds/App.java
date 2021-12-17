package Dimonds;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yildizin Boyutunu giriniz\t:");
        int size = scanner.nextInt();
        int space = size - 1;
        int perLineStar = 1;
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= perLineStar; k++) {
                System.out.print("*");

            }
            space--;
            perLineStar += 2;
            System.out.println();

        }
        space = 1;
        perLineStar -= 4;
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= perLineStar; k++) {
                System.out.print("*");

            }
            space++;
            perLineStar -= 2;
            System.out.println();

        }

    }
}
