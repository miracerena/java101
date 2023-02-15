package src;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args){
     int k, total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= i;
        }
        System.out.print(k + ".Faktoriyel : " + total);
    }
}
//https://app.patika.dev/miracerena
