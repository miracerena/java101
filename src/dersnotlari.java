package src;

import java.util.Scanner;

public class dersnotlari {
    public static void main(String[] args) {
        int mat, turkce, kim, fiz, biy;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = inp.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biy = inp.nextInt();

        double avarage = (mat + turkce + kim + fiz + biy) / 5;

        if (avarage <= 55) {
            System.out.println("Sinifta kaldiniz :(");
        }
        else {
            System.out.println("Tebrikler sinifi gectiniz :)");
        }
    }


}
//https://app.patika.dev/miracerena