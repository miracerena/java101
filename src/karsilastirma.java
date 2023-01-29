package src;

public class karsilastirma {
    public static void main(String[] args) {
       /* int a = 50, b = 50;
        boolean compare = a == b;

        if (compare) {
            a = 30;
            System.out.println("a sayisi : " + a);
            System.out.println("Esittir");
        } else {
            System.out.println("Esit degildir");
        }
        System.out.println("Program Bitti...");
        } */
   // else if bloklari
        int a = 3, b = 8, c = 1;

        if (( a < c) && ( a < b )) {
            System.out.println("A en kucuk sayidir.");
        } else if ((c < b) && (c < a )) {
            System.out.println("C en kucuk sayidir.");
        }
        else {
            System.out.println("B en kucuk sayidir.");
        }
    }

}

