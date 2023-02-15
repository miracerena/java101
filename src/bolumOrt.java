package src;

import java.util.Scanner;

public class bolumOrt {
    public static void main(String[] args) {
        int k, top = 0, n = 0, ort;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        k = inp.nextInt();

        for(int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                top += i;
                n++;
            }
        }
                ort = (top) / n;
                System.out.print("Ortalama : " + ort);
        }
    }
//https://app.patika.dev/miracerena


