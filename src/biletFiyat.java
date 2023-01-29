package src;

import java.util.Scanner;

public class biletFiyat {
    public static void main(String[] args) {
        int yas, mesafe, yolculukTipi;
        double toplamTutar, yasIndirimi, tipIndirimi;
        String biletFiyat = "";

        Scanner inp = new Scanner(System.in);
        System.out.print("Yasiniz giriniz : ");
        yas = inp.nextInt();
        System.out.print("Gideceginiz mesafeyi km olarak giriniz : ");
        mesafe = inp.nextInt();
        System.out.print("Yolculuk tercihinizi giriniz(tek yon = 1, gidis-donus = 2 : ");
        yolculukTipi = inp.nextInt();

        toplamTutar = mesafe * 0.10;

        if (yas >= 0 && mesafe >= 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            System.out.println("Toplam Tutar = " + toplamTutar);
        } else {
            System.out.println("Hatali giris yaptiniz !");
        }
        if (yas < 12) {
            yasIndirimi = toplamTutar * 0.5;
            System.out.print("Bilet Fiyati : " + (toplamTutar - yasIndirimi));
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = toplamTutar * 0.10;
            System.out.print("Indirimli Bilet Fiyati : " + (toplamTutar - yasIndirimi));
        } else if (yas > 65) {
            yasIndirimi = toplamTutar * 0.30;
            System.out.print("Indirimli Bilet Fiyati : " + (toplamTutar - yasIndirimi));
        } else if (yolculukTipi == 2) {
            tipIndirimi = toplamTutar * 0.2;
            System.out.print("Indirimli Bilet Fiyati : " + (toplamTutar - tipIndirimi));
        } else {
            System.out.print("Indiriminiz yoktur.");
        }

    }
    }
//https://app.patika.dev/miracerena