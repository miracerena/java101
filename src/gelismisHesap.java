package src;

import java.util.Scanner;

public class gelismisHesap {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Cikarma: " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Carpim: " + result);
        return result;
    }
    static int divided(int a, int b){
        if (b==0){
            System.out.println("Ikinci sayi sifirdan farkli olmali.");
            return 0;
        }
        int result = a/b;
        System.out.println("Bolum: " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i =1; i<=b; i++ ){
            result *= a;
        }
        System.out.println("Us Hesabi: " + result);
        return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Dikdortgenin Cevresi : " + (2*(a+b)));
        System.out.println("Dikdortgenin Alani: " + (a * b));
    }


    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1-Toplama Islemi\n" +
                "2-Cikarma Islemi\n" +
                "3-Carpma Islemi\n" +
                "4-Bolme Islemi\n" +
                "5-Us Alma\n" +
                "6-Mod Alma\n" +
                "7-Dikdortgen Alan Ve Cevre Hesabi\n" +
                "8-Cikis Yap" ;
        System.out.println(menu);
        while (true){
            System.out.print("Bir Islem Seciniz: ");
            select = inp.nextInt();
            if (select == 8){
                break;
            }
            System.out.print("Ilk Sayi: ");
            int a = inp.nextInt();
            System.out.print("Ikinci Sayi: ");
            int b = inp.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    System.out.println("Mod Islemi: " + mod(a,b));
                    break;
                case 7 :
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz.");
            }

        }

    }

}
