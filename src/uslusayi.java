package src;

import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        int n, k, total=1, i=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n = inp.nextInt();
        System.out.print("Us Olacak Sayiyi Giriniz: ");
        k = inp.nextInt();

       /* while (i<=k){
            total*=n;
            i++;
        }
        System.out.println("Cevap: "+total ); */

        for(;i<=k; i++) {
            total*=n;
        }
        System.out.println("Cevap: " +total);

    }
}
//https://app.patika.dev/miracerena
