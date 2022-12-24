import java.util.Scanner;
public class vkitleindeks {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz(boyunuzu virgul koyarak metre cinsinden giriniz): ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.print("Vucut Kitle Indeksiniz : " + vki);



    }

}
