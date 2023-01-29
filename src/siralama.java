package src;

import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp =new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz: ");
        a = inp.nextInt();

        System.out.print("2. Sayiyi Giriniz: ");
        b = inp.nextInt();

        System.out.print("3. Sayiyi Giriniz: ");
        c = inp.nextInt();

        if ((a > b && a > c)) {
            if (b > c) {
                System.out.print("a > b > c");
            } else {
                System.out.print("a > c > c");
            }
        } else if ((b > a && b > c)) {
            if (a > c){
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (a > b){
            System.out.print("c > a > b");
            }else {
                System.out.print("c > b > a");
            }

        }

    }
}
