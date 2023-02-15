package src;

import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {
         //harmonik seri formulu 1+1/2+1/3+1/4+.....+1/n
        int n;
        double result = 0.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir n sayisi giriniz: ");
        n = inp.nextInt();

        for (double i = 1; i<=n; i++) {
            result +=(1/i);
        }
        System.out.println(result);

    }
}
//https://app.patika.dev/miracerena
