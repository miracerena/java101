package src;

import java.util.Scanner;

public class basTop {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        number = inp.nextInt();

        int tempNum = number;
        int basNum = 0;
        int basValue;
        int result = 0;

        while ( number != 0) {
            basValue = number % 10;
            result += basValue;
            number /= 10;
        }
        System.out.print("Girdiniz sayinin basamaklari toplami : " + result);
    }
}
//https://app.patika.dev/miracerena
