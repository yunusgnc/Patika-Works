package DaireninAlanı;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int alan, cevre;

        System.out.print("Dairenin alanını giriniz :");
        alan = inp.nextInt();

        double result = Math.pow(alan, 2) * Math.PI;
        System.out.println("Dairenin Alanı : " + result);
        result = 2 * Math.PI * alan;
        System.out.println("Dairenin Çevresi : " + result);

    }

}
