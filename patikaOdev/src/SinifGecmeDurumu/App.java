package SinifGecmeDurumu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik : ");
        matematik = input.nextInt();
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        System.out.print("Kimya : ");
        kimya = input.nextInt();
        System.out.print("Turkce : ");
        turkce = input.nextInt();
        System.out.print("Muzik : ");
        muzik = input.nextInt();

        sum = (matematik + fizik + muzik + kimya + fizik) / 5;
        if (matematik < 0 || fizik < 0 || kimya < 0 || turkce < 0 || muzik < 0 ||matematik > 100 || fizik > 100 || kimya > 100 || turkce > 100 || muzik > 100)
            System.out.println("Notlarınız 0 dan küçük ve 100 den büyük olamaz");
        else {
            System.out.println("Notunuz : " + sum );
        }
        

    }

}
