import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domat = 1.11, muz = 0.95, patli = 5.0, aKg, eKg, dKg, mKg, pKg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kac kilo armut aldiniz ? ");
        aKg = inp.nextDouble();
        System.out.print("Kac kilo elma aldiniz ? ");
        eKg = inp.nextDouble();
        System.out.print("Kac kilo domates aldiniz ? ");
        dKg = inp.nextDouble();
        System.out.print("Kac kilo muz aldiniz ? ");
        mKg = inp.nextDouble();
        System.out.print("Kac kilo patlican aldiniz ? ");
        pKg = inp.nextDouble();

        double tutar = (armut * aKg) + (elma * eKg) + (domat * dKg) + (muz * mKg) + (patli * pKg);

        System.out.print("Odenecek toplam tutar : " + tutar);


    }
}
/* https://app.patika.dev/miracerena*/
