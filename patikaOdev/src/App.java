import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;
        double sum;
        System.out.print("Matematik : ");
        matematik = input.nextInt();
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        System.out.print("Kimya : ");
        kimya = input.nextInt();
        System.out.print("Turkce : ");
        turkce = input.nextInt();
        System.out.print("Tarih : ");
        tarih = input.nextInt();
        System.out.print("Muzik : ");
        muzik = input.nextInt();

        sum = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamaniz:" + sum);

        System.out.println((sum >= 60) ? "gectiniz!" : "kaldiniz");
    }

}
