package src;

import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int derece;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz :");
        derece = input.nextInt();

        if (derece < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz :)");
        } else if (derece >= 5 && derece <= 25) {
            if (derece <= 15) {
                System.out.println("Sinemaya gidebilirsiniz...") ;
            }
            if (derece >= 10) {
                System.out.println("Piknige gidebilirsiniz...");
            }
        }else {
                System.out.println("Yuzmeye Gidebilirsiniz...");
            }

        }
    }

