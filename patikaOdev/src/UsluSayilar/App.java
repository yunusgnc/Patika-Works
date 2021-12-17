package UsluSayilar;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, k;
        System.out.print("Üssü alınacak sayıyı Giriniz :");
        n = inp.nextInt();
        System.out.print("Üssü olucak sayıyı Giriniz :");
        k = inp.nextInt();
        System.out.println(Pow(n, k));
    }

    public static int Pow(int n, int k) {
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n;
        }
        return result;
    }
}
