package HavaSicakligi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklık kaç derece :");
        sicaklik = inp.nextInt();

        System.out.println(sicaklik < 5 ? "Kayak yap"
                : sicaklik >= 5 && sicaklik <= 15 ? "Sinemaya Gidebilirsin"
                        : sicaklik >= 15 && sicaklik <= 25 ? "Pikniğe Gidebilirsin"
                                : sicaklik > 25 ? "Yüzmeye Gidebilirsin" : "Yanlış değer giirdiniz");

    }

}
