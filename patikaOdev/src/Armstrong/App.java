package Armstrong;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, result = 0, r;
        System.out.print("Sayıyı Giriniz :");
        n = inp.nextInt();
        r = n;
        int counter = 0;
        while (n != 0) {
            n /= 10;
            counter++;
        }
        for (int i = 0; i < counter; i++ ) {
            n = r % 10;
            r /= 10;
            result += n;
        }
        System.out.println(result);
    }
}
