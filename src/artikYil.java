package src;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int yil, kalan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil = inp.nextInt();

        kalan = yil%400;

        if (yil % 100 == 0 ) {
            if (kalan == 0) {
                System.out.print(yil + " Artik Yildir.");
            }else{
                System.out.print(yil + " Artik Yil Degildir.");
            }
        }else if (yil % 4 == 0) {
            System.out.print(yil+ " Artik yildir.");
        } else {
            System.out.print(yil + " Artik Yil Degildir.");
        }
    }
    }

