package HarmonikSeri;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Sayıyı Giriniz :");
        n = inp.nextInt();

        System.out.println(HormonikSayi(n));
    }

    private static double HormonikSayi(int n) {
        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += 1 / i;
        }
        return result;
    }
}
