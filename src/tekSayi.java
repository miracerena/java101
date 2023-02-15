package src;

import java.util.Scanner;

public class tekSayi {
    public static void main(String[] args) {
        int m;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz: ");
            m = inp.nextInt();
            if (m % 2 == 1) {
                total += m;
            }
        } while (m > 0);
        System.out.print("Toplam : " + total);

            }
        }
//https://app.patika.dev/miracerena

