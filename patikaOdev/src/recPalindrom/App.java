package recPalindrom;

import java.io.Console;

public class App {

    static boolean isPalindrom(int number) {
        if (reverseNum(number) == number) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    static int reverseNum(int number) {
        int lenNumber = counter(number);
        if (lenNumber == 1)
            return number;
        return (int) ((number % 10) * Math.pow(10, lenNumber-1) + reverseNum(number / 10));
    }

    static int counter(int number) {
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }
      
        return counter;
    }

    public static void main(String[] args) {
        isPalindrom(898);
    }
}
