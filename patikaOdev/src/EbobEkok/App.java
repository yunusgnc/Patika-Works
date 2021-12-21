package EbobEkok;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("1. Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("1. Sayıyı Giriniz : ");
        num2 = input.nextInt();
        int ebob = 0, ekok;

        int i = num1;

        while (i >= 1) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        System.out.println("Ebob : " + ebob);

        ekok = (num1 * num2) / ebob;

        System.out.println("Ekok : " + ekok);

    }
    /*Alican bu deneme github pushudur*/
}
