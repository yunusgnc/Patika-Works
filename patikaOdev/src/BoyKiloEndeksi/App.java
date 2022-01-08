package BoyKiloEndeksi;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy, kilo, sonuc;
        System.out.print("Boyunuzu Giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu Giriniz :");
        kilo = inp.nextDouble();
        sonuc = kilo / Math.pow(boy, 2);
        System.out.println("Vücut Kitle İndeksiniz :" + sonuc);
    }
}
