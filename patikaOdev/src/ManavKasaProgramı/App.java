package ManavKasaProgramı;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int armut, elma, domates, muz, patlican;

        System.out.print("Armut Kaç kilo : ");
        armut = inp.nextInt();
        System.out.print("Elma Kaç kilo : ");
        elma = inp.nextInt();
        System.out.print("Domates Kaç kilo : ");
        domates = inp.nextInt();
        System.out.print("Muz Kaç kilo : ");
        muz = inp.nextInt();
        System.out.print("Patlıcan Kaç kilo : ");
        patlican = inp.nextInt();

        double result = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5;
        System.out.println("Toplam Tutar : " + result + "₺");

    }
}
