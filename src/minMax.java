package src;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args){
        int value, n, max=0, min=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz ? ");
        n = inp.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.print(i + ". Sayiniz: ");
            value = inp.nextInt();

            if (i == 1){
                value = max;
                value = min;
            }
            if (value > max){
                max =value;
            }
            if (value < min){
                min = value;
            }
        }
        System.out.println("Maksimum deger: " + max);
        System.out.print("Minimum deger: " + min);


    }
}
//https://app.patika.dev/miracerena