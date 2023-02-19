package src;


import java.util.Scanner;

public class yildizElmas {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Giriniz : ");
        int n = inp.nextInt();

        for (int i = 1; i<=(n+1)/2; i++){
            for (int k = 1; k<=((n+1)/2)-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = ((n+1)/2)-1; i>=1; i--){
            for (int k=((n+1)/2)-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j=(2*i)-1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
//https://app.patika.dev/miracerena

