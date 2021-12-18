package Atm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String username, pass;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select, tutar;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            username = input.nextLine();
            System.out.print("Parolanızı Giriniz : ");
            pass = input.nextLine();
            if (username.equals("auba") && pass.equals("1234")) {
                System.out.println("Sisteme Hoşgeldiniz");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz tutar :");
                        tutar = input.nextInt();
                        balance += tutar;
                        System.out.println("Güncel Bakiyeniz : " + balance);
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz tutar :");
                        tutar = input.nextInt();
                        balance -= tutar;
                        System.out.println("Güncel Bakiyeniz : " + balance);
                        break;
                    case 3:
                        System.out.println("Güncel Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Hoşçakalın...! :)");
                        break;
                    default:
                        System.out.println("Yanlış bir Tuşlama yaptınız Lütfen tekrar deneyiniz..");
                }

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Hakkınız : " + right);
            }
        }

    }
}
