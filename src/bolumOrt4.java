package src;

import java.util.Scanner;

public class bolumOrt4 {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {

        System.out.println("4'un kuvvetleri : " + i); }

            for (int j = 1; j <= n; j *= 5) {
                System.out.println("5'in kuvvetleri : " + j); }
        }
    }
//https://app.patika.dev/miracerena