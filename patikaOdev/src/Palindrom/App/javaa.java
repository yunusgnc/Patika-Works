package Palindrom.App;

import java.util.Scanner;

public class javaa {
    public static void main(String[] args) {

        System.out.println(isPolindrom(454));

    }

    static  boolean isPolindrom(int number){
        int   temp = number, lastNumber , reverseNumber=0;

        while (temp!=0){
            lastNumber= number%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp /=10;
        }
        System.out.println(reverseNumber);
        if(number==reverseNumber)
            return  true;
        else
            return false;

    }
}
