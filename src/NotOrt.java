import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
            int mat, fiz, kim, biy, tarih, turkce, muzik;

            Scanner inp = new Scanner(System.in);

            System.out.print("Matematik Notunuzu Giriniz : ");
            mat = inp.nextInt();

            System.out.print("Fizik Notunuzu Giriniz : ");
            fiz = inp.nextInt();

            System.out.print("Kimya Notunuzu Giriniz : ");
            kim = inp.nextInt();

            System.out.print("Biyoloji Notunuzu Giriniz : ");
            biy = inp.nextInt();

            System.out.print("Tarih Notunuzu Giriniz : ");
            tarih = inp.nextInt();

            System.out.print("Turkce Notunuzu Giriniz : ");
            turkce = inp.nextInt();

            System.out.print("Muzik Notunuzu Giriniz : ");
            muzik = inp.nextInt();

            int toplam = (mat + fiz + kim + biy + tarih + turkce + muzik);
            double sonuc = toplam / 7;
            boolean gecti = sonuc > 60;
            String gec = gecti ? " Gecti" : " Gecemedi" ;

            System.out.print("Not Ortalamaniz :" + sonuc + gec);


        }
    }
    /* https://app.patika.dev/miracerena*/