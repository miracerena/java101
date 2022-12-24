import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        double kenar1, kenar2, hipotenus;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Kenarin Uzunlugunu Giriniz :");
        kenar1 = inp.nextDouble();
        System.out.print("2. Kenarin Uzunlugunu Giriniz : ");
        kenar2 = inp.nextDouble();

        hipotenus = (Math.sqrt((kenar2 * kenar2) + (kenar1 * kenar1)));
        System.out.print("Hipotenus : " + hipotenus);






    }
}
