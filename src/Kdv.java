import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
                double tutar, kdvOran1 = 0.18, kdvOran2 = 0.8;
                Scanner input = new Scanner(System.in);

                System.out.print("Urunun Fiyatini Giriniz : ");
                tutar = input.nextDouble();

                double kdvTutar = tutar > 1000 ? tutar * kdvOran2 : tutar * kdvOran1;
                double kdvliTutar = (tutar + kdvTutar );

                double oran = tutar < 1000 ? kdvOran1 : kdvOran2;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
        System.out.println("KDV Tutari : " + kdvTutar);
        System.out.println("KDV Orani : " + oran);





    }
}
/* https://app.patika.dev/miracerena*/
