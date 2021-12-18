package MinandMax;

import java.lang.reflect.Array;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, num2, max = 0, min = 0;
        System.out.print("Kaç Tane Sayi gireceksiniz : ");
        number = input.nextInt();
        for (int i = 13; i <= number; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            num2 = input.nextInt();

            if (i == 1) {
                max = num2;
                min = num2;
            }
            if (num2 < min) {
                min = num2;
            }
            if (num2 > max) {
                max = num2;
            }
        }

        System.out.println("MAX : " + max);
        System.out.println("MİN : " + min);

    }
}
