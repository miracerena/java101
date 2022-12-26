import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int km, total = 10 ;
        double perKm = 2.20 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen kmyi giriniz :");
        km = inp.nextInt();

        total += km * perKm;
        total = (total < 20) ? 20 : total;

        System.out.print("Toplam Tutar : " + total );



    }
}
/* https://app.patika.dev/miracerena
