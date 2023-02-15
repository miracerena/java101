package src;

import java.util.Scanner;

public class kombinasyonFak {
    public static void main(String[] args) {
        int n=0, m=0, total1=1, total2=1, total3=1;
        double com;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ilk sayinizi giriniz : ");
        n = inp.nextInt();
        System.out.print("Ikinci sayinizi giriniz : ");
        m = inp.nextInt();

        for (int i = 1; i <=n; i++) {
            total1*=i;
        }
        System.out.println(n + ".Faktoriyel: " + total1);
        for (int i = 1; i <=m; i++) {
            total2*=i;
        }
        System.out.println(m + ".Faktoriyel: " + total2);
        for (int i = 1; i <=(n-m); i++ ) {
            total3*=i;
        }

        com = total1/((total2)*total3);
        System.out.println("Kombinasyon : " + com);
    }
}
//https://app.patika.dev/miracerena
