package KullaniciGirisi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String user, pass, isReset;

        Scanner inp = new Scanner(System.in);
        System.out.println("Hesap Makinası Programına Hoşgeldiniz :) ");
        System.out.print("Kullanıcı Adı :");
        user = inp.nextLine();
        System.out.print("Parola: ");
        pass = inp.nextLine();

        if (user.equals("Auba") && pass.equals("1234")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.print("Bilgileriniz Yanlış bilgilerinizi sıfırlamak istermisiniz ? E ? H?");
            isReset = inp.nextLine();
            if (isReset.equals("E")) {
                System.out.print("Yeni Parola: ");
                pass = inp.nextLine();
                if (pass.equals("1234")) {
                    System.out.println(
                            "Unuttuğu şifre ile aynı olamaz, Şifre oluşturulamadı, lütfen başka şifre giriniz");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    ;
                }
            } else {
                System.out.println("Giriş Yapılamadı.");
            }

        }

    }
}
