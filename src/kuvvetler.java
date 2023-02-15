package src;

import java.util.Scanner;

public class kuvvetler {
    public static void main(String[] args) {
        int m;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        m = inp.nextInt();

        for(int i = 1; i<= m; i*=2) {
            System.out.println(i);
        }

    }
}
//https://app.patika.dev/miracerena
