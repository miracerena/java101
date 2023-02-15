package src;

import java.util.Scanner;

public class whileDongu {
    public static void main(String[] args) {
        /* int i = 1;
           int k;
           while(i <= 5) {
                System.out.println(i);
                i++;
                while(k <= 10) {
                 System.out.print(k + ",");
                 k++;
         */
      /*  int password;
        boolean isPasswordSuccess = true;

        Scanner inp = new Scanner(System.in);

        while (isPasswordSuccess) {
            System.out.print("Sifrenizi Giriniz : ");
            password = inp.nextInt();

            if (password == 2691) {
                System.out.println("Giris Yaptiniz :)");
                isPasswordSuccess = false;
            } else {
                System.out.println("Hatali Giris Yaptiniz. Tekrar Deneyiniz...");
            }
        } */
        Scanner inp = new Scanner(System.in);
        int pass;
        boolean askPass = true;

        do {
            System.out.print("Parolanizi giriniz: ");
            pass = inp.nextInt();
            if (pass == 2691) {
                System.out.print("Giris Yaptiniz.");
                askPass = false;
            } else {
                System.out.println("Hatali Giris Yaptiniz.");
            }
        }  while (askPass);

    }
}
//https://app.patika.dev/miracerena
