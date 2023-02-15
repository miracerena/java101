package src;

import java.util.Scanner;

public class armstrongSayi {
    public static void main(String[] args) {
        /* Armstrong sayi n haneli bir sayinin basamaklarininn n'inci ustlerinin toplami,
        sayinin kendisine esit olan sayilardir.
         ornek: 407 = (4^3)+(0^3)+(7^3) */

        int number;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        number = inp.nextInt();

        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int basPow;
        int result = 0;



        while (tempNumber != 0) {
            //oncelikle girdimizin basamak sayisini bulmamiz gerekiyor.
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            //Daha sonra mod10 alarak basamaklarin degerini ogreniriz.
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;

        }
        if (result == number ) {
            System.out.print(number + " sayisi bir Armstrong sayidir.");
        } else {
            System.out.print(number +  " sayisi bir Armstrong sayi degildir.");
        }

    }
}
//https://app.patika.dev/miracerena
