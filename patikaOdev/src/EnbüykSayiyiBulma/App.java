package EnbüykSayiyiBulma;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("1. Sayi :");
        sayi1 = inp.nextInt();
        System.out.print("2. Sayi :");
        sayi2 = inp.nextInt();
        System.out.print("3. Sayi :");
        sayi3 = inp.nextInt();

        int[] arr = new int[] { sayi1, sayi2, sayi3 };

        Arrays.sort(arr);
        System.out.print("Sonuç : ");
        for (int i : arr) {
            System.out.print( i +" > ");
        }
        System.out.println();

    }
}
