package ArtıkYıl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tarih;
        System.out.print("Tarihi Giriniz : ");
        tarih = inp.nextInt();

        int controller = tarih % 4;

        if (controller == 0)
            System.out.println(tarih + " bir artık yıldır !");
        else
            System.out.println(tarih + " bir artık yıldır değildir !");

    }
}
