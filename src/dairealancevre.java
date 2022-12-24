import java.sql.SQLOutput;
import java.util.Scanner;
public class dairealancevre {
    public static void main(String[] args) {
        /* int r;
        double pi = 3.14, alan, cevre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz : ");
        r = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alani : " + alan);
        System.out.print("Dairenin cevresi : " + cevre);

    }
}
 */
        int r, a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);

        System.out.print("Daire diliminin yari capini giriniz : ");
        r = inp.nextInt();
        System.out.print("Daire Diliminin merkez acisini giriniz : ");
        a = inp.nextInt();

        double alan = (pi * (r * r) * a) / 360;

        System.out.println("Daire Diliminin alani : " + alan);
    }
}