package src;

import java.util.Scanner;

public class atmProgrami {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 3000;
        int select;
        int price;
        Scanner inp = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz: ");
            userName = inp.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            password = inp.nextLine();
            if (userName.equals("miracerena") && password.equals("101297")) {
                System.out.print("Bankamiza Hosgeldiniz.");

                do {
                    System.out.println("1.Para Yatirma\n" + "2.Para Cekme\n" + "3.Bakiye Sorgulama\n" + "4.Cikis yap");
                    System.out.print("Lutfen yapmak istediniz islemi seciniz: ");
                    select = inp.nextInt();
                    if (select == 1) {
                        System.out.print("Yatirmak istediginiz miktar : ");
                        price = inp.nextInt();
                        balance += price;
                        System.out.println("Yeni bakiyeniz: " + balance);
                    } else if (select == 2) {
                        System.out.print("Cekmek istediniz miktar: ");
                        price = inp.nextInt();
                        if (balance < price) {
                            System.out.print("Yetersiz bakiye.");
                        } else {
                            balance -= price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }

                } while (select != 4);
                System.out.print("Tekrar gorusmek uzere.");
                break;

            }else{
                    right--;
                    System.out.print("Hatali giris yaptiniz. Lutfen tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Ust uste hatali giris yaptiginiz icin hesabiniz bloke olmustur.");
                    } else {
                        System.out.println("Kalan hakkiniz: " + right);
                    }
                }


        }
    }
}
