package src;

import java.util.Scanner;

public class basitKullanici {
    public static void main(String[] args){
        String userName, password;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adi : ");
        userName = inp.nextLine();
        System.out.println("Sifreniz : ");
        password = inp.nextLine();

        if (userName.equals("miracerena") && password.equals("mca1012")) {
            System.out.println("Giris Yaptiniz :)");
        }
        else {
            System.out.println("Hatali Giris Tekrar Deneyiniz :(");
        }
    }

}
//https://app.patika.dev/miracerena
