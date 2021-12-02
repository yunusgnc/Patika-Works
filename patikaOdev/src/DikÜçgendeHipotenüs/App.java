package DikÜçgendeHipotenüs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double a, b, c;
        double result;

        Scanner inp = new Scanner(System.in);

        System.out.println("Üçgenin 1. Kenarını giriniz :");
        a = inp.nextInt();
        System.out.println("Üçgenin 2. Kenarını giriniz :");
        b = inp.nextInt();
        c = Math.sqrt((a * a) + (b * b));
        result = (a + b + c) / 3;

        System.out.println("Hipotenüs = " + c);
        System.out.println("Alan : " + result);

    }
}
