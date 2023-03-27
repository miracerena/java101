package src;

public class palindromSayilar {
    //Palindromik sayi iki taraftan da okunusu ayni olan sayidir.(1,8,101,4004...)

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            return true;

        } else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isPalindrom(202));
    }
}
//https://app.patika.dev/miracerena
