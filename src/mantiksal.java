package src;

public class mantiksal {
    public static void main(String[] Args) {
        int a = 10, b = 20, c = 5, d;
// && Operatoru
        boolean kosul1 = (a > b );
        boolean kosul2 = (a > c );
        boolean sonuc = kosul1 && kosul2;
        System.out.println(sonuc);
// || Operatoru
        boolean sonuc2 = kosul1 || kosul2;
        System.out.println(sonuc2);
// ! Operator
        boolean sonuc3 = !(kosul1 && kosul2);
        System.out.println(sonuc3);
// ? Operatoru
        d = ( a == b ) ? 2 : 7;
        System.out.println(d);


    }
}
