package Taksimetre;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int minTutar , startPrice;
        double km ;
        double kmBasınaTutar = 2.20;
        minTutar = 20;
        startPrice=10;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Kaç Kilometre Gideceksin : ");
        km = inp.nextDouble();

        if(km*kmBasınaTutar<10){
            System.out.println("Tutar = "+minTutar);
        }
        else{
            System.out.println("Tutar =" + (km*kmBasınaTutar+startPrice));
        }
    }


    
}
