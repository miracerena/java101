package src;

import java.util.Scanner;

public class UsHesap {
    static int power(int taban, int us){
        if (taban == 1 || us == 0){
            return 1;
        } else if (taban == 0) {
            return 0;
        }
        return taban * power(taban, (us -1));
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int taban, us;

        System.out.print("Taban Degeri Giriniz: ");
        taban = inp.nextInt();
        System.out.print("Us Degerini Giriniz: ");
        us = inp.nextInt();

        System.out.println(taban+"^"+us+"=" + power(taban,us) );



    }

}
