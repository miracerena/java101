package src;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args){
        int ebob = 1, ekok = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayinizi giriniz: ");
        int n1 = inp.nextInt();
        System.out.print("n2 sayinizi giriniz: ");
        int n2 = inp.nextInt();

        if (n1 > n2) {
            for (int i = 1; i <= n2; i++){
                if((n1%i == 0) && (n2%i ==0)){
                    ebob = i;
                }
            }
            System.out.println("Ebob: " + ebob);
        }else{
            for (int i = n1; i >= 1; i--){
                if((n1%i == 0) && (n2%i ==0)){
                    ebob = i;
                    break;
                }
            }
            System.out.println("Ebob: " + ebob);
        }
        for (int i = 1; i <= (n1*n2); i++){
            if ((i%n1 == 0)&&(i%n2== 0)){
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok: " + ekok);
    }
}
