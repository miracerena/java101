package src;

import java.util.Scanner;

public class ciftOrt {
    public static void main(String[] args) {
        int i, top = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz: ");
            i = inp.nextInt();
            if ((i % 2 == 0 ) && (i % 4 == 0)) {
            top += i; }
        } while (!(i % 2==1));
        System.out.print("Toplam : " + top );

    }
}
//https://app.patika.dev/miracerena
