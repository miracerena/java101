package src;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args){
        int n, value= 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        n = inp.nextInt();

        for (int i =1; i < n; i++){
            if (n%i == 0){
                value += i;
            }
        }
        if (value == n) {
            System.out.println(n + " Mukemmel bir sayidir.");
        } else {
            System.out.println(n + " Mukemmel bir sayi degildir.");
        }
    }
}
