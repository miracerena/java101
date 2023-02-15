package src;

import java.util.Scanner;

public class forr {
    public static void main(String[] args) {
       /* for (int o = 3; o <=10; o++) {
            System.out.println(o);
        } */


        Scanner inp = new Scanner(System.in);
        int sayi;

      /*  for (boolean run = true; run; ) {
            System.out.print("Sayi giriniz: ");
            sayi = inp.nextInt();
            if (sayi < 0) {
                run = false;
            }
        } */

        do {
            System.out.print("Sayi Giriniz : ");
            sayi = inp.nextInt();
        }
        while (sayi > 0);


    }
}
