package Fibonacci;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, sum, n, k;

        System.out.print("Kaça kadarki Fibonacci serisi istersiniz : ");
        start = scanner.nextInt();
        n = 0;
        k = 1;
        for (int i = 1; i <= start; i++) {
            sum = n + k;
            System.out.println(n + " + " + k + " = " + sum);
            n = k;
            k = sum;
        }

    }
}
