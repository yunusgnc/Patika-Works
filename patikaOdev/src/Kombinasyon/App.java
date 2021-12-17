package Kombinasyon;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, total = 1, result;
        System.out.print("Birinci Sayı Giriniz :");
        n = inp.nextInt();
        System.out.print("İkinci Sayı Giriniz :");
        r = inp.nextInt();
        result = faktoriyel(n, total) / (faktoriyel(r, total) * faktoriyel((n - r), total));
        System.out.println(result);
    }

    public static int faktoriyel(int n, int total) {
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

}
